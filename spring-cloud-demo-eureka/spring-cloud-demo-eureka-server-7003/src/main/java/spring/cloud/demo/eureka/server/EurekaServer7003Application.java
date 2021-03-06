package spring.cloud.demo.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//启动eureka服务端
@EnableEurekaServer
public class EurekaServer7003Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003Application.class,args);
    }
}
