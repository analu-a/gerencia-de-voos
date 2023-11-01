package br.senai.sp.jandira.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

abstract class Voos {
    String origem, destino;
    int numeroVoo;

    List<Voos> listaVoos = new ArrayList<>();

    public void adicionarVoo(Voos voo){
        listaVoos.add(voo);
    }

    public void exibirVoos(){
        for (Voos voo: listaVoos){
            System.out.println(voo.getNumeroVoo());
            System.out.println(voo.getOrigem());
            System.out.println(voo.getDestino());
        }
    }

    public Voos(String origem, String destino, int numeroVoo) {
        this.origem = origem;
        this.destino = destino;
        this.numeroVoo = numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

}
