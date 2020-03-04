
package juego;

import control.Teclado;
import graficos.Pantalla;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import javax.swing.JFrame;
import mapa.Mapa;
import mapa.MapaCargado;
import mapa.MapaGenerado;

/**
 *
 * @author ssanjuanandres
 */
public class Juego extends Canvas implements Runnable{

    private static final long serialVersionUID=1L;
    
    private static final int ANCHO=800;
    private static final int ALTO=600;
    
    private static volatile boolean enEjecucion=false;
    
    private static final String NOMBRE="juego";
    
    private static int aps=0;
    private static int fps=0;
    
    private static int x=0;
    private static int y=0;
    
    private static JFrame ventana; 
    private static Thread thread;
    private static Teclado teclado;
    private static Pantalla pantalla;
    
    private static Mapa mapa;
    
    private static BufferedImage imagen= new BufferedImage(ANCHO,ALTO,BufferedImage.TYPE_INT_RGB);
    private static int[] pixeles=((DataBufferInt)imagen.getRaster().getDataBuffer()).getData();
    
    private Juego() {
        
        setPreferredSize(new Dimension(ANCHO, ALTO));
        
        pantalla = new Pantalla(ANCHO,ALTO);
        
        mapa=new MapaCargado("/mapas/mapa1.png");
                
        teclado=new Teclado();
        addKeyListener(teclado);
        
        
        ventana=new JFrame(NOMBRE);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLayout(new BorderLayout());
        ventana.add(this, BorderLayout.CENTER);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true); 
        
        
    }
    public static void main (String[] args){
        Juego juego =new Juego();
        juego.iniciar();
    }
    private synchronized void iniciar(){
        enEjecucion=true;
        
        
        thread=new Thread(this, "graficos");
        thread.start();
    }
    
    private synchronized void detener(){
        enEjecucion=false;
        
            
        try {    
            thread.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());;
        }
    }
    
    private void actualizar(){
        
        teclado.actualizar();
        
        if(teclado.arriba){
            x-=2;
        }
        if(teclado.abajo){
            x+=2;
        }
        if(teclado.derecha){
            y+=2;
        }       
        if(teclado.izquierda){
            y-=2;
        }     
        
        aps++;
    }
    
    private void mostrar(){
        
        BufferStrategy estrategia = getBufferStrategy();
        
        if (estrategia==null){
            createBufferStrategy(3);
            return;
        }
        
        pantalla.limpiar();
        mapa.mostrar(x, y, pantalla);
        
        
        System.arraycopy(pantalla.pixeles, 0, pixeles, 0, pixeles.length);
        
        Graphics g=estrategia.getDrawGraphics();
        
        g.drawImage(imagen,0,0,getWidth(),getHeight(),null);
        g.setColor(Color.red);
        g.fillRect(ANCHO/2, ALTO/2, 32, 32);
        g.dispose();
        
        estrategia.show();
        
        fps++;
    }

    @Override
    public void run() {
        final int NS_POR_SEGUNDO=1000000000;
        final byte APS_OBJETIVO=60;
        final double NS_POR_ACTUALIZACION=NS_POR_SEGUNDO/APS_OBJETIVO; 
        
        long referenciaActualizacion=System.nanoTime();
        long referenciaContador =System.nanoTime();
        
        double tiempoTranscurrido;
        double delta=0;
        
        requestFocus();
        
        while (enEjecucion){
            final long inicioBucle=System.nanoTime();
            
            tiempoTranscurrido=inicioBucle-referenciaActualizacion;
            referenciaActualizacion=inicioBucle;
            
            delta +=tiempoTranscurrido/NS_POR_ACTUALIZACION;
            
            while(delta>=1){
                actualizar();
                delta--;
            }
            mostrar();
            
            if(System.nanoTime()-referenciaContador>NS_POR_SEGUNDO){
                ventana.setTitle(NOMBRE+ "|| aps: "+aps+"|| fps : "+fps);
                aps=0;
                fps=0;
                referenciaContador=System.nanoTime();
            }            
        }        
    }    
}
