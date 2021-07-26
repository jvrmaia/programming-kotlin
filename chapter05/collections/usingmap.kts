val sites = mapOf("pragprog" to "https://www.pragprog.com",
        "agiledeveloper" to "https://agiledeveloper.com")

println(sites.size) //2

println(sites.containsKey("agiledeveloper")) //true
println(sites.containsValue("http://www.example.com")) //false
println(sites.contains("agiledeveloper")) //true
println("agiledeveloper" in sites) //true

/*
val pragProgSite: String = sites.get("pragprog") //ERROR
*/

val pragProgSite: String? = sites.get("pragprog")

val pragProgSite2: String? = sites["pragprog"]

val agiledeveloper =
        sites.getOrDefault("agiledeveloper", "http://www.example.com")

val sitesWithExample = sites + ("example" to "http://www.example.com")

val withoutAgileDeveloper = sites - "agiledeveloper"

for (entry in sites) {
    println("${entry.key} --- ${entry.value}")
}

for ((key, value) in sites) {
    println("$key --- $value")
}

println(sites)
println(sitesWithExample)
println(withoutAgileDeveloper)
println(pragProgSite)
println(pragProgSite2)
println(agiledeveloper)