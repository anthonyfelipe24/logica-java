package com.estudosjava.logica.estudos.exercicios;

public class Exercicio01Revisão {
    public static void main(String[] args) {
        String Aluno = "joão";
        int idade = 20;
        int Nota01 = 8;
        int Nota02 = 7;
        int Nota03 = 8;
        double media = (Nota01 + Nota02 + Nota03) / 3.0;
        System.out.println("Média: " + media);
        if( media >= 7){
            System.out.println("Aluno: "+Aluno+" Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno: "+Aluno+" Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
        if (idade >= 18) {
            System.out.println("Aluno maior de idade");
        }
        else {
            System.out.println("Aluno menor de idade");
        }

    }
}
