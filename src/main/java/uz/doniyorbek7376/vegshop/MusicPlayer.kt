package uz.doniyorbek7376.vegshop

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import kotlin.random.Random

//@Component("musicPlayer")
class MusicPlayer(private val musics: List<Music>) {

    @Value("\${musicPlayer.volume}")
    var volume: Int = 0

    @Value("\${musicPlayer.name}")
    var name:String = ""

    fun playMusic():String {
        val song = musics.random().getSongs().random()
        return "Playing on player $name: $song at volume $volume"
    }
}
