package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();
        int random = r.nextInt(101);

        int n;

        do {

            System.out.print("Elige un número entre 0 y 100: ");

            n = Integer.parseInt(br.readLine());

            if (n == random) {
                System.out.println("Has acertado!!!");
            } else {
                if (n > random) {
                    System.out.println("Te has pasado...");
                } else {
                    System.out.println("No llegas...");
                }
            }

        } while (n != random);


    }
}
