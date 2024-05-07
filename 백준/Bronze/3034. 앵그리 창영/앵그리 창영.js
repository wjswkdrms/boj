let fs=require('fs');
let input = fs.readFileSync(0, 'utf-8').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');
var f = input[0].split(' ');
var N = f[0];
var h = f[1];
var w = f[2];

var maxl = Math.pow(h, 2) + Math.pow(w, 2);
for (var i = 0; i < N; i++) {
	if(Math.pow(input[i+1],2) > maxl) {
		console.log('NE');
	} else {
		console.log('DA');
	}
}
