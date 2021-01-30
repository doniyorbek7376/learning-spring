package uz.doniyorbek7376.vegshop

import org.springframework.stereotype.Component

@Component("classicalMusic")
class ClassicalMusic:Music {

    override fun getSongs(): List<String> {
        return listOf("Classical music 1", "Classical music 2", "Classical music 3")
    }
}