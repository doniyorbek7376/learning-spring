package uz.doniyorbek7376.vegshop

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@ComponentScan("uz.doniyorbek7376.vegshop")
@PropertySource("classpath:musicPlayer.properties")
class SpringConfig {
}