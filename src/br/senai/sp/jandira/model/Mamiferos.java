package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Mamiferos extends Animal{

    Scanner scanner = new Scanner(System.in);

    public void cadastroMamiferos(){
        System.out.println("/-/-/-/-/ CADASTRO /-/-/-/-/-/");
        System.out.println("");
        System.out.println("Informe a espécie do Mamiferos:  ");
        super.especie = scanner.nextLine();
        System.out.println("Informe a idade do Mamiferos: ");
        super.idade = scanner.nextInt();
        System.out.println("Informe o sexo do Mamiferos: ");
        super.sexo = scanner.nextLine();
        System.out.println("Informe a dieta do Mamiferos: ");
        super.dieta = scanner.nextLine();
        System.out.println("Informe o peso do Mamiferos: ");
        super.peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }
}