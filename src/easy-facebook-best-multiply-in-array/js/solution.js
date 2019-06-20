"use strict";
/**
 *
 * @param {number[]} numbers
 */
function solve(numbers) {
    let greater = null;

    for (let i = 0; i < numbers.length - 2; i++) {
        for (let j = i + 1; j < numbers.length - 1; j++) {
            const parcialResult = numbers[i] * numbers[j];

            for (let k = j + 1; k < numbers.length; k++) {
                const finalResult = parcialResult * numbers[k];
                if (greater === null) greater = finalResult;
                if (greater < finalResult) greater = finalResult;
            }
        }
    }
    return greater;
}

const test = [-10, -10, 5, 2];
const test2 = [-10, 10, 5, 2];
const test3 = [-20, -10, -5, -2];

console.log(solve(test)); // 500
console.log(solve(test2)); // 100
console.log(solve(test3)); // -100
