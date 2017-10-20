package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un número: ");

        int numero = Integer.parseInt(br.readLine());

        if (numero % 2 == 0){
            System.out.println(numero + " es par.");
        }
        else System.out.println(numero + " es impar.");


    }
}
