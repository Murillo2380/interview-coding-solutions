"use strict";

function solve(root) {
    const queue = [];
    let lastUsed = root;
    queue.push(root);

    while (queue.length > 0) {
        const node = queue.shift();
        if (!node) continue;
        lastUsed = node;
        queue.push(node.left);
        queue.push(node.right);
    }

    return lastUsed.val;
}

const tree = {
    val: "a",
    left: {
        val: "b",
        left: {
            val: "d"
        }
    },
    right: {
        val: "c"
    }
};

const tree2 = {
    val: "a",
    left: {
        val: "b",
        left: {
            val: "d"
        },
        right: {
            val: "e",
            right: {
                val: "f",
                left: {
                    val: "g"
                }
            }
        }
    },
    right: {
        val: "c"
    }
};

console.log(solve(tree)); // d
console.log(solve(tree2)); // g
