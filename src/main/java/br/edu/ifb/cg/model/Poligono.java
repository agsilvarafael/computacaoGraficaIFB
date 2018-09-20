/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.model;

import java.util.List;

/**
 *
 * @author jeronimo
 */
public class Poligono {
    
    private Integer indice;
    private Integer lados;
    private Integer indiceArestaInicial;
    private Integer indiceArestaFinal;
    private List<Aresta> arestas;

    public Poligono(Integer indice, List<Aresta> arestas) {
        if(arestas.isEmpty() || !Poligono.isPoligono(arestas))
            throw new IllegalArgumentException("origem");
        this.indice = indice;
        this.lados = arestas.size();
        this.arestas = arestas;
        this.indiceArestaInicial = arestas.get(0).getIndice();
        this.indiceArestaFinal = arestas.get(lados - 1).getIndice();
    }    

    public Poligono(Integer indiceArestaInicial, Integer indiceArestaFinal) {
        this.lados = indiceArestaFinal - indiceArestaInicial + 1;
        this.indiceArestaInicial = indiceArestaInicial;
        this.indiceArestaFinal = indiceArestaFinal;
    }
    
    public static boolean isPoligono(List<Aresta> arestas){
        return arestas.get(0).getOrigem().
                equals(arestas.get(arestas.size() - 1).getDestino());
    }
    
    public boolean isClose(Vertice2D vertice){
        return arestas.get(0).getOrigem().equals(vertice);
    }
    
    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Integer getLados() {
        return lados;
    }

    public void setLados(Integer lados) {
        this.lados = lados;
    }

    public Integer getIndiceArestaInicial() {
        return indiceArestaInicial;
    }

    public void setIndiceArestaInicial(Integer indiceArestaInicial) {
        this.indiceArestaInicial = indiceArestaInicial;
    }

    public Integer getIndiceArestaFinal() {
        return indiceArestaFinal;
    }

    public void setIndiceArestaFinal(Integer indiceArestaFinal) {
        this.indiceArestaFinal = indiceArestaFinal;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(List<Aresta> arestas) {
        this.arestas = arestas;
    }
    
}
