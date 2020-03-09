package com.cotefacil.javaParte2;

import com.cotefacil.bytebankencapsulado.Conta;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(123123, 23483247);
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(456456, 456456);
        segundaConta.deposita(50);
        System.out.println("A primeira conta tem: R$" + primeiraConta.getSaldo());
        System.out.println("A segunda conta tem: R$" + segundaConta.getSaldo());
    }

}
