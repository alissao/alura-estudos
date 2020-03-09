package com.cotefacil.javaParte2;

import com.cotefacil.bytebankencapsulado.Conta;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta conta = new Conta(345, 764745);
        conta.deposita(100);
        conta.deposita(50);
        System.out.println(conta.getSaldo());

        boolean conseguiuRetirar = conta.saca(20);
        System.out.println(conta.getSaldo());
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta(123123, 345345);
        contaDaMarcela.deposita(1000);
        if (contaDaMarcela.transfere(300, conta)) {
            System.out.println("Transferência feita com sucesso!");
        }

        System.out.println("Saldo da Marcela: R$" + contaDaMarcela.getSaldo());
        System.out.println("Saldo da sua conta: R$" + conta.getSaldo());
    }

}
