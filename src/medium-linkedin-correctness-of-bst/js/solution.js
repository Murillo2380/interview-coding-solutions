"use strict";
/**
 * @typedef {Object} BST
 * @property {number} val
 * @property {BST} [left]
 * @property {BST} [right]
 * @property {number} [min]
 * @property {number} [max]
 */

/**
 *
 * @param {BST} root
 */
function solve(root) {
    if (!root) return true;

    const stack = [root];

    while (stack.length > 0) {
        const current = stack.pop();

        if (!current) continue;

        if (current.left && current.left.min === undefined) {
            stack.push(current);
            stack.push(current.left);
            continue;
        }

        if (current.right && current.right.max === undefined) {
            stack.push(current);
            stack.push(current.right);
            continue;
        }

        // console.log({ current });

        if (current.left && current.val < current.left.max) return false;
        if (current.right && current.val >= current.right.min) return false;

        if (!current.left) current.min = current.val;
        else current.min = current.left.min;

        if (!current.right) current.max = current.val;
        else current.max = current.right.max;
    }

    return true;
}

/** @type {BST} */
const bst1 = {
    val: 10,
    left: {
        val: 5
    }
};
/** @type {BST} */
const bst2 = {
    val: 10,
    right: {
        val: 5
    }
};

/** @type {BST} */
const bst3 = {
    val: 10,
    right: {
        val: 20,
        right: {
            val: 25
        },
        left: {
            val: 19
        }
    },
    left: {
        val: 5,
        left: {
            val: 2
        },
        right: {
            val: 5
        }
    }
};

/** @type {BST} */
const bst4 = {
    val: 10,
    right: {
        val: 20,
        right: {
            val: 25
        },
        left: {
            val: 19
        }
    },
    left: {
        val: 5,
        left: {
            val: 2,
            left: {
                val: 2
            }
        },
        right: {
            val: 6
        }
    }
};
/** @type {BST} */
const bst5 = {
    val: 10,
    right: {
        val: 20,
        right: {
            val: 25
        },
        left: {
            val: 21
        }
    },
    left: {
        val: 5,
        left: {
            val: 2
        },
        right: {
            val: 6
        }
    }
};
console.log(solve(bst1)); // true
console.log(solve(bst2)); // false
console.log(solve(bst3)); // false
console.log(solve(bst4)); // true
console.log(solve(bst5)); // false
