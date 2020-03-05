package enitdades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import control.Teclado;
import graficos.Pantalla;
import graficos.Sprite;
import mapa.Mapa;

/**
 *
 * @author ssanjuanandres
 */
public class Jugador extends Criatura {
    
    private final Teclado teclado;
    
    private int animacion;
    
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
        
        if (animacion<32767){
        animacion++;}else{animacion=0;}
        
        if(teclado.arriba){
            desplazamientoY-=2;
        }
        if (teclado.abajo){
            desplazamientoY+=2;
        }
        if (teclado.izquierda){
            desplazamientoX-=2;
        }
        if (teclado.derecha){
            desplazamientoX+=2;
        }
        if (desplazamientoX!=0||desplazamientoY!=0){
            enMovimiento=true;
            mover(desplazamientoX,desplazamientoY);
        }else{
            enMovimiento=false;
        }
            if(direccion=='n'){
                sprite=Sprite.PERSONAJE_ESPALDA_IZQUIERDA_0;
                if(enMovimiento){
                    if(animacion%30>15){
                        sprite=Sprite.PERSONAJE_ESPALDA_IZQUIERDA_1;
                    }
                    else{
                        sprite=Sprite.PERSONAJE_ESPALDA_IZQUIERDA_2;
                    }
                }
            }
            
            if(direccion=='e'){
                sprite=Sprite.PERSONAJE_FRENTE_DERECHA_0;
                if(enMovimiento){
                    if(animacion%30>15){
                        sprite=Sprite.PERSONAJE_FRENTE_DERECHA_1;
                    }
                    else{
                        sprite=Sprite.PERSONAJE_FRENTE_DERECHA_2;
                    }
                }
            }
            if(direccion=='o'){
                sprite=Sprite.PERSONAJE_FRENTE_IZQUIERDA_0;
                if(enMovimiento){
                    if(animacion%30>15){
                        sprite=Sprite.PERSONAJE_FRENTE_IZQUIERDA_1;
                    }
                    else{
                        sprite=Sprite.PERSONAJE_FRENTE_IZQUIERDA_2;
                    }
                }
            }
            if(direccion=='s'){
                sprite=Sprite.PERSONAJE_FRENTE_IZQUIERDA_0;
                if(enMovimiento){
                    if(animacion%30>15){
                        sprite=Sprite.PERSONAJE_FRENTE_IZQUIERDA_1;
                    }
                    else{
                        sprite=Sprite.PERSONAJE_FRENTE_IZQUIERDA_2;
                    }
                }
            }
    }
    
    
    public void mostrar(Pantalla pantalla){
    
        pantalla.mostrarJugador(x, y, this);
        
    }
}
