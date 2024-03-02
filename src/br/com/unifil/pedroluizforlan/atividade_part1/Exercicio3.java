package br.com.unifil.pedroluizforlan.atividade_part1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList vetorPrimeiro = new ArrayList<>();
        ArrayList vetorSegundo = new ArrayList<>();
        ArrayList vetorTerceiro = new ArrayList<>();

        System.out.println("Informe 5 numeros inteiros (formato: x y z w n): ");
        for (int i = 0; i < 5; i++) {
            vetorPrimeiro.add(scanner.nextInt());
        }

        System.out.println("Informe 5 numeros inteiros (formato: x y z w n): ");
        for (int i = 0; i < 5; i++) {
            vetorSegundo.add(scanner.nextInt());
        }

        for (int i = 0; i < vetorSegundo.size(); i++) {
            vetorTerceiro.add((Integer) vetorPrimeiro.get(i)
                    + (Integer) vetorSegundo.get(i));
        }

        System.out.println(vetorTerceiro.toString());
    }
}