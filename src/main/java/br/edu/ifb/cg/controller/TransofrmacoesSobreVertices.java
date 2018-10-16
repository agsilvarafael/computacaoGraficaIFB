/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.controller;

import br.edu.ifb.cg.model.Envelope;
import br.edu.ifb.cg.model.MatrizPoligonos;
import br.edu.ifb.cg.model.Vertice2D;

/**
 * 
 * @author Jeronimo
 */
public class TransofrmacoesSobreVertices {
    
    /**
     * 
     * @param indiceP Índice do poligono que receberá a transformação.
     * @param dX Descolamento em pixels no eixo X.
     * @param dY Deslocamento em pixels no eixo Y.
     */
    public void translacao(Integer indiceP, Integer dX, Integer dY){
        for (Vertice2D vertice : MatrizPoligonos.getInstance().getVerticesPoligono(indiceP)) {
            vertice.setX(vertice.getX() + dX);
            vertice.setY(vertice.getY() + dY);
        }
    }
    
    /**
     * Amplia os pontos multiplicando as coordenadas dos pontos por um valor de
     * multiplicação. 
     * @param indiceP
     * @param sX
     * @param sY 
     * @exception IllegalArgumentException
     */
    public void escala(Integer indiceP, Integer sX, Integer sY){
        if(MatrizPoligonos.getInstance().getPoligono(indiceP) == null)
            throw new IllegalArgumentException(indiceP.toString());
        if(sX <= 0)
            throw new IllegalArgumentException(sX.toString());
        if(sY <= 0)
            throw new IllegalArgumentException(sY.toString());
        
        Integer novoXMaior = 0, novoYMaior = 0;
        
        Envelope envelope = MatrizPoligonos.getInstance().getPoligono(indiceP).getEnvelope();
        Integer ajusteX = envelope.getMenor().getX() * sX - envelope.getMenor().getX();
        Integer ajusteY = envelope.getMenor().getY() * sY - envelope.getMenor().getY();
        for(Vertice2D v2 : MatrizPoligonos.getInstance().getVerticesPoligono(indiceP)){
            //Modifica apenas se o ponto não for parte da lateral esqueda do envelope
            if(!v2.getX().equals(envelope.getMenor().getX())){
                v2.setX(v2.getX() * sX - ajusteX);//Posição nova com ajuste
                //Modifica a borda direita do envelope
                if(v2.getX().compareTo(novoXMaior) > 0){
                    novoXMaior = v2.getX();
                }
            }
            //Modifica apenas se o ponto não for parte da lateral inferior do envelope
            if(!v2.getY().equals(envelope.getMenor().getY())){
                v2.setY(v2.getY() * sY - ajusteY); //Posição nova com ajuste
                 //Modifica a borda superior do envelope
                if(v2.getY().compareTo(novoYMaior) > 0){
                    novoYMaior = v2.getY();
                }
            }
        }
        //Modifica a borda direita do envelope
        if(novoXMaior.compareTo(envelope.getMaior().getX()) > 0){
            envelope.getMaior().setX(novoXMaior);
        }
        //Modifica a borda superior do envelope
        if(novoYMaior.compareTo(envelope.getMaior().getY()) > 0){
            envelope.getMaior().setY(novoYMaior);
        }
        
    }
    
    /**
     * 
     * @param indiceP
     * @param anguloGraus 
     */
    public void rotacao(Integer indiceP, Double anguloGraus){
        Double xAux, yAux;
        for (Vertice2D vertice : MatrizPoligonos.getInstance().getVerticesPoligono(indiceP)) {
            xAux = Math.cos(Math.toRadians(anguloGraus)) * vertice.getX().doubleValue() -
                   Math.sin(Math.toRadians(anguloGraus)) * vertice.getY().doubleValue();
            yAux = Math.sin(Math.toRadians(anguloGraus)) * vertice.getX().doubleValue() +
                   Math.cos(Math.toRadians(anguloGraus)) * vertice.getY().doubleValue();
            vertice.setX(xAux.intValue());
            vertice.setY(yAux.intValue());
        }
    }
    
    public void espelhamento(Integer indiceP, Boolean inverteX, Boolean inverteY){
        Envelope e = MatrizPoligonos.getInstance().getPoligono(indiceP).getEnvelope();
        for(Vertice2D vertice : MatrizPoligonos.getInstance().getVerticesPoligono(indiceP)){
            if(inverteX){
                vertice.setX(-vertice.getX() + e.getMenor().getX() + e.getMaior().getX());
            }
            if(inverteY){
                vertice.setY(-vertice.getY() + e.getMenor().getY() + e.getMaior().getY());
            }
        }
    }
}
