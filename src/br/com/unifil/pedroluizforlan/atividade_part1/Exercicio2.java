package br.com.unifil.pedroluizforlan.atividade_part1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList vetorInicial = new ArrayList<>();
        ArrayList vetorFinal = new ArrayList<>();


        System.out.println("Informe 5 numeros (formato: x y z w n): ");

        for (int i = 0; i<5;i++)
            vetorInicial.add(sc.nextInt());

        for (int i = 0; i < vetorInicial.size(); i++){
            vetorFinal.add((Integer) vetorInicial.get(i) * 2);
        }

        System.out.println(vetorFinal.toString());

    }
}
