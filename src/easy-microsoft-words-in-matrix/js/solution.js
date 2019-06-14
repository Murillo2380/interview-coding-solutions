"use strict";

function isValid(numRows, numColums, i, j) {
    return i < numRows && j < numColums;
}
/**
 *
 * @param {string[][]} matrix
 * @param {number} i
 * @param {number} j
 * @param {string} letter
 */
function matches(matrix, i, j, letter) {
    const numRows = matrix.length;
    const numColums = matrix[0].length;
    return isValid(numRows, numColums, i, j) && matrix[i][j] === letter;
}

/**
 *
 * @param {string[][]} matrix
 * @param {number} startI
 * @param {number} startJ
 * @param {string[]} letters
 */
function checkRow(matrix, startI, startJ, letters) {
    let numMatches = 0;
    let currentLetter = 0;
    while (
        currentLetter < letters.length &&
        matches(
            matrix,
            startI + currentLetter,
            startJ,
            letters[currentLetter++]
        )
    ) {
        numMatches++;
    }
    return numMatches === letters.length;
}

/**
 *
 * @param {string[][]} matrix
 * @param {number} startI
 * @param {number} startJ
 * @param {string[]} letters
 */
function checkColumn(matrix, startI, startJ, letters) {
    let numMatches = 0;
    let currentLetter = 0;
    while (
        currentLetter < letters.length &&
        matches(
            matrix,
            startI,
            startJ + currentLetter,
            letters[currentLetter++]
        )
    ) {
        numMatches++;
    }
    return numMatches === letters.length;
}
/**
 *
 * @param {string[][]} matrix
 * @param {string} text
 */
function hasText(matrix, text) {
    const letters = text.split("");

    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix.length; j++) {
            if (
                checkColumn(matrix, i, j, letters) ||
                checkRow(matrix, i, j, letters)
            )
                return true;
        }
    }

    return false;
}

const testMatrix = [
    ["F", "A", "C", "I"],
    ["O", "B", "Q", "P"],
    ["A", "N", "O", "B"],
    ["M", "A", "S", "S"]
];

console.log(hasText(testMatrix, "MASS")); // true
console.log(hasText(testMatrix, "ABNA")); // true
console.log(hasText(testMatrix, "CI")); // true
console.log(hasText(testMatrix, "ACJ")); // false
console.log(hasText(testMatrix, "PK")); // false
console.log(hasText(testMatrix, "ZI")); // false
