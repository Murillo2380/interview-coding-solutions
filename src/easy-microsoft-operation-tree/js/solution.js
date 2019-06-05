class TreeNode {
    /**
     *
     * @param {TreeNode} left
     * @param {TreeNode} right
     * @param {*} val
     */
    constructor(left, right, val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    isLeaf() {
        return !this.left && !this.right;
    }
}

/**
 *
 * @param {TreeNode} treeNode
 */
function calculate(treeNode) {
    if (treeNode.isLeaf()) return treeNode.val;

    switch (treeNode.val) {
        case "*":
            treeNode.val = calculate(treeNode.left) * calculate(treeNode.right);
            break;
        case "+":
            treeNode.val = calculate(treeNode.left) + calculate(treeNode.right);
            break;
        case "-":
            treeNode.val = calculate(treeNode.left) - calculate(treeNode.right);
            break;
        case "/":
            treeNode.val = calculate(treeNode.left) / calculate(treeNode.right);
            break;
    }

    return treeNode.val;
}

const testTree1 = new TreeNode(null, null, 3);
const testTree2 = new TreeNode(null, null, 2);
const testTree3 = new TreeNode(null, null, 4);
const testTree4 = new TreeNode(null, null, 5);
const testTree5 = new TreeNode(testTree1, testTree2, "+");
const testTree6 = new TreeNode(testTree3, testTree4, "+");
const testTree7 = new TreeNode(testTree5, testTree6, "*");

console.log(calculate(testTree7)); // 45
