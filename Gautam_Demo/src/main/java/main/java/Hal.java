package main.java;

import java.awt.*;
import java.util.Random;
public class Hal{

    public static void main(String[] args) throws Exception {
        Robot hal = new Robot();
        Random random = new Random();
        while(true){
            System.out.println("Inside loop");
            hal.delay(1000 * 60);
            int x = random.nextInt() % 640;
            int y = random.nextInt() % 480;
            hal.mouseMove(x,y);
        }
    }
}