package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String resp;

        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int numero= -1;

        do {
            System.out.print("Introduzca un valor (o \"fin\" para terminar): ");
            resp = br.readLine();


            if (resp.equalsIgnoreCase("fin")) {
                System.out.println("Adios!!!!");
            } else {


                try {
                    numero = Integer.parseInt(resp);
                } catch (NumberFormatException e) {
                    System.out.println("respuesta no válida");
                }

                total += numero;

                if (numero > max) max = numero;
                if (numero < min) min = numero;

            }
        } while (!resp.equalsIgnoreCase("fin"));
        System.out.println("Total: " + total);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
