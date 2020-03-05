package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // retrieve bean from spring container
        Coach footballCoach = context.getBean("myFootballCoach", Coach.class);
        Coach golfCoach = context.getBean("myGolfCoach", Coach.class);
        Coach tennisCoach = context.getBean("myTennisCoach", Coach.class);


        // call methods on the bean
        footballCoach.getDailyWorkout();
        golfCoach.getDailyWorkout();
        tennisCoach.getDailyWorkout();

        // close the context
        context.close();
    }

}
