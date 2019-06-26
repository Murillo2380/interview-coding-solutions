"use strict";
// TODO BE IMPLEMENTED

function isValid(i, j, n, visited) {
    return i >= 0 && j >= 0 && i < n && j < n && !visited[i][j];
}

/**
 *
 * @param {Pos} currentPosition
 * @param {number} n
 * @param {boolean[][]} visited
 */
function solve(i, j, n, visited = new Array(n).fill(new Array(n))) {
    let hasEnded = true;

    if (!isValid(i, j, n, visited)) return 0;

    visited[i][j] = true;
    visited.forEach(row => {
        if (row.some(val => val === false)) hasEnded = false;
    });

    if (hasEnded) return 1;

    const possibilities = [];
    possibilities.push(solve(i + 1, j, n, visited.map(arr => arr.slice())));
    possibilities.push(solve(i - 1, j, n, visited.map(arr => arr.slice())));
    possibilities.push(solve(i, j + 1, n, visited.map(arr => arr.slice())));
    possibilities.push(solve(i, j - 1, n, visited.map(arr => arr.slice())));

    return possibilities.reduce((total, current) => (total += current), 0);
}

console.log(solve(0, 0, 4));
