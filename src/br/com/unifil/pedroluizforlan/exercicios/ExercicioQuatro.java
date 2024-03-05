package br.com.unifil.pedroluizforlan.exercicios;

import java.util.Scanner;

public class ExercicioQuatro {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe um sálario para saber o aumento de 15%: ");
        double salario = sc.nextDouble();

        double aumento = salario * 0.15;
        salario += aumento;
        System.out.println("Valor final do salário: R$" + salario  + "\n"+
                "Valor do aumento: R$" + aumento);

    }
}
