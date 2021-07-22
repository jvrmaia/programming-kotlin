fun createPerson(name: String, age: Int = 1, height: Int, weight: Int) {
    println("$name $age $height $weight")
}

createPerson("Jake", 12, 152, 43)
createPerson(name = "Jake", age = 12, weight = 43, height = 152)
createPerson("Jake", age = 12, weight = 43, height = 152)
createPerson("Jake", 12, weight = 43, height = 152)
createPerson(weight = 43, height = 152, name = "Jake")
createPerson("Jake", weight = 43, height = 152)