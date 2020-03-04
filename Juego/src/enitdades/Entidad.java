/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enitdades;

import mapa.Mapa;

/**
 *
 * @author ssanjuanandres
 */
public abstract class Entidad {
    
    protected int x;
    protected int y;
    
    private boolean eliminado=false;
    
    protected Mapa mapa;
    
    public void actualizar(){
    
    }
    
    public void mostrar(){
    
    }
    
    public void eliminar(){
        this.eliminado=true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean estaEliminado() {
        return eliminado;
    }

    public void setX(int x) {
        this.x = x+this.x;
    }

    public void setY(int y) {
        this.y = y+this.y;
    }
    
    
    
}
