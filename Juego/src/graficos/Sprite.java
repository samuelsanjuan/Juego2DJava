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
    public static final Sprite BARRO= new Sprite(32,3,0,HojaSprites.Prueba);
    public static final Sprite CAMINO_BARRO_T= new Sprite(32,4,0,HojaSprites.Prueba);
    public static final Sprite CAMINO_BARRO_I= new Sprite(32,5,0,HojaSprites.Prueba);
    public static final Sprite BARRO_ESQUINA= new Sprite(32,3,1,HojaSprites.Prueba);
    public static final Sprite BARRO_LADO= new Sprite(32,3,2,HojaSprites.Prueba);
    public static final Sprite CAMINO_BARRO_J= new Sprite(32,4,2,HojaSprites.Prueba);
    public static final Sprite CAMINO_BARRO_ESQUINA_INTERIOR= new Sprite(32,4,1,HojaSprites.Prueba);
    public static final Sprite CAMINO_BARRO_T_I= new Sprite(32,5,2,HojaSprites.Prueba);
    public static final Sprite CAMINO_BARRO_ESQUINA_INTERIOR_I= new Sprite(32,5,1,HojaSprites.Prueba);
    public static final Sprite FORJA1= new Sprite(32,0,3,HojaSprites.Prueba);
    public static final Sprite FORJA2= new Sprite(32,1,3,HojaSprites.Prueba);
    public static final Sprite FORJA3= new Sprite(32,2,3,HojaSprites.Prueba);
    public static final Sprite FORJA4= new Sprite(32,3,3,HojaSprites.Prueba);
    public static final Sprite CASA1_1= new Sprite(32,0,1,HojaSprites.Prueba);
    public static final Sprite CASA1_2= new Sprite(32,0,2,HojaSprites.Prueba);
    public static final Sprite CASA1_3= new Sprite(32,1,1,HojaSprites.Prueba);
    public static final Sprite CASA1_4= new Sprite(32,1,2,HojaSprites.Prueba);
    public static final Sprite CASA1_5= new Sprite(32,2,1,HojaSprites.Prueba);
    public static final Sprite CASA1_6= new Sprite(32,2,2,HojaSprites.Prueba);
    
    
    
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
