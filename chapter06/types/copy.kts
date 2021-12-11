open class Fruit

fun copyFromTo(from: Array<Fruit>, to: Array<Fruit>) {
    for (i in 0 until from.size) {
        to[i] = from[i]
    }
}

val fruitBasket1 = Array<Fruit>(3) { _ -> Fruit() }
val fruitBasket2 = Array<Fruit>(3) { _ -> Fruit() }

copyFromTo(fruitBasket1, fruitBasket2)