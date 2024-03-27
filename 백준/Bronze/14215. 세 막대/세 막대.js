let fs=require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');

let arr = input[0].split(' ');
arr.sort((a,b) => a - b);
while(parseInt(arr[0]) + parseInt(arr[1]) <= parseInt(arr[2])) {
	arr[2]--;
}
console.log(parseInt(arr[0]) + parseInt(arr[1]) + parseInt(arr[2]));