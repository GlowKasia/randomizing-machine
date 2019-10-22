package pl.sdajava25cloud.randomizingmachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


//@EnableDiscoveryClient
@SpringBootApplication
public class RandomizingMachineApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomizingMachineApplication.class, args);
    }

}
