package uz.doniyorbek7376.vegshop

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    val context = AnnotationConfigApplicationContext(SpringConfig::class.java)
    val computer = context.getBean("computer", Computer::class.java)
    println(computer)
    context.close()
}
