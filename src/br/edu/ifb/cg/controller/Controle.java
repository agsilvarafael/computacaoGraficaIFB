/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import br.edu.ifb.cg.view.GLRenderer;
import javax.media.opengl.GL;

/**
 *
 * @author Rafael
 */
public class Controle{
    private GLRenderer glr;
    private GL gl;
    
    private Boolean desenhando;
    private Boolean comecouLinha;
    
    private Integer xAnt;
    private Integer yAnt;
    
    private Integer primeiroX;
    private Integer primeiroY;
    
    private Float corR;
    private Float corG;
    private Float corB;
            
    //TODO adicionar lista de Vertices/Arestas
    
    public Controle(){
        glr = new GLRenderer();
        primeiroX = primeiroY = 0;
        this.gl = glr.getGl();
        this.corR = this.corG = this.corB =0.0f;
    }
        
    public void cliqueMouse(int x, int y){
        acao(x,y);
    }
    
    private void acao(int x, int y){
        if(desenhando){
            if(comecouLinha){
                if(mesmoPonto(x,y)){
                    criarLinha(primeiroX,primeiroY);
                    terminarDesenho();
                }
                else{
                    criarLinha(x,y);
                }
                xAnt = x;
                yAnt = y;
            }
            else{
                comecouLinha = true;
                xAnt = x;
                yAnt = y;
                primeiroX = x;
                primeiroY = y;
            }             
        }
    }

    public void setDesenhando(Boolean desenhando){
        this.desenhando = desenhando;
    }

    private void criarLinha(int x, int y){
        
        //Criar na tela
        gl.glColor3f(corR, corG, corB); 
        gl.glBegin(GL.GL_LINES);
            gl.glVertex2i(xAnt, yAnt);
            gl.glVertex2i(x, y);
        gl.glEnd();
        
        //Criar no modelo
        //Adicionar vertice/aresta na lista
        
    }
    private boolean mesmoPonto(int x, int y){
        return ((x>getPrimeiroX()-5)&&(x<getPrimeiroX()+5))&&((y>getPrimeiroY()-5)&&(y<getPrimeiroY()+5));
    }

    private void terminarDesenho(){
        this.desenhando = false;
        this.comecouLinha = false;
        
        //TODO: Criar poligono na tela e modelo
        
        
        //zera variaveis
    }

    /**
     * @return the primeiroX
     */
    public Integer getPrimeiroX() {
        return primeiroX;
    }

    /**
     * @return the primeiroY
     */
    public Integer getPrimeiroY() {
        return primeiroY;
    }

    /**
     * @return the glr
     */
    public GLRenderer getGlr() {
        return glr;
    }
    
    public void setCor(Float r,Float g, Float b){
        this.corR = r;
        this.corG = g;
        this.corB = b;        
    }
}