fun nofluff() {
    println("noflufff called...")
    throw RuntimeException("oops")
}

println("not in a function, calling nofluff()")

try {
    nofluff()
} catch (ex: Exception) {
    val stackTrace =  ex.getStackTrace()
    println(stackTrace[0])
    println(stackTrace[1])
}