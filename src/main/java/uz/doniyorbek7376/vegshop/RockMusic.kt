package uz.doniyorbek7376.vegshop

import org.springframework.stereotype.Component

@Component("rockMusic")
class RockMusic():Music {
    override fun getSongs(): List<String> {
        return listOf("Rock music 1", "Rock music 2", "Rock music 3")
    }

}