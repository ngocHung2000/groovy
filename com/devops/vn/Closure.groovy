package com.devops.vn

import com.devops.vn.Closure

def closure_01 = { name,age -> println "Hello ${name}. I'am ${age} yo"}

closure_01.call("Hung",18)

def ls = ["Apples","Oranges","Grapes"]
println ls.each { it }

def map = [
	"age": 18,
	"full_name": "Ngoc Hung"
	]
	
println map.each { it }

def ls_num = [1,2,3,4,5,6]
println ls_num.findAll{ item -> item > 2 }