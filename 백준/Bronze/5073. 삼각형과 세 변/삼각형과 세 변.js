function eq(a, b){
	if(parseInt(a) == parseInt(b)) {
		return true;
	}
	return false;
}

let fs=require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
//let input = fs.readFileSync('./input.txt').toString().split('\n');

let i = 0;
while(true) {
	let tri = input[i++].split(/[ ,\n]/).sort((a, b) => parseInt(a) - parseInt(b));
	if(tri[0] == 0) {
		break;
	}
	if(eq(tri[0], tri[1]) && eq(tri[1], tri[2])) {
		console.log("Equilateral");
	} else if(parseInt(tri[0]) + parseInt(tri[1]) <= tri[2]) {
		console.log("Invalid")
	} else if(eq(tri[0], tri[1]) || eq(tri[1], tri[2]) || eq(tri[0], tri[2])) {
		console.log("Isosceles");
	} else {
		console.log("Scalene");
	}
}