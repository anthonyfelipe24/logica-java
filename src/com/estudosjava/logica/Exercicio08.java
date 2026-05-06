package com.estudosjava.logica;

public class Exercicio08 {
    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 5;
        String operacao = "+";
               switch(operacao){
                   case "+":
                       System.out.println(numero1 + numero2);
                       break;
                   case "-":
                       System.out.println(numero1 - numero2);
                       break;
                       case "*":
                           System.out.println(numero1 * numero2);
                           break;
                           case "/":
                               if (numero2 == 0) {
                                   System.out.println("Erro: divisão por zero");
                               } else {
                                   System.out.println(numero1 / numero2);
                               }
                               break;
                   default:
                       System.out.println("operação inválida");
        }
       /* int dia = 3;
        String nomeDia;
        switch (dia) {
            case 1: nomeDia = "Segunda"; break;
            case 2: nomeDia = "Terça"; break;
            case 3: nomeDia = "Quarta"; break;
            default: nomeDia = "Dia inválido";
        }
        System.out.println(nomeDia); // Saída: Quarta*/

    }
}
