package uz.doniyorbek7376.vegshop.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/first")
class FirstController {

    @GetMapping("/hello")
    fun helloPage(
        @RequestParam("name", required=false) name: String?,
        @RequestParam("surname", required=false) surname: String?,
        model: Model
    ): String {
        model.addAttribute("message", "Hello ${name?:""} ${surname?:""}")
        return "first/hello"
    }

    @GetMapping("/goodbye")
    fun goodbyePage(): String {
        return "first/goodbye"
    }

    @GetMapping("/calculator")
    fun calculate(
        @RequestParam("a") a: Int,
        @RequestParam("b") b:Int,
        @RequestParam("action") action: String,
        model: Model
    ):String {
        model.addAttribute("result", when(action) {
            "subtraction" -> "$a - $b = ${a-b}"
            "addition" -> "$a + $b = ${a+b}"
            "multiplication" -> "$a * $b = ${a-b}"
            "division" -> "$a / $b = ${a/b}"
            else -> "Action not found"
        })
        return "first/calculator"
    }
}