"use strict";
class MatrixPrinter {
    /**
     *
     * @param {number[][]} matrix
     */
    constructor(matrix) {
        this.matrix = matrix;
        this.currentI = 0;
        this.currentJ = 0;
        this.numRows = matrix[0].length;
        this.numColumns = matrix.length;
        this.direction = 0;
        this.numToPrint = this.numRows * this.numColumns;
    }

    isValid(i, j) {
        return (
            i >= 0 &&
            i < this.numColumns &&
            j >= 0 &&
            j < this.numRows &&
            this.matrix[i][j] !== null
        );
    }

    changeDirection() {
        this.direction = ++this.direction % 4;
    }

    moveRight() {
        if (!this.isValid(this.currentI, this.currentJ + 1)) return false;
        this.currentJ++;
        return true;
    }
    moveLeft() {
        if (!this.isValid(this.currentI, this.currentJ - 1)) return false;
        this.currentJ--;
        return true;
    }
    moveUp() {
        if (!this.isValid(this.currentI - 1, this.currentJ)) return false;
        this.currentI--;
        return true;
    }

    moveDown() {
        if (!this.isValid(this.currentI + 1, this.currentJ)) return false;
        this.currentI++;
        return true;
    }

    move() {
        let hasMoved = false;
        while (!hasMoved) {
            switch (this.direction) {
                case 0:
                    hasMoved = this.moveRight();
                    break;
                case 1:
                    hasMoved = this.moveDown();
                    break;
                case 2:
                    hasMoved = this.moveLeft();
                    break;
                default:
                    hasMoved = this.moveUp();
            }
            if (!hasMoved) this.changeDirection();
        }
        return true;
    }

    printEspiral() {
        let printed = 0;
        do {
            console.log(this.matrix[this.currentI][this.currentJ]);
            this.matrix[this.currentI][this.currentJ] = null;
        } while (++printed < this.numToPrint && this.move());
    }
}

const test = [
    [1, 2, 3, 4, 5],
    [6, 7, 8, 9, 10],
    [11, 12, 13, 14, 15],
    [16, 17, 18, 19, 20]
];

new MatrixPrinter(test).printEspiral();
