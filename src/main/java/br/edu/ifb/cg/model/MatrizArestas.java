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
public class MatrizArestas {
    
    private Integer maiorIndice;
    private Map<Integer, Aresta> matriz;
    private static MatrizArestas uniqueInstance;

    private MatrizArestas() {
        this.maiorIndice = -1;
        this.matriz = new HashMap<>();
    }
    
    public static synchronized MatrizArestas getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new MatrizArestas();
        return uniqueInstance;
    }
    
    public void addAresta(Vertice2D inicio, Vertice2D fim){
        this.matriz.put(++maiorIndice, new Aresta(inicio, fim));
        this.matriz.get(maiorIndice).setIndice(maiorIndice);
    }
    
    public void addAresta(Aresta aresta){
        aresta.setIndice(++maiorIndice);
        this.matriz.put(maiorIndice, aresta);
    }
    
    public void addAresta(List<Aresta> arestas){
        for (Aresta aresta : arestas){
            aresta.setIndice(++maiorIndice);
            this.matriz.put(maiorIndice, aresta);
        }
    }
    
    public Aresta getAresta(Integer indice){
        return matriz.get(indice);
    }
    
    public void removeAresta(Integer indice){
        matriz.remove(indice);
    }
    
    public void removeArestas(Integer start, Integer end){
        for (int i = start; i <= end; i++) {
            matriz.remove(i);
        }
    }
    
    public List<Vertice2D> getVertices(Integer arestaInicial, Integer arestaFinal){
        List<Vertice2D> vertices = new ArrayList<>();
        for (int i = arestaInicial; i <= arestaFinal; i++) {
            vertices.add(matriz.get(i).getOrigem());
        }
        vertices.add(matriz.get(arestaInicial).getDestino());
        return  vertices;
    }
    
}
