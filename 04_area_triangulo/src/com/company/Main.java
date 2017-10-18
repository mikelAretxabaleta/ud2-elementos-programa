package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la base del triángulo: ");

        double base = Double.parseDouble(br.readLine());

        System.out.print("Introduce la altura del triángulo: ");

        double altura = Double.parseDouble(br.readLine());

        System.out.println("El área del triángulo es: " + base * altura / 2);


    }
}
