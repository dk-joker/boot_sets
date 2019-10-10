package org.joker.springboot.sheduledtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SheduledTasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SheduledTasksApplication.class, args);
    }

}
