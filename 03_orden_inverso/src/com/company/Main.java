package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce un número: ");

        int n1= Integer.parseInt(br.readLine());

        System.out.print("Introduce otro número: ");

        int n2= Integer.parseInt(br.readLine());

        System.out.print("Introduce otro número: ");

        int n3= Integer.parseInt(br.readLine());

        System.out.println("Números en orden inverso: "+n3+" "+n2+" "+n1);
    }
}
