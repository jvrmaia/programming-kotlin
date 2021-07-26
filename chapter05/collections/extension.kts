val names = listOf("Tom", "Jerry")

println(names.javaClass)

for ((index, value) in names.withIndex()) {
    println("$index $value")
}