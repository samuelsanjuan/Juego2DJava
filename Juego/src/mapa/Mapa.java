
package mapa;

import graficos.Pantalla;
import mapa.tiles.Tiles;

/**
 *
 * @author ssanjuanandres
 */
public abstract class Mapa {
    
    protected int ancho;
    protected int alto;
    
    protected int [] tiles;
    
    public Mapa(int ancho,int alto){
        this.ancho=ancho;
        this.alto=alto;
        tiles = new int [ancho*alto];
        
        generarMapa();
    }
    
    public Mapa(String ruta){
        cargarMapa(ruta);
    }
    protected void generarMapa(){
        
    }
    
    public void cargarMapa(String ruta){
        
    }
    
    public void actualizar(){
        
    }
    
    public void mostrar(final int compensacionY,final int compensacionX, Pantalla pantalla){
        
        pantalla.setDiferencia(compensacionX, compensacionY);
        
        int     o =compensacionX>>5,
                e=(compensacionX+pantalla.getAncho()+Tiles.LADO)>>5,
                n=compensacionY>>5,
                s=(compensacionY+pantalla.getAlto()+Tiles.LADO)>>5;
        
        for (int y= n;y<s;y++){
            for (int x=o;x<e;x++){
                getCuadro(x,y).mostrar(x, y, pantalla);
            }
        }
    }
    
    public Tiles getCuadro(final int x,final int y){
        
        if(x<0||y<0||x>=ancho||y>=alto){
            return Tiles.MONTANA;
        }
        switch (tiles[x+y*ancho]){
            case 0:
                return Tiles.HIERBA;
            case 1:
                return Tiles.HIERBA;
            case 2:
                return Tiles.ARBOL;            
        
        
            default:
                return Tiles.VOID;
        
        }
    }
    
}
