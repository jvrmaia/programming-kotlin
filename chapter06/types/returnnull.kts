fun nickName(name: String?) = when(name) {
    "WIlliam" -> "Bill"
    null -> "Joker"
    else -> name.reversed().uppercase()
}

println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
println("Nickname for null is ${nickName(null)}")