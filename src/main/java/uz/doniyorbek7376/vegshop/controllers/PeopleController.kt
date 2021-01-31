package uz.doniyorbek7376.vegshop.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import uz.doniyorbek7376.vegshop.dao.PersonDAO

@Controller

class PeopleController @Autowired constructor(private val personDAO: PersonDAO){

    @GetMapping("/people")
    fun index(model: Model): String {
        // Get all people from DAO
        model.addAttribute("people", personDAO.index())
        return "people/index"
    }

    @GetMapping("/people/{id}")
    fun show(@PathVariable("id") id:Int, model: Model): String {
        // Get one person with the id from DAO
        model.addAttribute("person", personDAO.show(id))
        return "people/show"
    }
}