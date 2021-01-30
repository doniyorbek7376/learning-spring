package uz.doniyorbek7376.vegshop.genres

import uz.doniyorbek7376.vegshop.Music

class JazzMusic: Music {
    override fun getSongs(): List<String> {
        return listOf("Jazz music 1", "Jazz music 2", "Jazz music 3")
    }
}