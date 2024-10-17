package com.devops.vn

def x = 9
// if-else
if (x < 5) {
	println "x < 5"
} else if (x > 5) {
	println "x > 5"
} else if (x == 5){
	println "x = 5"
} else {
	println "Invalid Number"
}
// switch-case
switch(x) {
	case 5:
		println "x = 5"
		break;
	case {x > 5}:
		println "x > 5"
		break;
	case {x < 5}:
		println "x < 5"
		break;
	default:
		println "Invalid Number"
}