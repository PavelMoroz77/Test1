package org.example;

import java.util.Random;

public class Functions {
    public static int getLocalNumber(int num){
        return num;
    }
    public static int getRandomNumber() {
        Random random = new Random();
        int number = random.nextInt(2)+13;
        return number;
    }
}
