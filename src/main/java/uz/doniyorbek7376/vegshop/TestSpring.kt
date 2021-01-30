package uz.doniyorbek7376.vegshop

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext(
            "applicationContext.xml"
    )
    val music1 = context.getBean("classicalMusic", Music::class.java)
    val music2 = context.getBean("rockMusic", Music::class.java)
    println(music1.getSong())
    println(music2.getSong())
    context.close()
}
