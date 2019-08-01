package com.itchat4j;

import com.itchat4j.handler.MyTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Itchat4jApplication {
    public static void main(String[] args) {
        SpringApplication.run(Itchat4jApplication.class, args);
        MyTest.main(args);
    }
}
