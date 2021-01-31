package uz.doniyorbek7376.vegshop.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SecondController {

    @GetMapping("/exit")
    fun exitPage():String {
        return "second/exit"
    }
}