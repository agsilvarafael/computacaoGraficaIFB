/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Jeronimo Hermano
 */
public class Poligono {
    
    private Integer indice;
    private Integer lados;
    private Integer indiceArestaInicial;
    private Integer indiceArestaFinal;
    private Color corPreenchimento;
    private Envelope envelope;

    /**
     * Construtor padrão da classe deixado para caso seja necessário instanciar
     * um objeto sem atribuição direta
     */
    public Poligono() {}

    /**
     * Construtor que recebe os índices das arestas inicial e final que o compõe.
     * @param indiceArestaInicial Integer: indice da aresta inicial em MatrizArestas.
     * @param indiceArestaFinal Integer: indice da aresta final em MatrizArestas.
     * @see MatrizArestas
     */
    public Poligono(Integer indiceArestaInicial, Integer indiceArestaFinal) {
        this.lados = indiceArestaFinal - indiceArestaInicial + 1;
        this.indiceArestaInicial = indiceArestaInicial;
        this.indiceArestaFinal = indiceArestaFinal;
        this.envelope = new Envelope(this);
        this.envelope.calculaEnvelopamento();
    }
    /**
     * Construtor que recebe os índices das arestas inicial e final que o compõe
     * e o próprio índice dentro da MatrizPoligonos.
     * @param indiceArestaInicial Integer: indice da aresta inicial em MatrizArestas.
     * @param indiceArestaFinal Integer: indice da aresta final em MatrizArestas.
     * @see MatrizArestas
     * @see MatrizPoligonos
     */
    public Poligono(Integer indiceArestaInicial, Integer indiceArestaFinal, Integer indice) {
        this.indice = indice;
        this.indiceArestaInicial = indiceArestaInicial;
        this.indiceArestaFinal = indiceArestaFinal;
        this.lados = indiceArestaFinal - indiceArestaInicial + 1;
        this.envelope = new Envelope(this);
        this.envelope.calculaEnvelopamento();
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
        this.envelope.calculaEnvelopamento();
    }

    public Color getCorPreenchimento() {
        return corPreenchimento;
    }

    public void setCorPreenchimento(Color corPreenchimento) {
        this.corPreenchimento = corPreenchimento;
    }
    
}
