package com.example.demo

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@Configuration
open class ScaticResourceConfig : WebMvcConfigurerAdapter() {

    override fun addResourceHandlers(registry: ResourceHandlerRegistry?) {
        registry?.addResourceHandler("/**")
                ?.addResourceLocations("classpath:/static/")
        registry?.addResourceHandler("swagger-ui.html")
                ?.addResourceLocations("classpath:/META-INF/resources/")
        registry?.addResourceHandler("/webjars/**")
                ?.addResourceLocations("classpath:/META-INF/resources/webjars/")
        super.addResourceHandlers(registry)
    }

}