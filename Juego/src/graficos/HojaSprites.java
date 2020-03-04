/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author ssanjuanandres
 */
public class HojaSprites {
    
    private final int ancho;
    private final int alto;
    public final int[] pixeles;
    
//coleccion de hojas de sprites
    
public static HojaSprites HojaSprites1 = new HojaSprites("/res/sprite1.png",320,320);
public static HojaSprites Personajes1= new HojaSprites("/res/SpritePersonajes.png",288,288);


//fin de coleccion
    public HojaSprites(final String ruta, final int ancho,final int alto){
          this.ancho=ancho;
          this.alto=alto;
          
          pixeles= new int[ancho*alto];
          
          BufferedImage imagen;
        try {
            imagen = ImageIO.read(HojaSprites.class.getResource(ruta));
            
            imagen.getRGB(0, 0,ancho,alto,pixeles,0,ancho);
             
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    
    }
    
    public int getAncho(){
        return ancho;
    }
            
    public void setAncho(int ancho){
        
    }
}
