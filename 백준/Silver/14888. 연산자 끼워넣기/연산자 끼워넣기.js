var max = -1000000000;
var min = 1000000000;

function re(arr, oper, i, num) {
	if(i == arr.length) {
		num = num == -0 ? 0: num;
		if(num > max) {
			max = num;
		}
		if(num < min) {
			min = num;
		}
		return;
	}
	if(oper[0] > 0) {
		oper[0]--;
		re(arr, oper, i + 1, parseInt(num) + parseInt(arr[i]));
		oper[0]++;
	}
	if(oper[1] > 0) {
		oper[1]--;
		re(arr, oper, i + 1, num - arr[i]);
		oper[1]++;
	}
	if(oper[2] > 0) {
		oper[2]--;
		re(arr, oper, i + 1, num * arr[i]);
		oper[2]++;
	}
	if(oper[3] > 0) {
		oper[3]--;
		re(arr, oper, i + 1, Math.trunc(num / arr[i]));
		oper[3]++;
	}
}

let fs=require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');

var K = input[0];

let arr = input[1].trim().split(" ");

let sum = 0;

let oper = input[2].trim().split(" ");

re(arr,oper,1,arr[0]);

console.log(max);
console.log(min);