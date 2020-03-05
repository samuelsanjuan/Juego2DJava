/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enitdades.criaturas;

import control.Teclado;
import graficos.Pantalla;
import graficos.Sprite;
import mapa.Mapa;

/**
 *
 * @author ssanjuanandres
 */
public class Jugador extends Criatura {
    
    private Teclado teclado;
    
    public Jugador(Teclado teclado,Sprite sprite,Mapa mapa){
        this.teclado=teclado;
        this.sprite=sprite;
        this.mapa=mapa;
    }
    
    public Jugador(Teclado teclado, int posicionX, int posicionY,Sprite sprite,Mapa mapa){
        this.teclado=teclado;
        this.x=posicionX;
        this.y=posicionY;
        this.sprite=sprite;
        this.mapa=mapa;
    }
    
    @Override
    public void actualizar(){
    
        int desplazamientoX=0;
        int desplazamientoY=0;
        
        if(teclado.arriba){
            desplazamientoY-=3;
        }
        if (teclado.abajo){
            desplazamientoY+=3;
        }
        if (teclado.izquierda){
            desplazamientoX-=3;
        }
        if (teclado.derecha){
            desplazamientoX+=3;
        }
        if (desplazamientoX!=0||desplazamientoY!=0){
            if(direccion=='n'){
                sprite=Sprite.PERSONAJE_ESPALDA_IZQUIERDA;
            }
            if(direccion=='e'){
                sprite=Sprite.PERSONAJE_FRENTE_DERECHA;
            }
            if(direccion=='o'){
                sprite=Sprite.PERSONAJE_FRENTE_IZQUIERDA;
            }
            if(direccion=='s'){
                sprite=Sprite.PERSONAJE_FRENTE_IZQUIERDA;
            }
            
            mover(desplazamientoX,desplazamientoY);
        }
    }
    
    
    public void mostrar(Pantalla pantalla){
    
        pantalla.mostrarJugador(x, y, this);
        
    }
}
