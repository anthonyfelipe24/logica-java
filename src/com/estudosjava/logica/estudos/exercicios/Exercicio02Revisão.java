package com.estudosjava.logica.estudos.exercicios;

public class Exercicio02Revisão {
    public static void main(String[] args) {
        String nomeDoProduto = "Teclado";
        double precoDoProduto = 80;
        int quantidadeComprada = 2;
        double valorDaCompra = precoDoProduto * quantidadeComprada;
        double valorTotal;
        double desconto;
        double percentualDesconto;
        if (valorDaCompra < 100) {
            desconto = 0;
            percentualDesconto = 0;
            valorTotal = valorDaCompra;
        } else if (valorDaCompra < 200) {
            desconto = valorDaCompra * 0.05;
            percentualDesconto = 5;
            valorTotal = valorDaCompra - desconto;
        } else {
            desconto = valorDaCompra * 0.10;
            percentualDesconto = 10;
            valorTotal = valorDaCompra - desconto;
        }
        System.out.println("Nome do Produto: " + nomeDoProduto);
        System.out.println("Quantidade: " + quantidadeComprada);
        System.out.println("Valor sem o desconto: " + valorDaCompra);
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor Final: " + valorTotal);
    }
}
