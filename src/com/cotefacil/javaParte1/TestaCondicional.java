package com.cotefacil.javaParte1;

public class TestaCondicional {

    public static void main(String[] args) {
        System.out.println("Testando condicionais: ");
        int idade = 20;
        int quantidadePèssoas = 3;

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos!");
            System.out.println("Seja bem vindo!");
        }
        else {
            if (quantidadePèssoas >= 2) {
                System.out.println("Você não tem 18, mas pode entrar, " +
                        "pois está acompanhado.");
            }
            else {
                System.out.println("Infelizmente você não pode entrar!");
            }
        }
    }

}
