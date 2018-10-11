/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.model;

/**
 * Classe para representar a estrutura básica de um pol[igono, um vértice, 
 * este é composto por dois inteiros indicando suas coordenadas no plano catesiano.
 * @author jeronimo
 */
public class Vertice2D {

    /**
     * Indice do vértice dentro da matriz de vértices.
     * @see MatrizVertices
     */
    private Integer indice;
    /** Valor inteiro da coordenada X. */
    private Integer x;
    /** Valor inteiro da coordenada Y. */
    private Integer y;

    /**
     * Construtor padrão da classe deixado para caso seja necessário instanciar
     * um objeto sem atribuição direta
     */
    public Vertice2D() {
    }
    
    /**
     * Construtor que recebe os valores das coordenadas.
     * @param x Integer: Coordenada X.
     * @param y Integer: Coordenada Y.
     */
    public Vertice2D(Integer x, Integer y) {
        if (x <= 0) {
            throw new IllegalArgumentException(x.toString());
        }
        if (y <= 0) {
            throw new IllegalArgumentException(y.toString());
        }
        this.x = x;
        this.y = y;
    }
    /**
     * Construtor que recebe os valores das coordenadas mais o índice dele na
     * MatrizVertice.
     * @param x Integer: Coordenada X.
     * @param y Integer: Coordenada Y.
     * @see MatrizVertices
     */
    public Vertice2D(Integer x, Integer y, Integer indice) {
        if (x <= 0) {
            throw new IllegalArgumentException(x.toString());
        }
        if (y <= 0) {
            throw new IllegalArgumentException(y.toString());
        }
        this.x = x;
        this.y = y;
        this.indice = indice;
    }

    /**
     * Retorna uma String com as coordenadas X e Y do vértice.
     */
    @Override
    public String toString() {
        return x + "  " + y;
    }

    /**
     * Verifica se um vértice recebido é igual ao vértice atual.
     * A verificação considera se as coordenadas X e Y de ambos é igual.
     * @return true caso sejam iguais e false caso contrário.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vertice2D
                && ((Vertice2D) obj).getX() == this.x
                && ((Vertice2D) obj).getY() == this.y) {
            return true;
        }
        return false;
    }

    public Integer getX() {
        return x;
    }

    /**
     * Recebe um valor inteiro para a coordenada X, mas este valor deve ser
     * maior ou igual à 0.
     * @param x Integer: valor de X.
     * @throws IllegalArgumentException Exceção diparada caso o valor seja menor que 0
     */
    public void setX(Integer x) {
        if (x <= 0) {
            throw new IllegalArgumentException(x.toString());
        }
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    /**
     * Recebe um valor inteiro para a coordenada Y, mas este valor deve ser
     * maior ou igual à 0.
     * @param y Integer: valor de Y.
     * @throws IllegalArgumentException Exceção diparada caso o valor seja menor que 0
     */
    public void setY(Integer y) {
        if (y <= 0) {
            throw new IllegalArgumentException(y.toString());
        }
        this.y = y;
    }

    public Integer getIndice() {
        return indice;
    }
/**
     * Recebe um valor inteiro para o índice deste ponto. É atribuido quando o
     * ponto for adicionado à MatrizVertice.
     * @param indice Integer: valor de 
     * @see MatrizVertices
     */
    public void setIndice(Integer indice) {
        this.indice = indice;
    }
    
}
