package uz.doniyorbek7376.vegshop

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component("classicalMusic")
@Scope("prototype")
class ClassicalMusic:Music {

    @PostConstruct
    fun postConstruct() {
        println("Constructed")
    }
    @PreDestroy
    fun preDestroy() {
        println("Destructed")
    }

    override fun getSongs(): List<String> {
        return listOf("Classical music 1", "Classical music 2", "Classical music 3")
    }
}