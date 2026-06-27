package com.estudosjava.logica.estudos.poo.testeCarro;

import com.estudosjava.logica.estudos.poo.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel =0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);

        System.out.println("--------------");

        Carro moto = new Carro();
        moto.marca = "Honda";
        moto.modelo = "CG";
        moto.numPassageiros = 2;
        moto.capCombustivel = 50;
        moto.consumoCombustivel =1;

        System.out.println(moto.marca);
        System.out.println(moto.modelo);
        System.out.println(moto.numPassageiros);
        System.out.println(moto.capCombustivel);
        System.out.println(moto.consumoCombustivel);


    }
}
