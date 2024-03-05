package br.com.unifil.pedroluizforlan.exercicios;

import java.util.Scanner;

public class ExercicioDois {
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
