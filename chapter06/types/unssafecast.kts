fun fetchMessage(id: Int): Any = if (id == 1) "Record found" else StringBuilder("data not found")

for (id in 1..2) {
    println("Message length: ${(fetchMessage(id) as? String)?.length}")
}