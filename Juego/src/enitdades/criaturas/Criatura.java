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
            if(!enColision(desplazamientoX,0)){
                setX(desplazamientoX);
            }
            if (!enColision(0,desplazamientoY)){
                setY(desplazamientoY);
            }
            
        }
    }
    
    private boolean enColision(int desplazamientoX,int desplazamientoY){
      boolean colision=false; 
      
      int posicionX=x+desplazamientoX;
      int posicionY=y+desplazamientoY;
      
      int margenIzquierdo=0;
      int margenDerecho=16;
      int margenArriba=-2;
      int margenInferior=31;
      
      int bordeIzquierdo=(posicionX+margenDerecho)/sprite.getLado();
      int bordeDerecho=(posicionX+margenDerecho+margenIzquierdo)/sprite.getLado();
      int bordeSuperior=(posicionY+margenInferior)/sprite.getLado();
      int bordeInferior=(posicionY+margenInferior+margenArriba)/sprite.getLado();
      
      if(mapa.getTilesCatalogo(bordeIzquierdo+bordeSuperior*mapa.getAncho()).esSolido()){
          colision=true;
      }
      
      if(mapa.getTilesCatalogo(bordeIzquierdo+bordeInferior*mapa.getAncho()).esSolido()){
          colision=true;
      }
      if(mapa.getTilesCatalogo(bordeDerecho+bordeInferior*mapa.getAncho()).esSolido()){
          colision=true;
      }
      if(mapa.getTilesCatalogo(bordeDerecho+bordeSuperior*mapa.getAncho()).esSolido()){
          colision=true;
      }
      
      return colision;
    }
    
    public Sprite getSprite(){
        return sprite;
    }
    
}
