const fs = require('fs');
const input = (() => {
    try {
        return fs.readFileSync('./input.txt').toString().split('\n');
    } catch (err) {
        return fs.readFileSync(0, "utf-8").toString().split('\n');
    } 
})();

const quad = (a, b) => {
    if (a > 0 && b > 0) return 1;
    if (a < 0 && b > 0) return 2;
    if (a < 0 && b < 0) return 3;
    if (a > 0 && b < 0) return 4;
}

console.log(quad(Number(input[0]), Number(input[1])));

