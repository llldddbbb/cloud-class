package cn.dblearn.cloud.trace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * @author Bobbi
 * @date 2018/1/30
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinStreamServer
public class TraceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraceApplication.class,args);
    }
}
