package br.com.unifil.pedroluizforlan.exercicios;

import java.util.Scanner;

public class ExercicioSeis {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe um valor em metros para saber em km, cm ,dm, dam e hm: ");
        double metros = sc. nextDouble();


        double km = metros / 1000;
        double cm = metros * 100;
        double dm = metros * 10;
        double dam = metros / 10;
        double hm = metros / 100;

        System.out.println("Em km: " + km);
        System.out.println("Em cm: " + cm);
        System.out.println("Em dm: " + dm);
        System.out.println("Em dam: " + dam);
        System.out.println("Em hm: " + hm);
    }
}
