package br.com.unifil.pedroluizforlan.code;

import java.util.Scanner;
//Exercicio bi
public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0)
            System.out.println("É bi");
    }

}
