const mainStack = [];
const helperStack = [];

/**
 *
 * @param {[any]} from
 * @param {[any]} to
 */
function transferItems(from, to) {
    while (from.length > 0) {
        const removed = from.pop();
        to.push(removed);
    }
}

function enqueue(val) {
    mainStack.push(val);

    return enqueue; // for chaining calls
}

function dequeue() {
    transferItems(mainStack, helperStack);
    const removed = helperStack.pop();
    transferItems(helperStack, mainStack);
    return removed;
}

// Test
enqueue(1)(2)(3)(4)(5)(6);
console.log(dequeue()); // 1
console.log(dequeue()); // 2
console.log(dequeue()); // 3
console.log(dequeue()); // 4
console.log(dequeue()); // 5
console.log(dequeue()); // 6
console.log(dequeue()); // undefined
