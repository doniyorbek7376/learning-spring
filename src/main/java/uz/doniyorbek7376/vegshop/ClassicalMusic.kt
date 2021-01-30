package uz.doniyorbek7376.vegshop

import org.springframework.stereotype.Component

@Component("classicalMusic")
class ClassicalMusic:Music {
    override fun getSong(): String {
        return "Classical music"
    }
}