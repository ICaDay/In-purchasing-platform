package com.mall.Config;

/*
@author
@create 2021-07-24-8:39
*/

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class UploadMapping implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upfile/**").addResourceLocations("file:e:/proj_img");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
