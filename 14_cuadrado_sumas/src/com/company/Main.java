package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce un número: ");

        int numero = Integer.parseInt(br.readLine());

        int i = numero;

        int a = 0;

        int cuadrado=0;

        do {

            cuadrado += numero;
            a += 1;


        } while (a != i);

        System.out.println(cuadrado);

    }
}
