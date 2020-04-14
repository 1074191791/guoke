package fun.guoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zhous
 * @create 2020-03-26 11:18
 */
@SpringBootApplication
@EnableDiscoveryClient //  允许被eureka发现
@EnableZuulProxy //zuul网关代理
public class GkApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(GkApiGateway.class, args);
    }
}
