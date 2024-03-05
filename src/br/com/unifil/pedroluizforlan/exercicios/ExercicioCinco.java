package br.com.unifil.pedroluizforlan.exercicios;

import java.util.Scanner;

public class ExercicioCinco {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe a nota 1: ");
        double nota1 = sc.nextInt() * 2;
        System.out.println("Informe a nota 2: ");
        double nota2 = sc.nextInt() * 3;
        System.out.println("Infomre a nota 3: ");
        double nota3 = sc.nextInt() * 4;

        double media = (nota1+nota2+nota3)/(2+3+4);

        System.out.println("Media ponderada: "+ media);
    }
}
