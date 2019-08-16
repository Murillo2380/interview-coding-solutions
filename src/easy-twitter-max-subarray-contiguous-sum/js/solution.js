"use strict";

/**
 *
 * @param {number[]} numbers
 */
function solve(numbers) {
    let max = 0;
    let total = 0;

    numbers.forEach(number => {
        if (total + number > 0) total += number;
        else total = 0;
        if (total > max) max = total;
    });

    return max;
}

console.log(solve([34, -50, 42, 14, -5, 86]));
