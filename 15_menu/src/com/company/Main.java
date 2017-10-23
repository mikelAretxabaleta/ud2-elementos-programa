package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char opcion;



        System.out.print("Introduce un número: ");
        int numero1 = Integer.parseInt(br.readLine());

        System.out.print("Introduce otro número: ");
        int numero2 = Integer.parseInt(br.readLine());


        do{
        System.out.println("MENÚ\n" +
                "----\n" +
                "a) Suma.\n" +
                "b) Resta.\n" +
                "c) Multiplicación.\n" +
                "d) División.\n" +
                "e) Resto.\n" +
                "f) Terminar.");

        System.out.println("Elige una opción: ");
        opcion = br.readLine().toLowerCase().charAt(0);

        switch (opcion) {

            case 'a':
                System.out.println(numero1 + numero2);
                break;
            case 'b':
                System.out.println(numero1 - numero2);
                break;
            case 'c':
                System.out.println(numero1 * numero2);
                break;
            case 'd':
                System.out.println(numero1 / numero2);
                break;
            case 'e':
                System.out.println(numero1 % numero2);
                break;
        }}while(opcion!='f');



    }
}
