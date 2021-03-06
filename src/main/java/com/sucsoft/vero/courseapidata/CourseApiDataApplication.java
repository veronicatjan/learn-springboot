package com.sucsoft.vero.courseapidata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * CourseApiDataApplication
 *
 * @author veronicatjan
 * @date 2019/11/20
 */

@SpringBootApplication
@EnableSwagger2
public class CourseApiDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApiDataApplication.class, args);
    }

}
