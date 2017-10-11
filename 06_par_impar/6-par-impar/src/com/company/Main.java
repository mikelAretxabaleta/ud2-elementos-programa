package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un número: ");

        int texto = Integer.parseInt(br.readLine());

        if (texto % 2 == 0){
            System.out.println(texto + " es par.");
        }
        else System.out.println(texto + " es impar.");


    }
}
