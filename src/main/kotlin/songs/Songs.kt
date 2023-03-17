package songs

class Songs(private val title: String, private val artist: String, private val publishedYear: Int, playCount: Int) {

    init {
        if (playCount > 1000) println("Popular song") else println("Unpopular song")
    }

    fun songDesc(): String = "$title, performed by $artist, was released in $publishedYear."


}