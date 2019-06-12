function pow(x, y) {
    if (y <= 0) return 1;

    const result = pow(x, Math.floor(y / 2));

    if (y % 2 === 0) return result * result;
    return x * result * result;
}
console.log(pow(2, 10));
