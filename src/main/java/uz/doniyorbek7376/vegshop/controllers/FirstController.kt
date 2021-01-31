package uz.doniyorbek7376.vegshop.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletRequest

@Controller
class FirstController {

    @GetMapping("/hello")
    fun helloPage(@RequestParam("name") name: String): String {
        println(name)
        return "first/hello"
    }

    @GetMapping("/goodbye")
    fun goodbyePage(): String {
        return "first/goodbye"
    }
}