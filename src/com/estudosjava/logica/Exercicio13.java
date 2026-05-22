package com.estudosjava.logica;

public class Exercicio13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if ( i == 5 || i == 3 || i == 7) {
                continue;
            }
            System.out.println("Tentativa " + i);
        }

    }
}
