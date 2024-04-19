let fs=require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');
var arr = input[0].split(' '); 
var d = arr[0];
var h = arr[1];
var w = arr[2];

var result = Math.sqrt(Math.pow(d,2) / (Math.pow(h,2) + Math.pow(w,2)));
console.log(Math.floor(result*h) + " " + Math.floor(result*w));