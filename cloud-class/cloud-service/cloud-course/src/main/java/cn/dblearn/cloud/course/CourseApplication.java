package cn.dblearn.cloud.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Bobbi
 * @date 2018/3/1
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class,args);
    }
}
