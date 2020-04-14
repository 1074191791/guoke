package fun.guoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 * @author zhous
 * @create 2020-03-26 11:06
 */
@SpringBootApplication
@EnableEurekaServer
public class GkRegistry {

    public static void main(String[] args) {
        SpringApplication.run(GkRegistry.class, args);
    }
}
