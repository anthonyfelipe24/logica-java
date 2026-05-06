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
    }
}
