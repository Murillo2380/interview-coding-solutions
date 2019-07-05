"use strict";

/**
 *
 * @param {number} column
 * @param {string[][]} matrix
 */
function isColumnSorted(column, matrix) {
    for (let i = 1; i < matrix.length; i++)
        if (matrix[i][column] <= matrix[i - 1][column]) return false;

    return true;
}

/**
 *
 * @param {string[][]} matrix
 */
function solve(matrix) {
    let count = 0;
    for (let i = 0; i < matrix[0].length; i++)
        if (!isColumnSorted(i, matrix)) count++;

    return count;
}

const matrix1 = [["c", "b", "a"], ["d", "a", "f"], ["g", "h", "i"]];
const matrix2 = [["a", "b", "c", "d"]];
const matrix3 = [["z", "y", "x"], ["w", "v", "u"], ["t", "s", "r"]];

console.log(solve(matrix1));
console.log(solve(matrix2));
console.log(solve(matrix3));
