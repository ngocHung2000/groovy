package com.devops.vn

import java.lang.String

def getInfo(String txt) {
	return "Hello $txt"
}

def someMethod(String parameter1, int parameter2 = 0, int parameter3 = 0) {
	println "${parameter1}" + "${parameter2}" + "${parameter3}"
}

println getInfo("Ngoc Hung")
someMethod("hung")