package spring.cloud.demo.zookeeper.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZookeeperProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperProvider8001Application.class,args);
    }
}
