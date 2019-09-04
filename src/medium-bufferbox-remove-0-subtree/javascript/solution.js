function prunNode(node) {
    if (!node) return node;

    node.left = prunNode(node.left);
    node.right = prunNode(node.right);

    if (!node.left) delete node.left;
    if (!node.right) delete node.right;

    if (node.left || node.right || node.val !== 0) return node;
    return null;
}

let tree = {
    val: 0,
    left: {
        val: 1
    },
    right: {
        val: 0,
        left: {
            val: 1,
            left: {
                val: 0
            },
            right: {
                val: 0
            }
        },
        right: {
            val: 0
        }
    }
};

let tree2 = {
    val: 0,
    left: {
        val: 0
    },
    right: {
        val: 0,
        left: {
            val: 0,
            left: {
                val: 0
            },
            right: {
                val: 0
            }
        },
        right: {
            val: 0
        }
    }
};

console.log(tree);
console.log("===");
tree = prunNode(tree);
console.log(tree);

console.log("===");
console.log(tree2);
console.log("===");
tree2 = prunNode(tree2);
console.log(tree2);
