package com.example.demo;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tennis implements Coach{

    private File file;
    private List<String> schedule = new ArrayList<>();

    public Tennis(File file) {
        this.file = file;
    }

    @Override
    public void getDailyWorkout(){
        Random r = new Random();
        int index = r.nextInt(schedule.size());
        System.out.println(schedule.get(index));
    }

    @PostConstruct
    public void fileReader() throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            schedule.add(scan.nextLine());
        }
    }
}
