package uz.doniyorbek7376.vegshop.genres

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import uz.doniyorbek7376.vegshop.Music


//@Component("classicalMusic")
//@Scope("prototype")
class ClassicalMusic: Music {
    override fun getSongs(): List<String> {
        return listOf("Classical music 1", "Classical music 2", "Classical music 3")
    }
}