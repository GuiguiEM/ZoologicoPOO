package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Animal refAnimal = new Animal();
    Mamiferos refMamiferos = new Mamiferos();
    Reptilianos refReptilianos = new Reptilianos();
    Aves refAves = new Aves();

    boolean  continuar = true;

    int pesqUsuario, pesquisa;


    public void menuZoo(){

        while (continuar){
            System.out.println("****** BEM VINDO AO ZOO ******");
            System.out.println("Deseja exibir animais ou Cadastrar um novo animal?");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Exibir Animais Cadastrados");
            pesquisa = scanner.nextInt();

            switch (pesquisa){
                case 1:
                    System.out.println("Cadastrar:");
                    System.out.println("[1 - Mamiferos]");
                    System.out.println("[2 - Réptils]");
                    System.out.println("[3 - Aves]");
                    pesqUsuario = scanner.nextInt();

                    switch (pesqUsuario){
                        case 1:
                            Aves aves = new Aves();
                            aves.cadastroAnimal();
                            refAves.addAnimais(aves);
                            break;

                        case 2:
                            refReptilianos.cadastroAnimal();
                            break;

                        case 3:
                            refMamiferos.cadastroAnimal();
                            break;
                    }
                case 2:
                    refAnimal.listAnimais();
                    break;
            }
        }
    }
}