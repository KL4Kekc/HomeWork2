package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String name = "Курманбек";
        Random random = new Random();
        int randomAge = random.nextInt(108);
        System.out.println("Случайный возрст: " + randomAge);
        int temperature = -4;
        boolean isCold = false;

        if ((randomAge > 20 && randomAge < 45 && temperature < 30 && temperature > -20)){
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Лучше остаться дома");
        }

    }
}
