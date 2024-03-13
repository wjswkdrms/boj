let fs=require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');

let mo = ['a','e','i','o','u'];

for(let i = 0; i < input.length; i++) {
	let count = 0;
	if(input[i] === "#") {
		break;
	}
	let s = input[i].toLowerCase().split('');
	for(let j = 0; j < s.length; j++) {
		for(let p = 0; p < mo.length; p++) {
			if ( s[j] == mo[p] ) {
				count++;
				break;
			}
		}
	}
	console.log(count);
}
