/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enitdades.criaturas;

import enitdades.Entidad;
import graficos.Sprite;

/**
 *
 * @author ssanjuanandres
 */
public abstract class Criatura extends Entidad {
    protected Sprite sprite;
    protected char direccion='s';
    protected boolean enMovimiento=false;
    
    @Override
    public void actualizar(){
    
    }
    
    @Override
    public void mostrar(){
    
    }
    
    public void mover(int desplazamientoX,int desplazamientoY){
        if (desplazamientoX>0){
            direccion='e';
        }
        if (desplazamientoX<0){
            direccion='o';
        }
        if (desplazamientoY<0){
            direccion='n';
        }
        if (desplazamientoY>0){
            direccion='s';
        }
        
        if (!estaEliminado()){
            setX(desplazamientoX);
            setY(desplazamientoY);
        }
    }
    
    private boolean enColision(){
        return false;
    }
    
    public Sprite getSprite(){
        return sprite;
    }
    
}
