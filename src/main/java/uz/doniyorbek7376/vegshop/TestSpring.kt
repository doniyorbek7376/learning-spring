package uz.doniyorbek7376.vegshop

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext(
            "applicationContext.xml"
    )
    val computer = context.getBean("computer", Computer::class.java)
    println(computer)
    context.close()
}
