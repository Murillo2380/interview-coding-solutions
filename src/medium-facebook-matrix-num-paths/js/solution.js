/* 2x2 = 2
0   0
0   0
*/

/* 2x3 = 3 ; s(2, 3) = s(1, 3) + s(2, 2) 
0   0   0
0   0   0
*/

/* 2x4 = 4 ; s(2, 4) = s(1, 4) + s(2, 3) = 4
0   0   0   0
0   0   0   0
*/

/* 2x5 = 5 ; s(1, 5) + s(2, 4)
0   0   0   0   0
0   0   0   0   0
*/

/*  3x3 = 6; S(3,3) = S(2,3) + S(3,2)
0   0   0
0   0   0
0   0   0
*/

/* 3x4 = s(2, 4) + s(3, 3) = 10
0   0   0   0
0   0   0   0
0   0   0   0
*/

/* 3x5 = s(2, 5) + s(3, 4) = 15
0   0   0   0   0
0   0   0   0   0
0   0   0   0   0
*/

/* 4x2 = s(3, 2) + s(4, 1) = 4
0   0
0   0
0   0
0   0
*/

/* 4x4 = s(3, 4) + s(4, 3) = 20
0   0   0   0
0   0   0   0
0   0   0   0
0   0   0   0
*/

/* 4x5 = s(3, 5) + s(4, 4) = 35
0   0   0   0   0
0   0   0   0   0
0   0   0   0   0
0   0   0   0   0
*/

/* 5x5 = s(4, 5) + s(5, 4) = 70
0   0   0   0   0
0   0   0   0   0
0   0   0   0   0
0   0   0   0   0
0   0   0   0   0
*/

function numPaths(numRows, numColumns) {
    const greater = Math.max(numRows, numColumns);
    const solutions = new Array(greater)
        .fill(0)
        .map(() => new Array(greater).fill(0));

    for (i = 0; i < numRows; i++) {
        for (j = 0; j < numColumns; j++) {
            if (i === 0 || j === 0) {
                solutions[i][j] = 1;
                solutions[j][i] = 1;
            } else {
                const result = solutions[i - 1][j] + solutions[i][j - 1];
                solutions[i][j] = result;
            }
        }
    }

    return solutions[numRows - 1][numColumns - 1];
}

console.log(numPaths(5, 5)); // 70
console.log(numPaths(2, 2)); // 2
console.log(numPaths(3, 5)); // 15
