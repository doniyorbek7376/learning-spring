package uz.doniyorbek7376.vegshop

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import kotlin.random.Random

@Component("musicPlayer")
class MusicPlayer() {

    @Autowired
    @Qualifier("classicalMusic")
    private lateinit var music1: Music

    @Autowired
    @Qualifier("rockMusic")
    private lateinit var music2: Music

    @Value("\${musicPlayer.volume}")
    var volume: Int = 0

    @Value("\${musicPlayer.name}")
    var name:String = ""
    fun playMusic(type: MusicType):String {
        val random = Random(System.currentTimeMillis())
        val music =  when(type) {
            MusicType.CLASSICAL -> music1
            MusicType.ROCK ->music2
        }
        val songs = music.getSongs()
        return songs[random.nextInt(songs.size)]
    }
}
