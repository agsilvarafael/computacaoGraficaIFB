/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jeronimo Hermano
 */
public class Envelope {
    
    private Vertice2D menor, maior;
    private Poligono poligono;

    public Envelope(Poligono poligono) {
        this.poligono = poligono;
    }
    
    /**
     * Método para verificar se um ponto encontra-se dentro da área de uma figura.
     * @since 11/10/2018
     * @param x Integer - Valor da coordenada X
     * @param y Integer - Valor da coordenada Y
     * @return Boolean - true se a coordenada estiver dento da ficura e false caso contrátio
     */
    public Boolean inPoligono(Integer x, Integer y){
        return (x >= menor.getX() && x <= maior.getX() &&
                y >= menor.getY() && y <= maior.getY());
    }
    
    
    public void calculaEnvelopamento(){
        Aresta a = MatrizArestas.getInstance().getAresta(poligono.getIndiceArestaFinal());
        ArrayList<Vertice2D> vertice2Ds = MatrizVertices.getInstance().
                getVertices(a.getIndiceOrigem(), a.getIndiceDestino());
        Iterator<Vertice2D> it = vertice2Ds.iterator();
        this.maior = it.next();
        this.menor = this.maior;
        while(it.hasNext()){
            Vertice2D v = it.next();
            //Teste para pegar as coordenadas X do envelope
            if(v.getX() > maior.getX()){
                maior.setX(v.getX());
            }else if(v.getX() < menor.getX()){
                menor.setX(v.getX());
            }
            //Teste para pegar as coordenadas Y do envelope
            if(v.getY() > maior.getY()){
                maior.setY(v.getY());
            }else if(v.getY() < menor.getY()){
                menor.setY(v.getY());
            }
        }
    }

    public Poligono getPoligono() {
        return poligono;
    }
    
}
