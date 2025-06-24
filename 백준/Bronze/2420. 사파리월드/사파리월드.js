const fs = require('fs');
const input = (() => {
    try {
        return fs.readFileSync('./input.txt').toString().split('\n');
    } catch (err) {
        return fs.readFileSync(0, "utf-8").toString().split('\n');
    } 
})();

const [a, b] = input[0].split(' ').map(Number);
console.log(Math.abs(a - b));