
let fs=require('fs');
let input = fs.readFileSync(0, 'utf-8').toString().split('\n');

var M = input[0];
var N = input[1];

var count = 0;
var min = -1;
for(var i = 0; i <= 100; i++) {
	if (Math.pow(i,2) >= M && Math.pow(i,2) <= N) {
		count += Math.pow(i,2);
		if (min == -1) {
			min = Math.pow(i,2);
		}
	}
}

if (min != -1) {
	console.log(count);
}
console.log(min);