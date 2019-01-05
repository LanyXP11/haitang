package com.haitang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/***
 * <p>
 *     项目启动
 * </p>
 */
@SpringBootApplication
@ConfigurationProperties(value = "classpath:application.properties")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "com.haitang.dal.*")
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

