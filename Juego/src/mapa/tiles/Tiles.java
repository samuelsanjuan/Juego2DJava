/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa.tiles;

import graficos.Pantalla;
import graficos.Sprite;

/**
 *
 * @author ssanjuanandres
 */
public abstract class Tiles {
    public int x;
    public int y;
    
    public Sprite sprite;
    
    public static final int LADO=32;
    
    //coleccion
    public static final Tiles MONTANA=new CuadroMontana(Sprite.MONTANA);
    public static final Tiles VOID=new CuadroVacio(Sprite.VOID);
    public static final Tiles HIERBA=new CuadroHierba(Sprite.HIERBA);
    public static final Tiles ARBOL=new CuadroArbol(Sprite.ARBOL);
    
    //fin de la coleccion
    
    public Tiles(Sprite sprite){
        this.sprite=sprite;
    }
    
    public void mostrar(int x,int y,Pantalla pantalla){
        pantalla.mostrarCuadro(x<<5, y<<5, this); 

    }
    
    public boolean solido(){
    
        return false;
    }
}
