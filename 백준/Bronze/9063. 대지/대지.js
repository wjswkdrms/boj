let fs=require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');

let N = parseInt(input[0]);
let xmin = 100000;
let xmax = -100000;
let ymin = 100000;
let ymax = -100000;

for(let i = 1; i <= N; i++) {
	let [x, y] = input[i].split(" ");
	if (parseInt(x) > xmax) {
		xmax = parseInt(x);
	}
	if (parseInt(y) > ymax) {
		ymax = parseInt(y);
	}
	if (parseInt(x) < xmin) {
		xmin = parseInt(x);
	}
	if (parseInt(y) < ymin) {
		ymin = parseInt(y);
	}
}

console.log((xmax - xmin) * (ymax - ymin));