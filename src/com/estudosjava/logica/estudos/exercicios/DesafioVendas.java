package com.estudosjava.logica.estudos.exercicios;

public class DesafioVendas {
    public static void main(String[] args) {

        String[] vendedores = {"Ana", "Bruno", "Carla"};

        double[][] vendas = {
                {20000.0, 25000.0, 18000.0, 22000.0}, // Ana
                {15000.0, 12000.0, 14000.0, 16000.0}, // Bruno
                {30000.0, 35000.0, 40000.0, 28000.0}  // Carla
        };

        double maiorVendaGeral = 0;
        String vendedorMaiorVenda = "";

        System.out.println("====== RELATÓRIO ANUAL DE DESEMPENHO ======\n");

        for (int i = 0; i < vendas.length; i++) {
            double totalVendasVendedor = 0;
            for (int j = 0; j < vendas[i].length; j++) {
                totalVendasVendedor += vendas[i][j];
                if (vendas[i][j] > maiorVendaGeral) {
                    maiorVendaGeral = vendas[i][j];
                    vendedorMaiorVenda = vendedores[i];
                }
            }
            double mediaVendas = 0;
            mediaVendas = totalVendasVendedor / vendas[i].length;

            double taxaComissao = 0;
            if (totalVendasVendedor < 60000.0) {
                taxaComissao = 0.02;
            } else if (totalVendasVendedor < 100000.0) {
                taxaComissao = 0.05;
            } else {
                taxaComissao = 0.10;
            }
            double valorComissao = 0;
            valorComissao = taxaComissao * totalVendasVendedor;

            int totalArredondado = 0;
            totalArredondado = (int) totalVendasVendedor;

            System.out.println("Vendedor(a): " + vendedores[i]);
            System.out.println("Total Vendido: R$ " + totalVendasVendedor + " (Arredondado: R$ " + totalArredondado + ")");
            System.out.println("Média Trimestral: R$ " + mediaVendas);
            System.out.println("Taxa de Comissão: " + (taxaComissao * 100) + "%");
            System.out.println("Valor da Comissão a Receber: R$ " + valorComissao);
            System.out.println("-------------------------------------------");
        }

        System.out.println("Destaque do Ano:");
        System.out.println("A maior venda em um único trimestre foi de R$ " + maiorVendaGeral + ", realizada por: " + vendedorMaiorVenda);
    }
}
