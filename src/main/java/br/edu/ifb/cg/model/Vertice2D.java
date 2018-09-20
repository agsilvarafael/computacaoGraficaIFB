/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.model;

/**
 *
 * @author jeronimo
 */
public class Vertice2D {

    private Integer indice;
    private Integer x;
    private Integer y;

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

    @Override
    public String toString() {
        return "X: " + x + " - Y: " + y;
    }

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

    public void setX(Integer x) {
        if (x <= 0) {
            throw new IllegalArgumentException(x.toString());
        }
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        if (y <= 0) {
            throw new IllegalArgumentException(y.toString());
        }
        this.y = y;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }
    
}
