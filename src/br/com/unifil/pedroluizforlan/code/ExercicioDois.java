package br.com.unifil.pedroluizforlan.code;


import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioDois {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList nomes = new ArrayList<>();
        ArrayList notas = new ArrayList<>();

        for(int i = 0; i<3;i++){
            System.out.println("Informe o nome do aluno: ");
            String nome = sc.next();
            nomes.add(nome);

            System.out.println("Informe a nota do aluno: ");
            Integer nota = sc.nextInt();
            notas.add(nota);
        }

        for(int i = 0; i < notas.size(); i++){
            System.out.println("Aluno: "+ nomes.get(i)+ " Nota: "+ notas.get(i));
        }



    }
}
