package com.example.kbtg;

import java.util.Random;

import static java.lang.System.out;

public class DemoService {
    private Random random;
    public void setRandom(Random random) {
        this.random = random;
    }

    public String generateData(String name) {
        int number = random.nextInt(10);
        return name + number;
    }

    public static void main(String[] args) {
        // Anonymous class
        Random random = new Random(){
            @Override
            public int nextInt(int bound) {
                return 5;
            }
        };
        DemoService demoService = new DemoService();
        demoService.setRandom(random);
        out.println(demoService.generateData("somkiat"));
    }
}
