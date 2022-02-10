
fun main() {
    var mapString = mapOf("a" to "A","c" to "C","b" to "B","a" to "A")

    var strMap = mapString.toString()
    var strMap2 = ""

    for (i in 1 .. strMap.toCharArray().size-2) strMap2 += strMap.toCharArray()[i]

    var mapFinal = strMap2.split(",").associate {
        val (left, right) = it.split("=")
        left to right
    }

    println(mapFinal["a"])
}