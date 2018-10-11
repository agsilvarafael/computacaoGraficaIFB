/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jeronimo
 */
public class MatrizVertices {

    private Integer maiorIndice;
    private Map<Integer, Vertice2D> matriz = null;
    private static MatrizVertices uniqueInstance;

    private MatrizVertices() {
        this.maiorIndice = -1;
        matriz = new HashMap<>();
    }
    
    public static synchronized MatrizVertices getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new MatrizVertices();
        return uniqueInstance;
    }
    
    public void addVertice(Integer x, Integer y){
        this.matriz.put(++maiorIndice, new Vertice2D(x, y, maiorIndice));
//        this.matriz.get(maiorIndice).setIndice(maiorIndice);
    }
    
    public void addVertice(Vertice2D vertice){
        vertice.setIndice(++maiorIndice);
        this.matriz.put(maiorIndice, vertice);
    }
    
    public void addVertice(List<Vertice2D> vertices){
        for (Vertice2D vertice : vertices) {
            vertice.setIndice(++maiorIndice);
            this.matriz.put(maiorIndice, vertice);
        }
    }
    
    public void removeVertice(Integer indiceVertice){
        this.matriz.remove(indiceVertice);
    }
    
    public void removeVertices(Integer inicio, Integer fim){
        for (int i = inicio; i <= fim; i++) {
            this.matriz.remove(i);
        }
    }
    
    /**
     * Realiza a busca pelo vértice de um índice específico
     * @param indice Integer: índice do vértice que se deseja obter da matriz.
     * @return O vértice da posição recebida como parâmetro.
     */
    public Vertice2D getVertice(Integer indice){
        return matriz.get(indice);
    }
    
    /**
     * Recebe dois índices e retorna todos os vértices do inicial até o final.
     * @param inicio Integer: índice da primeira aresta a ser adicionada.
     * @param fim Integer: índice da última aresta a ser adicionada.
     * @return Uma lista contendo todos os vértices dentro do 
     */
    public ArrayList<Vertice2D> getVertices(Integer inicio, Integer fim){
        ArrayList<Vertice2D> l = new ArrayList<>();
        for (int i = inicio; i <= fim; i++) {
            l.add(matriz.get(i));
        }
        return l;
    }
}
