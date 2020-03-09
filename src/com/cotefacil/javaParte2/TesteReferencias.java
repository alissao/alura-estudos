package com.cotefacil.javaParte2;

import com.cotefacil.bytebankencapsulado.Conta;

public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(4324, 7456);
        primeiraConta.deposita(300);

        System.out.println("Saldo da primeira conta: R$" + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: R$" + segundaConta.getSaldo());

        System.out.println("Atualizando o saldo da sua segunda conta para 50 reais.");
        segundaConta.deposita(50);
        System.out.println("A sua primeira conta tem: R$" + primeiraConta.getSaldo());
        System.out.println("A sua segunda conta tem: R$" + segundaConta.getSaldo());

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesma conta.");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }

}
