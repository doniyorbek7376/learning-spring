package uz.doniyorbek7376.vegshop.config

import org.springframework.context.annotation.*
import uz.doniyorbek7376.vegshop.Computer
import uz.doniyorbek7376.vegshop.Music
import uz.doniyorbek7376.vegshop.MusicPlayer
import uz.doniyorbek7376.vegshop.genres.*

@Configuration
@ComponentScan("uz.doniyorbek7376.vegshop")
@PropertySource("classpath:musicPlayer.properties")
open class SpringConfig {

    @Bean
    open fun rockMusic(): RockMusic {
        return RockMusic()
    }

    @Bean
    open fun classicalMusic(): ClassicalMusic {
        return ClassicalMusic()
    }
    @Bean
    open fun jazzMusic() :JazzMusic {
        return JazzMusic()
    }

    @Bean
    open fun musics(): List<Music> {
        return listOf(classicalMusic(), rockMusic(), jazzMusic())
    }

    @Bean
    open fun musicPlayer(): MusicPlayer {
        return MusicPlayer(musics())
    }

    @Bean
    open fun computer(): Computer {
        return Computer(musicPlayer())
    }
}