function dividePositives(x, y) {
    let answer = 0;
    let current = 1;

    while (y < x) {
        let shifted = y << 1;
        if (shifted >> 1 !== y) shifted = ~shifted;
        y = shifted;
        current <<= 1;
    }

    current >>= 1;
    y >>= 1;

    while (current > 0) {
        if (x >= y) {
            x -= y;
            answer |= current;
        }

        current >>= 1;
        y >>= 1;
    }

    return answer;
}

function divide(x, y) {
    const intMinValue = -0x80000000;
    const intMaxValue = 0x7fffffff;

    if (y === 0) return NaN;
    if (x === y) return 1;
    if (y === 1) return x;
    if (x === intMinValue && y === -1) return intMaxValue; // 32 bit overflow
    if (y === -1) return -x;
    if (x > 0 && y > x) return 0;
    if (x < 0 && y < x) return 0;
    if (x === intMinValue && y > 0) return NaN;

    let isResultNegative = false;

    if (x < 0) {
        x = -x;
        isResultNegative = !isResultNegative;
    }

    if (y < 0) {
        y = -y;
        isResultNegative = !isResultNegative;
    }

    let res = dividePositives(x, y);
    if (isResultNegative) res = -res;

    return res;
}

console.log(divide(10, 2), 10 / 2); // 5
console.log(divide(10, -2), 10 / -2); // -5
console.log(divide(10, 3), 10 / 3); // 3
console.log(divide(50, 4), 50 / 4); // 12
console.log(divide(-50, 4), -50 / 4); // -12
console.log(divide(171, 3), 171 / 3); // 57
console.log(divide(207, 20), 207 / 20); // 10
console.log(divide(6351, 41), 6351 / 41); // 154
console.log(divide(2147483647, 2), 2147483647 / 2); // 1073741823
console.log(divide(2147483647, 3), 2147483647 / 3); // fail edge case
console.log(divide(-2147483648, 3), 2147483647 / 3); // fail edge case
