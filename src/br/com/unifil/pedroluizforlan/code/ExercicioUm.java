package br.com.unifil.pedroluizforlan.code;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioUm {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList nomes = new ArrayList();

        for(int i = 0; i<3;i++){
            System.out.println("Informe o nome: " );
            String nome = sc.nextLine();
            nomes.add(nome);
        }

        System.out.println(nomes.toString());
    }
}
