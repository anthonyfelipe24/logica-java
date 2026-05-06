package com.estudosjava.logica;

public class Exercicio05 {
    public static void main(String[] args) {
        int idade = 17;
        double salario = 2700.0;
        boolean nomeLimpo = true;
        double valorEmprestimo = 10000;
        if (idade >= 18 && salario >= 2000 && nomeLimpo && valorEmprestimo <= salario * 5) {
            System.out.println("Emprestimo APROVADO");
        }
        else {
        System.out.println("Emprestimo NEGADO");
        }

        // Código mais nivel júnior
       /* int idade = 20;
        double salario = 2700.0;
        boolean nomeLimpo = true;
        double valorEmprestimo = 10000;

        double limiteEmprestimo = salario * 5;

        boolean atendeIdade = idade >= 18;
        boolean atendeSalario = salario >= 2000;
        boolean dentroLimite = valorEmprestimo <= limiteEmprestimo;

        if (atendeIdade && atendeSalario && nomeLimpo && dentroLimite) {
            System.out.println("Emprestimo APROVADO");
        } else {
            System.out.println("Emprestimo NEGADO");*/
        }
    }

