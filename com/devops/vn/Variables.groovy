package com.devops.vn

def str="String"
def num=5
def bool=true

boolean x = true
String st = "String"
int integer = 2

println "String type is ${str}"
println "Number  type is ${num}"
println "Boolean type is ${bool}"

println "${x}"
println "${st}"
println "${integer}"

// Dynamically variables type
def (String a, int b, double c) = ["Hello",2,3.2]
println a
println b
println c