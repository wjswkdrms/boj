let fs=require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');

let N = input[0];
let arr = [];
for(let i = 0; i < N.length; i++) {
	arr.push(N.substring(i));
}
arr = arr.sort();
arr.forEach(s => {
	console.log(s);	
});

