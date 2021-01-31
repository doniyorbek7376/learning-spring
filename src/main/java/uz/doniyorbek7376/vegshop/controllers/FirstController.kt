package uz.doniyorbek7376.vegshop.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class FirstController {

    @GetMapping("/hello")
    fun helloPage(): String {
        return "first/hello"
    }

    @GetMapping("/goodbye")
    fun goodbyePage(): String {
        return "first/goodbye"
    }
}