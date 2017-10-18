package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Temperatura en grados centígrados: ");

        double gradosCentigrados=Double.parseDouble(br.readLine());

        String fOK;




        do {

            System.out.print("Fahrenheit (F) o Kelvin (K): ");

            fOK = br.readLine();
            fOK.toLowerCase();

            if (fOK.equals("f")) {

                System.out.println(gradosCentigrados + " grados centigrados son " + gradosCentigrados * 1.8 + " Fahrenheit");
            }
            if (fOK.equals("k")) {

                System.out.println(gradosCentigrados + " grados centigrados son " + (gradosCentigrados + 273.15) + " Kelvin");
            }



        } while (!fOK.equals("f") && !fOK.equals("k"));
    }
}
