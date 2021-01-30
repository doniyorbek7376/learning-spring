package uz.doniyorbek7376.vegshop.genres

import org.springframework.stereotype.Component
import uz.doniyorbek7376.vegshop.Music

//@Component("rockMusic")
class RockMusic : Music {
    override fun getSongs(): List<String> {
        return listOf("Rock music 1", "Rock music 2", "Rock music 3")
    }

}