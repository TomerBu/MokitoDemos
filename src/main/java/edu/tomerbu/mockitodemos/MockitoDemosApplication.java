package edu.tomerbu.mockitodemos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MockitoDemosApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(MockitoDemosApplication.class, args);
        BusinessServiceImpl impl = app.getBean(BusinessServiceImpl.class);

        System.out.println(impl.findTheGreatestFromAllData());
    }
}
