package uz.doniyorbek7376.vegshop;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component("musicPlayer")
class MusicPlayer() {
    @Autowired
    private var music: Music? = null
    var volume: Int = 0
    var name:String = ""
    constructor(music:Music):this() {
        this.music = music
    }
    fun playMusic():String {
        return music?.getSong()?:""
    }
}
