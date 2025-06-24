const fs = require('fs');
const input = (() => {
    try {
        return fs.readFileSync('./input.txt').toString().split('\n');
    } catch (err) {
        return fs.readFileSync(0, "utf-8").toString().split('\n');
    } 
})();

const Multiple4 = (n) => n % 4 === 0;
const Multiple100 = (n) => n % 100 === 0;
const Multiple400 = (n) => n % 400 === 0;

const isLeapYear = (year) => {
    if (Multiple4(year)) {
        if (Multiple100(year)) {
            if (Multiple400(year)) {
                return true;
            }
            return false;
        }
        return true;
    }
    return false;
}
console.log(isLeapYear(parseInt(input[0])) ? "1" : "0");

