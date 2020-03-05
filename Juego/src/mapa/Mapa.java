
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
    protected Tiles[]catalogoTiles;
    
    public Mapa(int ancho,int alto){
        this.ancho=ancho;
        this.alto=alto;
        tiles = new int [ancho*alto];
        
        generarMapa();
    }
    
    public Mapa(String ruta){
        cargarMapa(ruta);
        generarMapa();
    }
    protected void generarMapa(){
        
    }
    
    protected void cargarMapa(String ruta){
        
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
             //   getCuadro(x,y).mostrar(x, y, pantalla);
            
                if (x<0||y<0||x>=ancho||y>=alto){
                Tiles.VOID.mostrar(x, y, pantalla); 
            
                }else {
                catalogoTiles[x+y*ancho].mostrar(x, y, pantalla);
                }
            }
        }
    }
    
    public Tiles getTilesCatalogo(int posicion){
   
        return catalogoTiles[posicion]; 
        
    }
    
    public int getAncho(){
        return ancho;
    }
    
    public Tiles getCuadro(final int x,final int y){
        
        if(x<0||y<0||x>=ancho||y>=alto){
            return Tiles.MONTANA;
        }
        switch (tiles[x+y*ancho]){
                case 0:
                return Tiles.HIERBA;
                case 1:
                return Tiles.ARBOL;
                case 2:
                return Tiles.BARRO;
                case 3:
                return Tiles.BARRO_ESQUINA;  
                case 4:
                return Tiles.BARRO_LADO;      
                case 5:
                return Tiles.CAMINO_BARRO_ESQUINA_INTERIOR;  
                case 6:
                return Tiles.CAMINO_BARRO_ESQUINA_INTERIOR_I;  
                case 7:
                return Tiles.CAMINO_BARRO_I_VERTICAL;  
                case 8:
                return Tiles.CAMINO_BARRO_J;  
                case 9:
                return Tiles.CAMINO_BARRO_T;  
                case 10:
                return Tiles.CAMINO_BARRO_T_I;  
                case 11:
                return Tiles.CASA1_1;  
                case 12:
                return Tiles.CASA1_2;  
                case 13:
                return Tiles.CASA1_3;  
                case 14:
                return Tiles.CASA1_4;  
                case 15:
                return Tiles.CASA1_5;  
                case 16:
                return Tiles.CASA1_6;  
                case 17:
                return Tiles.FORJA1;  
                case 18:
                return Tiles.FORJA2;
                case 19:
                return Tiles.FORJA3;
                case 20:
                return Tiles.FORJA4;
        
            default:
                return Tiles.VOID;
        
        }
    }
    
}
