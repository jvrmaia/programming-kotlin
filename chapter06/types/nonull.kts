fun nickName(name: String): String {
    if (name == "WIlliam") {
        return "Bill"
    }

    return null // ERROR
}

println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
println("Nickname for null is ${nickName(null)}")