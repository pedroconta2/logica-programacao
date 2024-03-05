package br.com.unifil.pedroluizforlan.exercicios;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0)
            System.out.println("É bi");
    }
}
