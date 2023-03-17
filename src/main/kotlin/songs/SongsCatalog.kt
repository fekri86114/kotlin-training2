package songs

/**
 * go to ques page by clicking [here.](https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems#4)
 * */

fun main() {
    val mSongs = Songs("The Climb", "Miley Cyrus", 2012, 200000)
    println(mSongs.songDesc())
}