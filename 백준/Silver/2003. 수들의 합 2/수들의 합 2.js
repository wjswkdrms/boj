let fs=require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');

let N = input[0].split(' ');
let arr = input[1].split(' ');

let lp = 0;
let rp = 0;
let count = 0;
let sum = 0;

while (true) {
	
	if(sum > N[1]) {
		sum -= arr[lp];
		lp++;
	}else {
		if(rp >= N[0]) {
			break;
		}
		sum += parseInt(arr[rp]);
		rp++;
	}
	if(sum == N[1]) {
		count++;
	}
}
console.log(count);
