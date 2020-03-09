package com.cotefacil.javaParte2;

import com.cotefacil.bytebankencapsulado.Cliente;
import com.cotefacil.bytebankencapsulado.Conta;

public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta(123123, 123123);
        System.out.println(contaDaMarcela.getSaldo());

        contaDaMarcela.setTitular(new Cliente());
        System.out.println(contaDaMarcela.getTitular());

        contaDaMarcela.getTitular().setNome("Marcela");
        System.out.println(contaDaMarcela.getTitular().getNome());
    }

}
