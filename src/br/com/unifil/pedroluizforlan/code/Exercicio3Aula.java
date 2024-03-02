package br.com.unifil.pedroluizforlan.code;

import java.util.Scanner;

public class Exercicio3Aula {
    public static void main(String[] args) {
        double valor1, valor2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar o valor 1: ");
        valor1 = scanner.nextDouble();
        System.out.println("Informar outro valor: ");
        valor2 = scanner.nextDouble();

        double soma = valor1+valor2;
        double dif = valor1-valor2;
        double mult = valor1*valor2;

        double div = valor1 / valor2;


        System.out.println(soma);
        System.out.println(dif);
        System.out.println(mult);

        if(valor2 != 0) {
            System.out.println(div);
        } else {
            System.out.println("Não é possivel dividir");
        }





        /*
        if(valor2 != 0) {
            System.out.println(valor1 / valor2);
        } else {
            System.out.println("Não é possivel dividir ");
        }
        */
    }
}
