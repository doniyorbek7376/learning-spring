package uz.doniyorbek7376.vegshop

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping("/hello")
    fun sayHello():String {
        return "hello_world"
    }
}