package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Aves  extends Animal{

    Scanner scanner = new Scanner(System.in);

    public void cadastroAves(){
        System.out.println("/-/-/-/-/ CADASTRO /-/-/-/-/-/");
        System.out.println("");
        System.out.println("Informe a espécie da Ave:  ");
        super.especie= scanner.nextLine();
        System.out.println("Informe a idade da Ave: ");
        super.idade = scanner.nextInt();
        System.out.println("Informe o sexo da Ave: ");
        super.sexo = scanner.nextLine();
        System.out.println("Informe a dieta da Ave: ");
        super.dieta = scanner.nextLine();
        System.out.println("Informe o peso da Ave: ");
        super.peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }

}