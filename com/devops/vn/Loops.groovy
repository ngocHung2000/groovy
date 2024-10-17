package com.devops.vn

// for
for (x=1; x < 3;x++) {
	println x
}
// for in
for (x in 1..3) {
	println x
}

1.upto(3) { 
	println "${it}"
}

5.times { println "$it" }
1.step(10, 3) { println "$it" }

// keyword
// upto, times, step


// iterate over a map
Map map = ["name":"Ngoc Hung", "age": 18]

for (x in map) {
	println "Key is " + x.key + " and Value is " + x.value
} 

// while
int a=0
while (a < 5) {
	println a;
	a = a+1;
}