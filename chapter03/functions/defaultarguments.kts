fun  greet(name: String, msg: String = "Hello"): String = "$msg $name"

println(greet("Eve"))
println(greet("Eve", "Howdy"))