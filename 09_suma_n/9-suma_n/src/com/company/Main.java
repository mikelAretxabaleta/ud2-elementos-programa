package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("¿Cuantos valores quiere sumar?");

        int n = Integer.parseInt(br.readLine());

        int suma = 0;

        for (int i = 0; i < n; i++) {


            System.out.print("Introduce un número: ");

            int numero = Integer.parseInt(br.readLine());

            suma += numero;

        }
        System.out.println("La suma de los "+n+" números es "+suma);


    }
}
