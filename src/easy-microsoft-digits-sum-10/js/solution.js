"use strict";

// 19    28    37    46    55    64    73    82    91    109    118    127    136    145    154    163    172    181    190    208    802    901    910    1009    9
// 1     2     3     4     5     6     7     8     9     10     11     12     13     14     15     16     17     18     19     20     ...

function digitsSumTo(num, sumTarget) {
    let sum = 0;
    for (let n = num; n > 0; n = Math.floor(n / 10)) sum += n % 10;
    return sum === sumTarget;
}

function findPerfectNumber(n) {
    let count = 0;
    let current = 10;

    while (count < n) {
        current += 9;
        if (digitsSumTo(current, 10)) count++;
    }

    return current;
}

console.log(findPerfectNumber(1)); // 19
console.log(findPerfectNumber(2)); // 28
console.log(findPerfectNumber(3)); // 37
console.log(findPerfectNumber(5)); // 55
console.log(findPerfectNumber(12)); // 127
console.log(findPerfectNumber(20)); // 208
console.log(findPerfectNumber(2845)); // 520201
console.log(findPerfectNumber(2846)); // 520210
console.log(findPerfectNumber(2847)); // 520300
