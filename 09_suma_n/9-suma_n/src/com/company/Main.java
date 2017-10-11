package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("¿Cuantos valores quiere sumar?");

        int n = Integer.parseInt(br.readLine());

        int suma = 0, i = 0;

        do {
            System.out.println("Introduce un número: ");

            int numero = Integer.parseInt(br.readLine());

            suma += numero;

            i++;
        }while (n>i);

        System.out.println("La suma de "+n+"números es "+suma);


    }
}
