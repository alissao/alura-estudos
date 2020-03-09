package com.cotefacil.javaParte2;

import com.cotefacil.bytebankencapsulado.Conta;

public class TesteSacaNegativo {

    public static void main(String[] args) {
        Conta conta = new Conta(123123, 34234);
        conta.deposita(100);
        System.out.println("Tentei sacar 200. Deu certo?" + conta.saca(200));
        System.out.println("Saldo: R$" + conta.getSaldo());

//        conta.saldo -= 101;
        System.out.println("Acessando atributos diretamente, " +
                "sacamos 101 reais da conta. Saldo novo: R$"  + conta.getSaldo());

        System.out.println(conta.getSaldo());

    }

}
