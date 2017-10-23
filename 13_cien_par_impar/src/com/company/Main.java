package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("¿Par o Impar?: ");

        String resp= br.readLine().toLowerCase();

        int i=0;

        switch (resp){

            case "par":
                do {
                    System.out.println(200 - i);
                    i += 2;
                }while(i<202);
                break;
            case "impar":
                do {
                    System.out.println(201 - i);
                    i += 2;
                }while(i<202);
                break;



        }

    }
}
