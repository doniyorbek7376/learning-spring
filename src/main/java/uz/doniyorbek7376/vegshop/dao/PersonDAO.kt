package uz.doniyorbek7376.vegshop.dao

import org.springframework.stereotype.Component
import uz.doniyorbek7376.vegshop.models.Person

@Component
class PersonDAO {
    companion object {
        @JvmStatic
        var PEOPLE_COUNT = 0
    }

    private val people = ArrayList<Person>().apply {
        add(Person(++PEOPLE_COUNT, "Alex"))
        add(Person(++PEOPLE_COUNT, "Bob"))
        add(Person(++PEOPLE_COUNT, "Charles"))
        add(Person(++PEOPLE_COUNT, "David"))
        add(Person(++PEOPLE_COUNT, "Ernest"))
        add(Person(++PEOPLE_COUNT, "Franklin"))
        add(Person(++PEOPLE_COUNT, "George"))
    }

    fun index(): List<Person> {
        return people
    }

    fun show(id: Int): Person? {
        return people.stream().filter { it.id == id }.findAny().orElse(null)
    }
}