package com.cotefacil.javaParte1;

public class TestaConversao {

    public static void main(String[] args) {

        double salario = 1270.50;

        float pi = 3.14f; // literal (problema com double e float no java)

        int valor = ((int) salario);

        System.out.println(valor);

        double valor1 = 0.2;
        double valor2 = 0.1;

        System.out.println(valor1 + valor2);

    }

}
