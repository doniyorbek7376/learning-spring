package uz.doniyorbek7376.vegshop.config

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer

class MySpringMVCDispatcherServletInitializer: AbstractAnnotationConfigDispatcherServletInitializer() {

    override fun getServletMappings(): Array<String> {
        return arrayOf("/")
    }

    override fun getRootConfigClasses(): Array<Class<*>>? {
        return arrayOf(SpringConfig::class.java)
    }

    override fun getServletConfigClasses(): Array<Class<*>>? {
        return null
    }
}