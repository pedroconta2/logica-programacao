package br.com.unifil.pedroluizforlan.atividade_part1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList nomes = new ArrayList();

        for(int i = 0; i < 5 ;i++){
            System.out.println("Escreva um nome para ser armazenado: ");
            String nome = sc.next();
            nomes.add(nome);
        }

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(i+1 + " - "+ nomes.get(i));
        }
    }
}
