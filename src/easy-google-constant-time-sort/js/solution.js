"use strict";

/**
 *
 * @param {number[]} numbers
 */
function mySort(numbers) {
    const count = { 1: 0, 2: 0, 3: 0 };
    numbers.forEach(number => count[number]++);
    let current = 0;
    let index = 1;
    while (current < numbers.length) {
        while (count[index] === 0) index++;
        count[index]--;
        numbers[current++] = index;
    }
}

const test = [3, 3, 2, 1, 3, 2, 1];
mySort(test);
console.log(test); // [1, 1, 2, 2, 3, 3, 3]

const test2 = [3, 3, 3, 1, 3, 3, 1];
mySort(test2);
console.log(test2); // [ 1, 1, 3, 3, 3, 3, 3 ]
