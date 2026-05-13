package com.estudosjava.logica;

public class Exercicio09 {
    /*🥇 Exercício 1 — FOR + IF
Crie um programa que:
✅ Mostre os números de 1 até 20
MAS:
❌ quando encontrar o número 13
o laço deve parar usando break*/
    public static void main(String[] args) {
        for ( int i = 1; i <= 20; i++) {
            if (i == 13) {
                break;
            }
            System.out.println(i);
        }

    }

}
