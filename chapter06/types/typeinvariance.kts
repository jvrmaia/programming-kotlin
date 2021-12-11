open class Fruit
class Banana: Fruit()
class Orange: Fruit()

fun receiveFruits(fruits: List<Fruit>) {
    println("Number of fruits: ${fruits.size}")
}

val bananas: List<Banana> = listOf()
receiveFruits(bananas)