package works.weave.socks.shipping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ShippingServiceApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ShippingServiceApplication.class, args);
	//some change
    }
}
