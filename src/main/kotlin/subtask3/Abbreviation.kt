package subtask3

class Abbreviation {


    fun abbreviationFromA(a: String, b: String): String {

        var aToUpper = a.toUpperCase()
        var result = aToUpper

        for (i in b.indices) aToUpper = aToUpper.substringAfter(b[i], "NO")

        if (aToUpper != "NO") return "YES"
        else return "NO"


        throw NotImplementedError("Not implemented")
    }
}
