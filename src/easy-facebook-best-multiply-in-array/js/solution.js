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

/**
 *
 * @param {number[]} numbers
 */
function solve2(numbers) {
    let greaterIndexes = [-1, -1, -1];
    let smallerNegativeIndexes = [-1, -1];
    let greaterNegativeIndexes = [-1, -1, -1];

    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] > 0) {
            if (
                greaterIndexes[0] === -1 ||
                numbers[greaterIndexes[0]] < numbers[i]
            ) {
                greaterIndexes[2] = greaterIndexes[1];
                greaterIndexes[1] = greaterIndexes[0];
                greaterIndexes[0] = i;
            } else if (
                greaterIndexes[1] === -1 ||
                numbers[greaterIndexes[1]] < numbers[i]
            ) {
                greaterIndexes[2] = greaterIndexes[1];
                greaterIndexes[1] = i;
            } else if (
                greaterIndexes[2] === -1 ||
                numbers[greaterIndexes[2]] < numbers[i]
            ) {
                greaterIndexes[2] = i;
            }

            continue;
        }

        if (
            smallerNegativeIndexes[0] === -1 ||
            numbers[smallerNegativeIndexes[0]] > numbers[i]
        ) {
            smallerNegativeIndexes[1] = smallerNegativeIndexes[0];
            smallerNegativeIndexes[0] = i;
        } else if (
            smallerNegativeIndexes[1] === -1 ||
            numbers[smallerNegativeIndexes[1]] > numbers[i]
        ) {
            smallerNegativeIndexes[1] = i;
        }

        if (
            greaterNegativeIndexes[0] === -1 ||
            numbers[greaterNegativeIndexes[0]] < numbers[i]
        ) {
            greaterNegativeIndexes[2] = greaterNegativeIndexes[1];
            greaterNegativeIndexes[1] = greaterNegativeIndexes[0];
            greaterNegativeIndexes[0] = i;
        } else if (
            greaterNegativeIndexes[1] === -1 ||
            numbers[greaterNegativeIndexes[1]] < numbers[i]
        ) {
            greaterNegativeIndexes[2] = greaterNegativeIndexes[1];
            greaterNegativeIndexes[1] = i;
        } else if (
            greaterNegativeIndexes[2] === -1 ||
            numbers[greaterNegativeIndexes[2]] < numbers[i]
        ) {
            greaterNegativeIndexes[2] = i;
        }
    }

    if (greaterIndexes[0] === -1) {
        // does not have any positive number in the array
        return (
            numbers[greaterNegativeIndexes[2]] *
            numbers[greaterNegativeIndexes[1]] *
            numbers[greaterNegativeIndexes[0]]
        );
    }

    const option1 =
        numbers[greaterIndexes[0]] *
        smallerNegativeIndexes.reduce((total, i) => total * numbers[i], 1);

    if (greaterIndexes.some(val => val === -1)) return option1;

    const option2 = greaterIndexes.reduce((total, i) => total * numbers[i], 1);
    return option1 > option2 ? option1 : option2;
}

const test = [-10, -10, 5, 2];
const test2 = [-10, 10, 5, 2];
const test3 = [-20, -10, -5, -2];
const test4 = [-10, -9, -8, -7, -3, -2, -1, 0, 1, 2, 3, 20, 21, 22];

console.log(solve(test)); // 500
console.log(solve(test2)); // 100
console.log(solve(test3)); // -100
console.log(solve(test4)); // 9240

console.log("=====");

console.log(solve2(test)); // 500
console.log(solve2(test2)); // 100
console.log(solve2(test3)); // -100
console.log(solve2(test4)); // 9240
