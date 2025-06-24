const fs = require('fs');
const input = (() => {
    try {
        return fs.readFileSync('/dev/stdin').toString().split('\n');
    } catch (err) {
        return fs.readFileSync('./input.txt').toString().split('\n');
    } 
})();

const compare = (a, b) => {
    if (a === b) return "==";
    if (a > b) return ">";
    return "<";
}

const nums = input[0].split(' ').map(Number);
console.log(compare(nums[0], nums[1]));