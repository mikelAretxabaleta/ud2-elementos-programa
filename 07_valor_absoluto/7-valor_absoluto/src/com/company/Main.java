package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un número: ");

        int numero=Integer.parseInt(br.readLine());

        if (numero==0 || numero>0){
            System.out.println("El número es: "+numero);
        }
        else {
            System.out.println("El número es: "+numero*(-1));
        }


    }
}
