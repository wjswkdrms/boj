let fs=require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');
var N = input[0];
var nums = [];
var idx = [0 , 0];
var max = [0 , 0];
for(var i = 1; i <= 6; i++) {
	var arr = input[i].split(' ');
	var k = Math.floor((arr[0]-1) / 2);
	if(arr[1] > max[k]) {
		idx[k] = i - 1;
		max[k] = parseInt(arr[1]);
	}
	nums.push(parseInt(arr[1]));
}
var result = nums[idx[0]] * nums[idx[1]] - nums[(idx[0] + 3) % 6] * nums[(idx[1] + 3) % 6]
console.log(result*N);