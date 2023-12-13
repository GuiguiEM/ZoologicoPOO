package br.senai.sp.jandira.model;

public class Reptilianos extends Animal{

    public void cadastroMamiferos(){
        System.out.println("/-/-/-/-/ CADASTRO /-/-/-/-/-/");
        System.out.println("");
        System.out.println("Informe a espécie do reptil:  ");
        super.especie = scanner.nextLine();
        System.out.println("Informe a idade do reptil: ");
        super.idade = scanner.nextInt();
        System.out.println("Informe o sexo do reptil: ");
        super.sexo = scanner.nextLine();
        System.out.println("Informe a dieta do reptil: ");
        super.dieta = scanner.nextLine();
        System.out.println("Informe o peso do reptil: ");
        super.peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }

}