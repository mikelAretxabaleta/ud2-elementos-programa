package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        double precio, dineroIntroducido;
        int precioC, dineroIntroducidoC;

        do {
            System.out.print("¿Cual es el precio?(en euros): ");
            precio = Double.parseDouble(br.readLine());
            precioC= (int) (precio*100);

            System.out.print("Introduzca su dinero: ");
            dineroIntroducido = Double.parseDouble(br.readLine());
            dineroIntroducidoC = (int) (dineroIntroducido*1000/10);

            System.out.println(precio);
            System.out.println(dineroIntroducido);
            System.out.println(precioC);
            System.out.println(dineroIntroducidoC);

        }while (precioC%5!=0 || dineroIntroducidoC%5!=0 || precioC<0 || dineroIntroducidoC<0);
            int cambioCentimos = dineroIntroducidoC - precioC;



        System.out.println((cambioCentimos/200) +" de 2 euros");
        System.out.println((cambioCentimos%200)/100+" de 1 euro");
        System.out.println(((cambioCentimos%200)%100)/50+ " de 50 céntimos");
        System.out.println(((((cambioCentimos%200)%100)%50)/20)+ " de 20 céntimos");
        System.out.println((((((cambioCentimos%200)%100)%50)%20)/10)+ " de 10 céntimos");
        System.out.println(((((((cambioCentimos%200)%100)%50)%20)%10)/5)+ " de 5 céntimos");



    }
}
