package fun.guoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhous
 * @create 2020-03-27 10:50
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GkGoodsService {

    public static void main(String[] args) {
        SpringApplication.run(GkGoodsService.class, args);
    }
}
