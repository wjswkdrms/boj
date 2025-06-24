const fs = require('fs');
const input = (() => {
    try {
        return fs.readFileSync('/dev/stdin').toString().split('\n');
    } catch (err) {
        return fs.readFileSync('./input.txt').toString().split('\n');
    } 
})();

const score = (a) => {
    if (a >= 90) return "A";
    if (a >= 80) return "B";
    if (a >= 70) return "C";
    if (a >= 60) return "D";
    return "F";
}

console.log(score(parseInt(input[0])));