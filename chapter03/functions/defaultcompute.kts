fun greet(name: String, msg: String = "Hi ${name.length}") = "$msg $name"

println(greet("Scott", "Howdy"))
println(greet("Scott"))