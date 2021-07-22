java.io.File(".")
        .walk()
        .filter { file -> file.extension == "kts" }
        .forEach { println(it) }