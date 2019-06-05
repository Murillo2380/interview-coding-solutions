"use strict";

const MY_DUMMY_URL = "http://localhost.com";

/**
 *
 * @param {number} id Number to convert
 * @returns The reversed number in 62 format.
 */
function convertIdToShortenUrl(id) {
    // 102 = 1 * 62^1 + 40 * 62^0 = bO
    // 125 = 2 * 62^1 + 1 * 62^0 = cb

    const algarisms =
        "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    let url = "";
    while (id > 0) {
        const algarismIndex = id % 62;
        url += algarisms[algarismIndex];
        id = Math.floor(id / 62);
    }

    return url; // This url needs to be reverted to be correctly displayed as base 62
}

/**
 *
 * @param {string} url Reversed number in 62 base
 */
function convertShortenUrlToId(url) {
    let id = 0;

    for (let i = url.length - 1; i >= 0; i--) {
        if ("a" <= url[i] && url[i] <= "z") {
            id = id * 62 + url.charCodeAt(i) - "a".charCodeAt(0);
        } else if ("A" <= url[i] && url[i] <= "Z") {
            id = id * 62 + url.charCodeAt(i) - "A".charCodeAt(0) + 26;
        } else {
            id = id * 62 + url.charCodeAt(i) - "0".charCodeAt(0) + 52;
        }
    }

    return id;
}

function insertIntoDb(url) {
    // fake insert into db
    const fakeIdFromDb = 5e10;
    console.log({ url, fakeIdFromDb });
    return fakeIdFromDb;
}

function getFromDb(id) {
    // fake get from db
    if (id === 5e10) return MY_DUMMY_URL;
    return null;
}

/**
 *
 * @param {string} url
 */
function shorten(url) {
    const id = insertIntoDb(url); // db can also check if url already exists
    return convertIdToShortenUrl(id);
}

function expand(shortUrl) {
    const id = convertShortenUrlToId(shortUrl);
    return getFromDb(id);
}

// Test
const shortenUrl = shorten(MY_DUMMY_URL);
const expanded = expand(shortenUrl);
console.log({ shortenUrl, expanded, worked: MY_DUMMY_URL === expanded });
