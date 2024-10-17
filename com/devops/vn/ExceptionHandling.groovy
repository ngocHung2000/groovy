package com.devops.vn

try {
	int x = 1/0
} catch (ArithmeticException ax) {
	println "Catch block to catch Arithmetic exp"
} 
catch (Exception exp) {
	println "I'm inside exception block"
	println exp.getCause()
	println exp.getMessage()
	exp.printStackTrace()
} finally {
	println "I'm inside finally block"
}