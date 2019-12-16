package com.qfedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //启用Swagger的扫描
@MapperScan("com.qfedu.news.dao,com.qfedu.oss.dao,com.qfedu.phone.dao,com.qfedu.user.dao")
public class JmSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmSpringbootApplication.class, args);
    }

}
