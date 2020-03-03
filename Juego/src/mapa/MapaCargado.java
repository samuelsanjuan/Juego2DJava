/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import mapa.tiles.Tiles;

/**
 *
 * @author ssanjuanandres
 */
public class MapaCargado extends Mapa{
    
    private int[]pixeles;
    
    
    
    public MapaCargado(String ruta) {
        super(ruta);
    }
    
    protected void cargarMapa(String ruta){
    
        try {
            BufferedImage imagen=ImageIO.read(MapaCargado.class.getResource(ruta));
            
            ancho=imagen.getWidth();
            alto=imagen.getHeight();
        
            catalogoTiles=new Tiles[ancho*alto];
            pixeles=new int[ancho*alto];
            
            imagen.getRGB(0, 0,ancho,alto,pixeles,0,ancho);
            
        } catch (IOException ex) {
            Logger.getLogger(MapaCargado.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    protected void generarMapa(){
    
        for (int i=0;i<pixeles.length;i++){
            switch(pixeles[i]){
                case 0xff008f0a:
                    catalogoTiles[i]=Tiles.ARBOL;
                    continue;
                case 0xff00ff12:
                    catalogoTiles[i]=Tiles.HIERBA;
                    continue;
                case 0xff00a8ff:
                    catalogoTiles[i]=Tiles.FORJA1;
                    continue;
                case 0xff31b9ff:
                    catalogoTiles[i]=Tiles.FORJA2;
                    continue;
                case 0xff6eceff:
                    catalogoTiles[i]=Tiles.FORJA3;
                    continue;
                case 0xffabe2ff:
                    catalogoTiles[i]=Tiles.FORJA4;
                    continue;    
                case 0xff574727:
                    catalogoTiles[i]=Tiles.BARRO_ESQUINA;
                    continue;    
                case 0xffd09625:
                    catalogoTiles[i]=Tiles.BARRO_LADO;
                    continue;
                case 0xffffe080:
                    catalogoTiles[i]=Tiles.CAMINO_BARRO_ESQUINA_INTERIOR;
                    continue;
                case 0xff934e39:
                    catalogoTiles[i]=Tiles.CAMINO_BARRO_T_I;
                    continue;
                case 0xff593f33:
                    catalogoTiles[i]=Tiles.BARRO;
                    continue;
                case 0xff9d8453:
                    catalogoTiles[i]=Tiles.CAMINO_BARRO_J;
                    continue;
                case 0xffff00b4:
                    catalogoTiles[i]=Tiles.CASA1_1;
                    continue;
                case 0xffc10088:
                    catalogoTiles[i]=Tiles.CASA1_2;
                    continue;
                case 0xffff34c3:
                    catalogoTiles[i]=Tiles.CASA1_3;
                    continue;
                case 0xffffbaeb:
                    catalogoTiles[i]=Tiles.CASA1_4;
                    continue;
                case 0xffff67d2:
                    catalogoTiles[i]=Tiles.CASA1_5;
                    continue;
                case 0xffff94e0:
                    catalogoTiles[i]=Tiles.CASA1_6;
                    continue;
                case 0xff59290f:
                    catalogoTiles[i]=Tiles.CAMINO_BARRO_I;
                    continue;
                default:
                    catalogoTiles[i]=Tiles.VOID;
            }
        
        }
    
    }
    
}
