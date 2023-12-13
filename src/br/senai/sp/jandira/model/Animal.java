package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {

    Scanner scanner = new Scanner(System.in);

    String nome, especie, dieta, sexo;
    double peso;
    int idade, sizeLista;

    public void cadastroAnimal(){
        System.out.println("/-/-/-/-/ CADASTRO /-/-/-/-/-/");
        System.out.println("");
        System.out.println("Informe a espécie do animal:  ");
        especie = scanner.nextLine();
        System.out.println("Informe a idade do animal: ");
        idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe o sexo do animal: ");
        sexo = scanner.nextLine();
        System.out.println("Informe a dieta do animal: ");
        dieta = scanner.nextLine();
        System.out.println("Informe o peso do animal: ");
        peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }

    List<Animal> listaAnimal = new ArrayList<>();
    public void addAnimais(Animal animal){
        listaAnimal.add(animal);
        sizeLista = listaAnimal.size();
    }
    public void listAnimais(){
        if (listaAnimal.isEmpty()) {
            for (Animal animal : listaAnimal) {
                System.out.println("******************************");
                System.out.println("Espécie: " + animal.especie);
                System.out.println("Dieta: " + animal.dieta);
                System.out.println("Peso: " + animal.peso);
                System.out.println("Sexo: " + animal.sexo);
                System.out.println("Idade: " + animal.idade);
            }
        }
        else {
            System.out.println("O Animal procurado não consta em nosso sistema, verifique se ele foi cadastrado.");

        }
    }

}