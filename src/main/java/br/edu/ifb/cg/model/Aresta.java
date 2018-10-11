/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.model;

/**
 *
 * @author Jeronimo Hermano
 */
public class Aresta {
    
    private Integer indice;
    private Integer indiceOrigem;
    private Integer indiceDestino;

    public Aresta(Integer indiceOrigem, Integer indiceDestino) {
        this.indiceOrigem = indiceOrigem;
        this.indiceDestino = indiceDestino;
    }

    public Aresta(Integer indice, Integer indiceOrigem, Integer indiceDestino) {
        this.indice = indice;
        this.indiceOrigem = indiceOrigem;
        this.indiceDestino = indiceDestino;
    }
    
    public boolean seTocam(Aresta aresta){
        return MatrizVertices.getInstance().getVertice(this.indiceDestino).
                equals(MatrizVertices.getInstance().getVertice(aresta.getIndiceOrigem()));
    }

    public Integer getIndiceOrigem() {
        return indiceOrigem;
    }

    public void setIndiceOrigem(Integer indiceOrigem) {
        this.indiceOrigem = indiceOrigem;
    }

    public Integer getIndiceDestino() {
        return indiceDestino;
    }

    public void setIndiceDestino(Integer indiceDestino) {
        this.indiceDestino = indiceDestino;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }
    
}
