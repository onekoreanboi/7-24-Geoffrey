class Song (val title: String, val artist: String) {
    fun play (){
        print("Playing: $title by $artist")
    }
    fun stop (){
        print("Stopping: $title by $artist")
    }
}

fun main (){
    var song1 = Song("Fireflies", "Owl City")
    var song2 = Song("Fireflies", "Owl City")
    var song3 = Song("Fireflies", "Owl City")

    song2.play()
    println()
    song2.stop()

}

