package com.Jeetcode;

public class Main {

    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {


            int brojkaTri = i % 3;
            int brojkaPet = i % 5;
            int brojkaDeset = i % 10;
            int brojkaPetINula = (brojkaTri) + (brojkaPet);


            if (brojkaPetINula == 0) {
                System.out.println("Broj je djeljiv sa 3 i 5");


            } else  if (brojkaTri == 0) {
                System.out.println(i);


            } else if (brojkaDeset == 0) {
                System.out.println("Broj je djeljiv sa 10");


            } else if (brojkaPet == 0) {
                System.out.println(i);


            } else System.out.println("Broj nije djeljiv");
        }
    }
}

