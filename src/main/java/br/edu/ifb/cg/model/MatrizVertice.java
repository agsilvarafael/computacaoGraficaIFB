/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jeronimo
 */
public class MatrizVertice {

    private Integer maiorIndice;
    private Map<Integer, Vertice2D> matriz = null;
    private static MatrizVertice uniqueInstance;

    private MatrizVertice() {
        this.maiorIndice = -1;
        matriz = new HashMap<>();
    }
    
    public static synchronized MatrizVertice getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new MatrizVertice();
        return uniqueInstance;
    }
    
    public void addVertice(Integer x, Integer y){
        this.matriz.put(++maiorIndice, new Vertice2D(x, y));
        this.matriz.get(maiorIndice).setIndice(maiorIndice);
    }
    
    public void addVertice(Vertice2D vertice){
        vertice.setIndice(++maiorIndice);
        this.matriz.put(maiorIndice, vertice);
    }
    
    public void addVertice(List<Vertice2D> vertices){
        for (Vertice2D vertice : vertices){
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
    
    public Vertice2D getVertice(Integer indice){
        return matriz.get(indice);
    }
    
}
