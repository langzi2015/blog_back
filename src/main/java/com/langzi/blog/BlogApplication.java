package com.langzi.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@ServletComponentScan
@SpringBootApplication
public class BlogApplication extends SpringBootServletInitializer {
    //使用war方式部署的时候需要将下面的注释取消
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(BlogApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
