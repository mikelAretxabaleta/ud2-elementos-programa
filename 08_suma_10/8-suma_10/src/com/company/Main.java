package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int suma = 0;

        for (int i = 0; i < 10; i++) {


            System.out.print("Introduce un número: ");

            int numero = Integer.parseInt(br.readLine());

            suma += numero;



        }
        System.out.println("La suma de los 10 números es: "+suma);

    }
}
