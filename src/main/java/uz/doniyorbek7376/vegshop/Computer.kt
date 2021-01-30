package uz.doniyorbek7376.vegshop

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

//@Component("computer")

//@Autowired constructor
class Computer (private val musicPlayer: MusicPlayer) {
    private val id = 1
    override fun toString(): String {
        return "Computer $id: ${musicPlayer.playMusic()}"
    }
}