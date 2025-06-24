const fs = require('fs');
const input = (() => {
    try {
        return fs.readFileSync('./input.txt').toString().split('\n');
    } catch (err) {
        return fs.readFileSync(0, "utf-8").toString().split('\n');
    } 
})();
const fac = (n) => {
    if (n === 0) return 1;
    let result = 1;
    for (let i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}
console.log(fac(Number(input[0])));