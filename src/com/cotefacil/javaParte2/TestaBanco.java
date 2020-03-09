package com.cotefacil.javaParte2;

import com.cotefacil.bytebankencapsulado.Cliente;
import com.cotefacil.bytebankencapsulado.Conta;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");
        paulo.setCpf("222.222.222-22");
        paulo.setProfissao("programador");

        Conta contaDoPaulo = new Conta(13454, 123123);
        contaDoPaulo.deposita(100);

        contaDoPaulo.setTitular(paulo);
        System.out.println(contaDoPaulo.getTitular().getNome());
    }

}
