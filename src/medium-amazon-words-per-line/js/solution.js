"use strict";

/**
 *
 * @param {string} line
 * @param {string} word
 * @param {boolean} considerSpace
 * @param {number} maxLineLenght
 */
function isPossibleToConcat(line, word, considerSpace, maxLineLenght) {
    if (considerSpace) maxLineLenght--;
    return line.length + word.length <= maxLineLenght;
}

/**
 *
 * @param {[string]} words
 * @param {number} maxLineLenght
 * @param {number} startIndex
 */
function makeLine(words, maxLineLenght, startIndex) {
    let line = "";
    let index = startIndex;
    while (index < words.length) {
        if (
            isPossibleToConcat(
                line,
                words[index],
                line.length > 0,
                maxLineLenght
            )
        ) {
            if (line.length === 0) line += words[index++];
            else line += " " + words[index++];
        } else break;
    }
    return { line, stopIndex: index };
}

/**
 *
 * @param {string} text
 * @param {number} maxLineLength
 */
function breakLines(text, maxLineLength) {
    const words = text.split(" ");
    const lines = [];
    let index = 0;
    while (index < words.length) {
        const { line, stopIndex } = makeLine(words, maxLineLength, index);
        if (line.length > 0) lines.push(line);
        if (stopIndex === index) break;
        index = stopIndex;
    }
    return (lines.length > 0 && lines) || null;
}

// test
const testString = "the quick brown fox jumps over the lazy dog";
console.log(breakLines(testString, 3));
