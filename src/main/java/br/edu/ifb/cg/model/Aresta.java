/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.model;

/**
 *
 * @author jeronimo
 */
public class Aresta {
    
    private Integer indice;
    private Vertice2D origem;
    private Vertice2D destino;

    public Aresta(Vertice2D origem, Vertice2D destino) {
        if(origem == null)
            throw new IllegalArgumentException("origem");
        if(destino == null)
            throw new IllegalArgumentException("destino");
        this.origem = origem;
        this.destino = destino;
    }
    
    public boolean seTocam(Aresta aresta){
        return (this.destino.equals(aresta.getOrigem()));
    }
    
    public Vertice2D getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice2D origem) {
        this.origem = origem;
    }

    public Vertice2D getDestino() {
        return destino;
    }

    public void setDestino(Vertice2D destino) {
        this.destino = destino;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }
    
}
