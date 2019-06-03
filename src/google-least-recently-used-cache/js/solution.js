class ListNode {
    /**
     *
     * @param {ListNode} [previous]
     * @param {ListNode} [next]
     * @param {string} key
     * @param {*} value
     */
    constructor(previous, next, key, value) {
        this.previous = previous;
        this.next = next;
        this.key = key;
        this.value = value;
    }
}

class LinkedList {
    constructor() {
        /** @type {ListNode} */
        this.tail = null;
        /** @type {ListNode} */
        this.head = null;
        this.count = 0;
    }

    /**
     *
     * @param {ListNode} element
     */
    remove(element) {
        this.count--;

        if (!element.next) {
            this.head = element.previous; // update head
            if (this.head) this.head.next = null; // unlink from list
            return;
        }

        if (!element.previous) {
            this.tail = element.next; // update tail
            if (this.tail) this.tail.previous = null; // unlink from list
            return;
        }

        const previous = element.previous;
        const next = element.next;

        previous.next = next;
        next.previous = previous;
    }

    insert(key, value) {
        this.count++;
        const newElement = new ListNode(this.head, null, key, value);

        if (!this.tail) this.tail = newElement;
        if (this.head) this.head.next = newElement;

        this.head = newElement;
        return newElement;
    }

    removeLast() {
        const tail = this.tail;
        this.remove(this.tail);
        return tail;
    }

    getCount() {
        return this.count;
    }
}

class MyCache {
    constructor(limit = 10) {
        this.limit = limit;
        this.values = new LinkedList();
        this.keyValueMap = {};
    }

    setLastUsed(key) {
        const element = this.keyValueMap[key];
        this.values.remove(element);
        this.keyValueMap[key] = this.values.insert(element.key, element.value);
    }

    set(key, value) {
        if (this.keyValueMap[key]) {
            this.setLastUsed(key);
            this.keyValueMap[key].value = value;
            return;
        }

        if (this.values.getCount() === this.limit) {
            const removed = this.values.removeLast();
            this.keyValueMap[removed.key] = undefined;
        }

        const insertedElement = this.values.insert(key, value);
        this.keyValueMap[key] = insertedElement;
    }

    get(key) {
        if (!this.keyValueMap[key]) return null;
        this.setLastUsed(key);
        return this.keyValueMap[key];
    }
}

// test
const cache = new MyCache(4);
cache.set("abc", 10);
cache.set("SECOND", 11);
cache.set("abc", 17);
cache.set("third", 12);
cache.set("a", 3);
cache.set("b", 7);
console.log(cache.get("abc"));
console.log("================");
console.log(cache.get("SECOND")); // must be null
console.log("================");
console.log(cache.get("third"));
console.log("================");
console.log(cache.get("a"));
console.log("================");
console.log(cache.get("b"));
