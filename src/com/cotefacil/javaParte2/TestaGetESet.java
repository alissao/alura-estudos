package com.cotefacil.javaParte2;

import com.cotefacil.bytebankencapsulado.Cliente;
import com.cotefacil.bytebankencapsulado.Conta;

public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(137, 24226);
//        conta.numero = 1377;
        conta.setNumero(1377);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
//        conta.titular = paulo;
        conta.setTitular(paulo);

        Cliente novoCliente = conta.getTitular();

        System.out.println(conta.getTitular());
        System.out.println(paulo);
        System.out.println(novoCliente);
    }

}
