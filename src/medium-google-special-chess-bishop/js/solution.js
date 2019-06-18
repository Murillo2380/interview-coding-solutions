"use strict";
/**
 * @typedef {Object} Bishop
 * @property {number} row
 * @property {number} column
 */

/**
 * @param {Bishop} bishop1
 * @param {Bishop} bishop2
 */
function isAttacking(bishop1, bishop2) {
    const rowDiff = Math.abs(bishop1.row - bishop2.row);
    const columnDiff = Math.abs(bishop1.column - bishop2.column);
    return rowDiff === columnDiff;
}

/**
 *
 * @param {[Bishop]} bishops
 */
function countAttacks(bishops) {
    let attackCount = 0;
    for (let i = 0; i < bishops.length; i++) {
        for (let j = i + 1; j < bishops.length; j++) {
            if (isAttacking(bishops[i], bishops[j])) attackCount++;
        }
    }
    return attackCount;
}

/*
[b 0 0 0 0]
[0 b b 0 0]
[0 0 b 0 0]
[0 0 0 0 0]
[b 0 0 0 0]
*/

const bishops1 = [
    { row: 0, column: 0 },
    { row: 1, column: 2 },
    { row: 1, column: 1 },
    { row: 2, column: 2 },
    { row: 4, column: 0 }
];

/*
[b 0 0 0 0]
[0 0 b 0 0]
[0 0 b 0 0]
[0 0 0 0 0]
[b 0 0 0 0]
*/
const bishops2 = [
    { row: 0, column: 0 },
    { row: 1, column: 2 },
    { row: 2, column: 2 },
    { row: 4, column: 0 }
];

console.log(countAttacks(bishops1)); // 5
console.log(countAttacks(bishops2)); // 2
