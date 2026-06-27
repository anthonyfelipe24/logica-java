package com.estudosjava.logica.estudos.exercicios;

public class Exercicio14 {
    public static void main(String[] args) {
        double[] precos = {20.50, 80.00, 15.00, 120.30, 45.00, 60.00};
        double somaTotal = 0;
        for( int i = 0; i < precos.length; i++){
            if( precos[i] > 50.00){
                somaTotal += precos[i];
            }
        }
        System.out.println(somaTotal);
    }
}
