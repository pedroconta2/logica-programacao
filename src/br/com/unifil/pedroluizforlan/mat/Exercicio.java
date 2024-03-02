package br.com.unifil.pedroluizforlan.mat;


import java.util.Scanner;

public class Exercicio {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe um valor em real : ");
        int valor = scanner.nextInt();
        int qtdCem = 0;
        int qtdCin = 0;
        int qtdVin = 0;
        int qtdDez = 0;
        int qtdFiv = 0;

        if (valor % 5 == 0) {
            if (valor >= 100) {
                qtdCem = valor / 100;
                valor = valor - 100 * qtdCem;
            }
            if (valor >= 50) {
                qtdCin = valor / 50;
                valor = valor - 50 * qtdCin;
            }

            if (valor >= 20) {
                qtdVin = valor / 20;
                valor = valor - 20 * qtdVin;
            }
            if (valor >= 10) {
                qtdDez = valor / 10;
                valor = valor - 10 * qtdDez;
            }
            if (valor >= 5) {
                qtdFiv = valor / 5;
                valor = valor - 5 * qtdFiv;
            }

            System.out.println("Total notas 100: "+qtdCem);
            System.out.println("Total notas 50: "+qtdCin);
            System.out.println("Total notas 20: "+qtdVin);
            System.out.println("Total notas 10: "+qtdDez);
            System.out.println("Total notas 5: "+qtdFiv);
        }else {
            System.out.println("Valor inválido. ");
        }
    }
}
