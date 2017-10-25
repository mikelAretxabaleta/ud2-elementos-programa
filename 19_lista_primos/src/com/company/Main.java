package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        System.out.print("Escribe un número: ");
        int numero = Integer.parseInt(br.readLine());


        for (int j=numero;j>1;j--) {

            boolean esPrimo = true;
            for (int i = j - 1; i > 1 && esPrimo; i--) {


                if (j % i == 0) {

                    esPrimo=false;
                }

            }


            if (esPrimo) System.out.println(j+" Es primo");

        }
        System.out.println(1+" Es primo");
    }
}
