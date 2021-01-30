package uz.doniyorbek7376.vegshop;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component("musicPlayer")
class MusicPlayer() {
    private var music: Music? = null
    var volume: Int = 0
    var name:String = ""
//    @Autowired
    constructor(music:Music):this() {
        this.music = music
    }
    @Autowired
    fun setMusic(music:Music) {
        this.music = music
    }
    fun playMusic() {
        println(music?.getSong())
    }
}
