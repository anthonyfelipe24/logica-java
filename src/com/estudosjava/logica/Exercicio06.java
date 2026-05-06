package com.estudosjava.logica;

public class Exercicio06 {
    public static void main(String[] args) {
    int menu = 5;
    switch (menu){
        case 1:
            System.out.println("Cadastrar usuário");
            break;
        case 2:
            System.out.println("Listar usuários");
            break;
        case 3:
            System.out.println("Excluir usuario");
            break;
        case 4:
            System.out.println("Sair");
            break;
        default:
            System.out.println("Opção inválida");
            break;
    }
    }
}
