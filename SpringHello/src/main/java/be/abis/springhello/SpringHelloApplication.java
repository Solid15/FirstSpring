package be.abis.springhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication                          // this does a componentscan in his package and subpackages
public class SpringHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHelloApplication.class, args);
    }

}
