package com.estudosjava.logica.estudos.exercicios;

import java.sql.SQLOutput;

public class ExercicioArray01 {
    public static void main(String[] args) {
        int[] alunos = {8, 6, 10, 7, 9};
        int aprovados = 0;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] >= 7){
                aprovados += 1;
            }
            System.out.println("Notas : " + alunos[i]);
            System.out.println("----------");
        }
        System.out.println("Alunos Aprovados: " + aprovados);
    }
}
