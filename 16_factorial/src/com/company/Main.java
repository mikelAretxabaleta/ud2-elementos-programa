package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce un numero: ");
        int numero = Integer.parseInt(br.readLine());


        for (int i = numero - 1; i > 0; i--) {

            numero = numero * i;

        }
        System.out.println(numero);
    }
}
