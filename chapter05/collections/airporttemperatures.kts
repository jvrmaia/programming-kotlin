val airportCodes = listOf("LAX", "SFO", "PDX", "SEA")

val temperatures =
        airportCodes.map { code -> code to getTemperatureAtAirport(code) }

for (temp in temperatures) {
    println("Airport: ${temp.first}: Temperature: ${temp.second}")
}

fun getTemperatureAtAirport(code: String): String =
        "${Math.round(Math.random() * 30) + code.count()} C"