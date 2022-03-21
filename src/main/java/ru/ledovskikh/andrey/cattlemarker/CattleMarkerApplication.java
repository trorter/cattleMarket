package ru.ledovskikh.andrey.cattlemarker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Andrey Ledovskikh
 */
@SpringBootApplication
@PropertySource("application.properties")
public class CattleMarkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CattleMarkerApplication.class, args);
    }

}
