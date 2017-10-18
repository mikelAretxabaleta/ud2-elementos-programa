package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce 1er nº: ");

        int n1=Integer.parseInt(br.readLine());

        System.out.print("Introduce 2do nº: ");

        int n2=Integer.parseInt(br.readLine());

        System.out.println("El nº1 por el nº2 es: "+(n1*n2));
    }
}
