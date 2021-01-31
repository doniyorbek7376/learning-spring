package uz.doniyorbek7376.vegshop

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping("/")
    fun sayHello():String {
        println("hello")
        return "hello_world"
    }
}