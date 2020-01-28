package graficos;

/**
 *
 * @author ssanjuanandres
 */
public final class Sprite {
    private final int lado;
    
    private int x;
    private int y;
    
    public int []pixeles;
    private HojaSprites hoja;
    
    //coleccion de sprites
    public static final Sprite MONTANA=new Sprite(32,2,0,HojaSprites.Prueba);
    public static final Sprite ARBOL=new Sprite(32,1,0,HojaSprites.Prueba);
    public static final Sprite HIERBA= new Sprite(32,0,0,HojaSprites.Prueba);
    public static final Sprite VOID= new Sprite(32,0);
    
    
    //fin de la colecion
    
    public Sprite(final int lado,final int columna, final int fila,final HojaSprites hoja){
        this.lado=lado;
        
        pixeles=new int [lado*lado];
    
        this.x=columna*lado;
        this.y=fila*lado;
        this.hoja=hoja;
        
        for (int y = 0;y<lado;y++){
            for (int x=0;x<lado;x++){
                pixeles[x+y*lado]= hoja.pixeles[(x+this.x)+(y+this.y)*hoja.getAncho()];
            }
        }    
    }
    
    public Sprite(final int lado, final int color){
        this.lado=lado;
        pixeles=new int [lado*lado];
        
        for (int i=0;i<pixeles.length;i++){
            pixeles[i]=color;
        }
    }
    
    public int getLado(){
        return lado;
    }
}
