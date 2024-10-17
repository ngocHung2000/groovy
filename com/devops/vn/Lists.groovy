package com.devops.vn


def list = [1,2,3,["a","b",2]]
println list[0]
println list.get(0)

println list[3][1]
println list.get(3).get(1)

println list[0..1]

println list.contains(2)
println list.size()