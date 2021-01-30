package uz.doniyorbek7376.vegshop

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext(
            "applicationContext.xml"
    )
//    val firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)
//    val secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)
//    println(firstMusicPlayer)
//    println(secondMusicPlayer)
    val music:Music = context.getBean("classicalMusic", Music::class.java)
    println(music.getSong())
    context.close()
}
