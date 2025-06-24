const fs = require('fs');
const input = fs.readFileSync(0, 'utf-8').toString().split('\n');
console.log(input[0].split(' ').reduce((acc, cur) => acc + Number(cur), 0));