package br.com.unifil.pedroluizforlan.code;

import java.util.Scanner;

public class Exercicio2Aula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;

        System.out.println("Informe um valor");
        valor = sc.nextDouble();

        System.out.println(valor * 2);
        System.out.println(valor * 3);
        System.out.println(valor / 2);

    }
}
