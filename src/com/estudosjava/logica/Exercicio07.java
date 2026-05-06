package com.estudosjava.logica;

//Misturando switch + if

public class Exercicio07 {
    public static void main(String[] args) {
        String tipoUsuario = "aluno";
        int idade = 18;

        switch(tipoUsuario){
            case "admin":
                System.out.println("acesso total");
                break;
            case "cliente":
                if (idade >=18) {
                    System.out.println("acesso liberado");
                } else {
                    System.out.println("Acesso restrito");
                } break;
            case "visitante":
                System.out.println("Acesso limitado");
                break;
            default:
                System.out.println("Tipo inválido");

        }
    }
}
