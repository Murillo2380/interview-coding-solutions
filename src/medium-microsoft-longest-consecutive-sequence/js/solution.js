"use strict";

/**
 *
 * @param {string[]} numbers
 */
function solve(numbers) {
    const exists = {};

    numbers.forEach(number => (exists[number] = true));

    let greaterLen = 1;
    numbers.forEach(number => {
        if (exists[number - 1]) return;
        let count = 0;

        while (exists[number++]) count++;

        greaterLen = Math.max(count, greaterLen);
    });
    return greaterLen;
}

console.log(solve([100, 4, 200, 1, 3, 2])); // 4
console.log(solve([100, 4, 200, 1, 2, 3])); // 4
console.log(solve([100, 2, 200, 1, 4, 3])); // 4
console.log(solve([100, 2, 5, 1, 4, 3])); // 5
console.log(solve([100, 2, 5, 1, -1, 3])); // 3
console.log(solve([36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42])); // 5
console.log(solve([1, 9, 3, 10, 4, 20, 2])); // 4
