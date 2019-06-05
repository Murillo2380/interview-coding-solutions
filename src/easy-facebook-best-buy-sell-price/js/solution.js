"use strict";
const stockPrices = [9, 11, 8, 5, 7, 10];

function findMaximum(startIndex, values) {
    let max = null;
    for (let i = startIndex; i < values.length; i++) {
        if (max === null) max = values[i];
        else if (max < values[i]) max = values[i];
    }
    return max;
}

/**
 *
 * @param {[number]} values
 */
function solve(values) {
    let bestProfit = null;

    for (let i = 0; i < values.length - 1; i++) {
        const max = findMaximum(i + 1, values);
        const profit = max - values[i];

        if (bestProfit === null) bestProfit = profit;
        else if (bestProfit < profit) bestProfit = profit;
    }

    return bestProfit;
}

console.log(solve(stockPrices)); // 5
