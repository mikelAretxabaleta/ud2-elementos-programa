package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean esPrimo = true;

        System.out.print("Escribe un número: ");
        int numero = Integer.parseInt(br.readLine());


        for (int i = numero-1; i > 2 && esPrimo; i--) {


            if (numero % i == 0) {
                System.out.println("No es primo");
                esPrimo = false;
            }

        }

        if (esPrimo) System.out.println("Es primo");

    }
}
