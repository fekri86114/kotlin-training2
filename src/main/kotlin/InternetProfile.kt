/**
 * go to ques page by clicking [here.](https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems#5)
 * */

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) println("$hobby") else println()
        if (hobby != null && referrer != null)
            println("Likes to $hobby. Has a referrer named ${referrer.name}, who likes to $hobby.")
        else println("Likes to $hobby. Doesn't have a referrer.\n")
    }
}