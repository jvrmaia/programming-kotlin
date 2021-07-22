fun getFullName() = Triple("John", "Quincy", "Adams")

val (first, _, last) = getFullName()

println("$first $last")

val (_, middle) = getFullName()

println("$middle")