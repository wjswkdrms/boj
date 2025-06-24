const fs = require('fs');
const input = fs.readFileSync(0, 'utf-8').toString().split('\n');
console.log(input[0].split(' ').reduce((a, b) => { return parseInt(a) + parseInt(b) }, 0));