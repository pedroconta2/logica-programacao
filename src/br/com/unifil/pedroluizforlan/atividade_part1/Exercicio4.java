package br.com.unifil.pedroluizforlan.atividade_part1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList valores = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            System.out.println("Informe um numero para a posição "+ i +": ");
            valores.add(sc.nextInt());
        }

        for (int i = 0; i < valores.size();i++ ){
            int posi = i + 1;
            if((Integer) valores.get(i) % 2 == 0)
                System.out.println("O valor "+ valores.get(i) + " da posição " + posi + " é par");
        }
    }
}
