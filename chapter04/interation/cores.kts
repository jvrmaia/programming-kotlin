fun systemInfo(): String {
    val numberOfCores = Runtime.getRuntime().availableProcessors()

    return when (numberOfCores) {
        1 -> "1 core, packing this one to the museum"
        in 2..16 -> "You have $numberOfCores cores"
        else -> "$numberOfCores cores!, I want your machine"
    }
}

println(systemInfo())