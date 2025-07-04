const fs = require('fs');
const input = (() => {
    try {
        return fs.readFileSync('./input.txt').toString().split('\n');
    } catch (err) {
        return fs.readFileSync(0, "utf-8").toString().split('\n');
    } 
})();

console.log(input.filter(str => str.charAt(0) == 'C').length);