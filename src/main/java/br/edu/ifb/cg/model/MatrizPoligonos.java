/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jeronimo
 */
public class MatrizPoligonos {
    
    private Integer maioIndice;
    private Map<Integer, Poligono> matriz;
    private static MatrizPoligonos uniqueInstance;

    private MatrizPoligonos() {
        this.maioIndice = -1;
        this.matriz = new HashMap<>();
    }
    
    public static synchronized MatrizPoligonos getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new MatrizPoligonos();
        return uniqueInstance;
    }
    
    public void addPoligono(Poligono poligono){
        poligono.setIndice(++maioIndice);
        matriz.put(maioIndice, poligono);
    }
    
    public Poligono getPoligono(Integer indice){
        return matriz.get(indice);
    }
    
    public void removePoligono(Integer indicePoligono){
        Poligono p = matriz.remove(indicePoligono);
        MatrizArestas.getInstance().removeArestas(
                p.getIndiceArestaInicial(), p.getIndiceArestaFinal());
        MatrizVertice.getInstance().removeVertices(
                p.getArestas().get(0).getOrigem().getIndice(), 
                p.getArestas().get(p.getLados()-1).getOrigem().getIndice());
    }
    
}
