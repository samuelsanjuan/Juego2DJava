/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

import java.util.Random;

/**
 *
 * @author ssanjuanandres
 */
public class MapaGenerado extends Mapa {
    
    private static final Random ALEATORIO=new Random();
    
    public MapaGenerado(int ancho, int alto) {
        super(ancho, alto);
    }
    
    
    @Override
    protected void generarMapa(){
        for (int y=0;y<alto;y++){
            for(int x=0;x<ancho;x++){
                tiles[x+y*ancho]=ALEATORIO.nextInt(20);
            }
        }
    }
    
}
