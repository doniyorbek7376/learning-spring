package uz.doniyorbek7376.vegshop;

import org.springframework.stereotype.Component

@Component("rockMusic")
class RockMusic():Music {
    override fun getSong(): String {
        return "RockMusic"
    }

}