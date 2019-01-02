package com.haitang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/***
 * <p>
 *     项目启动
 * </p>
 */
@SpringBootApplication
public class HaitangApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(HaitangApplication.class, args);
        System.out.println("启动成功");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HaitangApplication.class);
    }
}

