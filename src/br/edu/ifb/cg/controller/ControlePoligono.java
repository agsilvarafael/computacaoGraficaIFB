/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.controller;

import br.edu.ifb.cg.model.Aresta;
import br.edu.ifb.cg.model.MatrizArestas;
import br.edu.ifb.cg.model.MatrizPoligonos;
import br.edu.ifb.cg.model.MatrizVertices;
import br.edu.ifb.cg.model.Poligono;
import br.edu.ifb.cg.model.Vertice2D;

/**
 *
 * @author jeronimo
 */
public class ControlePoligono {
    MatrizPoligonos mp;
    MatrizArestas ma;
    MatrizVertices mv;

    public ControlePoligono() {
        mp = MatrizPoligonos.getInstance();
        ma = MatrizArestas.getInstance();
        mv = MatrizVertices.getInstance();
    }
    
    public Vertice2D addVertice(Integer x, Integer y){
        Vertice2D v = new Vertice2D(x,y);
        mv.addVertice(v);
        
        //TODO adicionar vertice na tela
        
        return v;
    }
    
    public Integer addAresta(Vertice2D origem, Vertice2D destino){
        Aresta a = new Aresta(origem, destino);
        ma.addAresta(a);
        //TODO adicionar aresta na tela
        return a.getIndice();
    }
    
    public void addPoligono(){
        /**
         *Recebe todas as cordenadas dos cliques na tela e cria o polígono
         */ 
        Poligono p;
        Integer xInicial, yInicial, xAtual, yAtual, xAnterior, yAnterior, indiceArestaInicial, indiceArestaFinal;
        Vertice2D vAnterior, vAtual;
        //TODO receber xInicial e Yinicial no clique
        xInicial = 0;
        yInicial = 0;
        
        xAnterior = xInicial;
        yAnterior = yInicial;
        vAnterior = addVertice(xAnterior, yAnterior);
        
        //TODO receber xAtual e yAtual no clique
        xAtual = 0;
        yAtual = 0;

        vAtual = addVertice(xAtual, yAtual);
        indiceArestaInicial = addAresta(vAnterior, vAtual);
        indiceArestaFinal = indiceArestaInicial;
        
        while(xAtual.compareTo(xInicial)!=0 || yAtual.compareTo(yInicial)!=0){
            xAnterior = xAtual;
            yAnterior = yAtual;
            
            //TODO receber xAtual e yAtual no clique
            xAtual = 0;
            yAtual = 0;
            
            vAtual = addVertice(xAtual, yAtual);
            indiceArestaFinal = addAresta(vAnterior, vAtual);            
        }
        p = new Poligono(indiceArestaInicial, indiceArestaFinal);
        mp.addPoligono(p);
    }
    
    public boolean isInPoligno(int x, int y){
        //TODO: verificar se as coordenadas estão dentro de um polígono
        //Envelopamento
        return false;
    }
    
    
    
}

