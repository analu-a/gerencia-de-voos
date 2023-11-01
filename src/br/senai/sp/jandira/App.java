package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Gol;

public class App {

    public static void main(String[] args) {

        Gol voo1 = new Gol("São Paulo" , "Tokyo", 123);
       voo1.adicionarVoo(voo1);
       voo1.exibirVoos();
    }
}
