
let fs=require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');

let arr = [0,0,0,0,0,0,0,0,0,0];

input[0].split('').forEach(e => {
	arr[e]++;
});
let sixnine = arr[6] + arr[9];
sixnine = Math.floor(sixnine/2) + (sixnine%2);
arr[6] = sixnine;
arr[9] = sixnine;
let max = 0;
arr.forEach(e => {
	if(max < e) {
		max = e;
	}
});
console.log(max);