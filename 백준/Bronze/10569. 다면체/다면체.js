let fs=require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');
var N = input[0];
for(var i = 1; i <= N; i++) {
	var arr = input[i].split(' ');
	console.log(arr[1] - arr[0] + 2);
}