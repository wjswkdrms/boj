let fs=require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');

let N = input[0];

let result = input[1].split('');
for(let i = 2; i <= N; i++) {
	let s = input[i].split('');
	for(let j = 0; j < s.length; j++) {
		if (result[j] != s[j]) {
			result[j] = '?';
		}
	}
}
for(let i = 0; i < result.length; i++) {
	process.stdout.write(result[i])
}
