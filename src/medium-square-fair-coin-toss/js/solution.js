"use strict";

/**
 * Biased function. For testing purposes, the propability is 20-80
 */
function toss_biased() {
    return Math.random() < 0.2 ? 0 : 1;
}

function toss_unbiased() {
    let toss1;
    let toss2;

    do {
        toss1 = toss_biased();
        toss2 = toss_biased();
    } while (toss1 === toss2);

    return toss1;
}

// test
let count0 = 0;
for (let i = 0; i < 10000; i++) {
    const toss = toss_biased();
    // console.log(toss);
    if (toss === 0) count0++;
}

console.log(`0 appeared ${count0} times`); // should be near 2000

// test
count0 = 0;
for (let i = 0; i < 10000; i++) {
    const toss = toss_unbiased();
    // console.log(toss);
    if (toss === 0) count0++;
}

console.log(`0 appeared ${count0} times`); // should be near 5000
