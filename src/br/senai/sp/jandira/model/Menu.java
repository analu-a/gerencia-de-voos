package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu extends Voos{

    Scanner teclado = new Scanner(System.in);
    public Menu(String origem, String destino, int numeroVoo) {
        super(origem, destino, numeroVoo);

        System.out.println("Como deseja pesquisar as informações de  voo?");
        System.out.println("1- [Número do voo]");
        System.out.println("2- [Origem do voo]");
        System.out.println("3- [Destino do voo]");
        int resposta = teclado.nextInt();

        switch (resposta){

            case 1:
                System.out.println("Digite o número do voo: ");
                int informacao = teclado.nextInt();

                break;

            case 2:
                System.out.println("Digite a origem do voo: ");
                String origemInfo = teclado.nextLine();

                break;

            case 3:
                System.out.println("Digite o destino do voo: ");
                String destinoInfo = teclado.nextLine();

                break;
        }


    }
}
