package com.cotefacil.javaParte1;

public class TesteIR {

    public static void main(String[] args) {
        double salario = 3300.00;

        if (salario >= 1900.00 && salario <= 2800.00) {
            System.out.println("Seu imposto é o total de R$" + (salario * 0.075) + "reais.");
        }else if (salario > 2800.00 && salario < 3751.0) {
            System.out.println("Seu imposto é o total de R$" + (salario * 0.15) + "reais.");
        }else if (salario > 3751.00 && salario < 4664.0) {
            System.out.println("Seu imposto é o total de R$" + (salario * 0.225) + "reais.");
        }


    }

}
