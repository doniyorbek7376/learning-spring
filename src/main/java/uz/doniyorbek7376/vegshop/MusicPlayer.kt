package uz.doniyorbek7376.vegshop;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component("musicPlayer")
class MusicPlayer() {
    @Autowired
    @Qualifier("classicalMusic")
    private lateinit var music1: Music
    @Autowired
    @Qualifier("rockMusic")
    private lateinit var music2: Music
    var volume: Int = 0
    var name:String = ""
    fun playMusic():String {
        return music1.getSong()+" "+music2.getSong()
    }
}
