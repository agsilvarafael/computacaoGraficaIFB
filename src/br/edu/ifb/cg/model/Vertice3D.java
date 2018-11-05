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
public class Vertice3D extends Vertice2D{
    
    private Integer z;

    public Vertice3D(Integer z, Integer x, Integer y) {
        super(x, y);
        this.z = z;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Vertice3D
            && ((Vertice3D)obj).getX() == this.getX()
            && ((Vertice3D)obj).getY() == this.getY()
            && ((Vertice3D)obj).getZ() == this.z)
        {
            return true;
        }
        return false;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }
    
}
