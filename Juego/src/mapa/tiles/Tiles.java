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
public class Tiles {
    public int x;
    public int y;
    
    public Sprite sprite;
    
    public static final int LADO=32;
    
    //coleccion
    public static final Tiles MONTANA=new Tiles(Sprite.MONTANA);
    public static final Tiles VOID=new Tiles(Sprite.VOID);
    public static final Tiles HIERBA=new Tiles(Sprite.HIERBA);
    public static final Tiles ARBOL=new Tiles(Sprite.ARBOL);
    public static final Tiles BARRO=new Tiles(Sprite.BARRO);
    public static final Tiles BARRO_ESQUINA=new Tiles(Sprite.BARRO_ESQUINA); 
    public static final Tiles BARRO_LADO=new Tiles(Sprite.BARRO_LADO);
    public static final Tiles CAMINO_BARRO_ESQUINA_INTERIOR=new Tiles(Sprite.CAMINO_BARRO_ESQUINA_INTERIOR);
    public static final Tiles CAMINO_BARRO_ESQUINA_INTERIOR_I=new Tiles(Sprite.CAMINO_BARRO_ESQUINA_INTERIOR_I);
    public static final Tiles CAMINO_BARRO_I_VERTICAL=new Tiles(Sprite.CAMINO_BARRO_I_VERTICAL);
    public static final Tiles CAMINO_BARRO_J=new Tiles(Sprite.CAMINO_BARRO_J);
    public static final Tiles CAMINO_BARRO_T=new Tiles(Sprite.CAMINO_BARRO_T); 
    public static final Tiles CAMINO_BARRO_T_I=new Tiles(Sprite.CAMINO_BARRO_T_I); 
    public static final Tiles CASA1_1=new Tiles(Sprite.CASA1_1);
    public static final Tiles CASA1_2=new Tiles(Sprite.CASA1_2);
    public static final Tiles CASA1_3=new Tiles(Sprite.CASA1_3);
    public static final Tiles CASA1_4=new Tiles(Sprite.CASA1_4);
    public static final Tiles CASA1_5=new Tiles(Sprite.CASA1_5);
    public static final Tiles CASA1_6=new Tiles(Sprite.CASA1_6);
    public static final Tiles FORJA1=new Tiles(Sprite.FORJA1);
    public static final Tiles FORJA2=new Tiles(Sprite.FORJA2);
    public static final Tiles FORJA3=new Tiles(Sprite.FORJA3);
    public static final Tiles FORJA4=new Tiles(Sprite.FORJA4);
    public static final Tiles BARRO_LADO_ARRIBA=new Tiles(Sprite.BARRO_LADO_ARRIBA);
    public static final Tiles BARRO_LADO_DERECHA=new Tiles(Sprite.BARRO_LADO_DERECHA);
    public static final Tiles BARRO_LADO_ABAJO=new Tiles(Sprite.BARRO_LADO_ABAJO);
    public static final Tiles BARRO_ESQUINA_ABAJO_IZQUIERDA=new Tiles(Sprite.BARRO_ESQUINA_ABAJO_IZQUIERDA); 
    public static final Tiles BARRO_ESQUINA_ABAJO_DERECHA=new Tiles(Sprite.BARRO_ESQUINA_ABAJO_DERECHA); 
    public static final Tiles BARRO_ESQUINA_ARRIBA_DERECHA=new Tiles(Sprite.BARRO_ESQUINA_ARRIBA_DERECHA); 
    public static final Tiles CAMINO_BARRO_T_ARRIBA=new Tiles(Sprite.CAMINO_BARRO_T_ARRIBA); 
    public static final Tiles CAMINO_BARRO_I_HORIZONTAL=new Tiles(Sprite.CAMINO_BARRO_I_HORIZONTAL);
    public static final Tiles CAMINO_BARRO_T_DERECHA=new Tiles(Sprite.CAMINO_BARRO_T_DERECHA); 
    public static final Tiles CAMINO_BARRO_T_I_DERECHA=new Tiles(Sprite.CAMINO_BARRO_T_I_DERECHA);
    public static final Tiles CAMINO_BARRO_ESQUINA_INTERIOR_ABAJO_IZQUIERDA=new Tiles(Sprite.CAMINO_BARRO_ESQUINA_INTERIOR_ABAJO_IZQUIERDA);
    public static final Tiles CAMINO_BARRO_ESQUINA_INTERIOR_ABAJO_DERECHA=new Tiles(Sprite.CAMINO_BARRO_ESQUINA_INTERIOR_ABAJO_DERECHA);
    public static final Tiles CAMINO_BARRO_ESQUINA_INTERIOR_ARRIBA_DERECHA=new Tiles(Sprite.CAMINO_BARRO_ESQUINA_INTERIOR_ARRIBA_DERECHA);
    
    
    
    
    
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
