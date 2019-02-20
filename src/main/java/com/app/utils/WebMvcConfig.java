package com.app.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Package com.app.utils
 * @ClassName WebMvcConfig
 * @Author shaobin.wang
 * @Date 2019/02/20 12:08
 * @Version 1.0
 * @Description:
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    // 设置跨域访问
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowCredentials(true);
    }

}
