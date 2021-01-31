package uz.doniyorbek7376.vegshop.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.thymeleaf.spring5.SpringTemplateEngine
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver
import org.thymeleaf.spring5.view.ThymeleafViewResolver

@Configuration
@ComponentScan("uz.doniyorbek7376.vegshop")
@EnableWebMvc
open class SpringConfig @Autowired constructor(private val applicationContext: ApplicationContext) : WebMvcConfigurer {

    @Bean
    open fun templateResolver(): SpringResourceTemplateResolver {
        return SpringResourceTemplateResolver().apply {
            setApplicationContext(applicationContext)
            suffix = "/WEB-INF/views/"
            prefix = ".html"
        }
    }

    @Bean
    open fun templateEngine(): SpringTemplateEngine {
        return SpringTemplateEngine().apply {
            setTemplateResolver(templateResolver())
            enableSpringELCompiler = true
        }
    }

    override fun configureViewResolvers(registry: ViewResolverRegistry) {
        registry.viewResolver(ThymeleafViewResolver().apply {
            templateEngine = templateEngine()
        })
    }
}