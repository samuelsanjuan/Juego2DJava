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
    
    
    //coleccion de sprites de personaje
    
    public static final Sprite PERSONAJE_FRENTE_IZQUIERDA_0=new Sprite(32,0,0,HojaSprites.Personajes1,0);
    public static final Sprite PERSONAJE_FRENTE_DERECHA_0=new Sprite(32,1,0,HojaSprites.Personajes1,0);
    public static final Sprite PERSONAJE_ESPALDA_IZQUIERDA_0=new Sprite(32,2,0,HojaSprites.Personajes1,0);
    public static final Sprite PERSONAJE_FRENTE_IZQUIERDA_1=new Sprite(32,0,1,HojaSprites.Personajes1,0);
    public static final Sprite PERSONAJE_FRENTE_DERECHA_1=new Sprite(32,1,1,HojaSprites.Personajes1,0);
    public static final Sprite PERSONAJE_ESPALDA_IZQUIERDA_1=new Sprite(32,2,1,HojaSprites.Personajes1,0);
    public static final Sprite PERSONAJE_FRENTE_IZQUIERDA_2=new Sprite(32,0,2,HojaSprites.Personajes1,0);
    public static final Sprite PERSONAJE_FRENTE_DERECHA_2=new Sprite(32,1,2,HojaSprites.Personajes1,0);
    public static final Sprite PERSONAJE_ESPALDA_IZQUIERDA_2=new Sprite(32,2,2,HojaSprites.Personajes1,0);
    
    
    //fin coleccion de sprites de personaje
    
    //coleccion de sprites mapa
    
    public static final Sprite VOID= new Sprite(32,0);    
    public static final Sprite MONTANA=new Sprite(32,2,0,HojaSprites.HojaSprites1,0);
    public static final Sprite ARBOL=new Sprite(32,1,0,HojaSprites.HojaSprites1,0);
    public static final Sprite HIERBA= new Sprite(32,0,0,HojaSprites.HojaSprites1,0);
    public static final Sprite BARRO= new Sprite(32,3,0,HojaSprites.HojaSprites1,0);
    public static final Sprite CAMINO_BARRO_T= new Sprite(32,4,0,HojaSprites.HojaSprites1,0);
    public static final Sprite CAMINO_BARRO_I_VERTICAL= new Sprite(32,5,0,HojaSprites.HojaSprites1,0);
    public static final Sprite BARRO_ESQUINA= new Sprite(32,3,1,HojaSprites.HojaSprites1,0);
    public static final Sprite BARRO_LADO= new Sprite(32,3,2,HojaSprites.HojaSprites1,0);
    public static final Sprite CAMINO_BARRO_J= new Sprite(32,4,2,HojaSprites.HojaSprites1,0);
    public static final Sprite CAMINO_BARRO_ESQUINA_INTERIOR= new Sprite(32,4,1,HojaSprites.HojaSprites1,0);
    public static final Sprite CAMINO_BARRO_T_I= new Sprite(32,5,2,HojaSprites.HojaSprites1,0);
    public static final Sprite CAMINO_BARRO_ESQUINA_INTERIOR_I= new Sprite(32,5,1,HojaSprites.HojaSprites1,0);
    public static final Sprite FORJA1= new Sprite(32,0,3,HojaSprites.HojaSprites1,0);
    public static final Sprite FORJA2= new Sprite(32,1,3,HojaSprites.HojaSprites1,0);
    public static final Sprite FORJA3= new Sprite(32,2,3,HojaSprites.HojaSprites1,0);
    public static final Sprite FORJA4= new Sprite(32,3,3,HojaSprites.HojaSprites1,0);
    public static final Sprite CASA1_1= new Sprite(32,0,1,HojaSprites.HojaSprites1,0);
    public static final Sprite CASA1_2= new Sprite(32,0,2,HojaSprites.HojaSprites1,0);
    public static final Sprite CASA1_3= new Sprite(32,1,1,HojaSprites.HojaSprites1,0);
    public static final Sprite CASA1_4= new Sprite(32,1,2,HojaSprites.HojaSprites1,0);
    public static final Sprite CASA1_5= new Sprite(32,2,1,HojaSprites.HojaSprites1,0);
    public static final Sprite CASA1_6= new Sprite(32,2,2,HojaSprites.HojaSprites1,0);
    public static final Sprite BARRO_LADO_ARRIBA= new Sprite(32,3,2,HojaSprites.HojaSprites1,5);
    public static final Sprite BARRO_LADO_DERECHA= new Sprite(32,3,2,HojaSprites.HojaSprites1,1);
    public static final Sprite BARRO_LADO_ABAJO= new Sprite(32,3,2,HojaSprites.HojaSprites1,4);
    public static final Sprite BARRO_ESQUINA_ABAJO_IZQUIERDA= new Sprite(32,3,1,HojaSprites.HojaSprites1,4);
    public static final Sprite BARRO_ESQUINA_ABAJO_DERECHA= new Sprite(32,3,1,HojaSprites.HojaSprites1,1);
    public static final Sprite BARRO_ESQUINA_ARRIBA_DERECHA= new Sprite(32,3,1,HojaSprites.HojaSprites1,5);
    public static final Sprite CAMINO_BARRO_T_ARRIBA= new Sprite(32,4,0,HojaSprites.HojaSprites1,5);
    public static final Sprite CAMINO_BARRO_I_HORIZONTAL= new Sprite(32,5,0,HojaSprites.HojaSprites1,4);
    public static final Sprite CAMINO_BARRO_T_DERECHA= new Sprite(32,4,0,HojaSprites.HojaSprites1,1);
    public static final Sprite CAMINO_BARRO_T_I_DERECHA= new Sprite(32,5,2,HojaSprites.HojaSprites1,0);
    public static final Sprite CAMINO_BARRO_ESQUINA_INTERIOR_ABAJO_IZQUIERDA= new Sprite(32,4,1,HojaSprites.HojaSprites1,3);
    public static final Sprite CAMINO_BARRO_ESQUINA_INTERIOR_ABAJO_DERECHA= new Sprite(32,4,1,HojaSprites.HojaSprites1,1);
    public static final Sprite CAMINO_BARRO_ESQUINA_INTERIOR_ARRIBA_DERECHA= new Sprite(32,4,1,HojaSprites.HojaSprites1,2);
    public static final Sprite VALLA_HORIZONTAL=new Sprite(32,4,3,HojaSprites.HojaSprites1,0);
    public static final Sprite VALLA_VERTICAL=new Sprite(32,4,4,HojaSprites.HojaSprites1,0);
    public static final Sprite FIN_CAMINO_I_E=new Sprite(32,5,3,HojaSprites.HojaSprites1,4);
    public static final Sprite FIN_CAMINO_I_O=new Sprite(32,5,3,HojaSprites.HojaSprites1,5);
    public static final Sprite FIN_CAMINO_I_N=new Sprite(32,5,3,HojaSprites.HojaSprites1,1);
    public static final Sprite FIN_CAMINO_I_S=new Sprite(32,5,3,HojaSprites.HojaSprites1,0);
    
    //fin de la colecion
    
    public Sprite(final int lado,final int columna, final int fila,final HojaSprites hoja,final int version){
        this.lado=lado;
        
        pixeles=new int [lado*lado];
    
        this.x=columna*lado;
        this.y=fila*lado;
        this.hoja=hoja;
        
        cargarSprite(version);
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
    
    private void cargarSprite(int version){
        if (version==0){cargaNormal();}
        else{cargaManipulada(version);}
    }
    
    private void cargaNormal(){
        for (int y = 0;y<lado;y++){
            for (int x=0;x<lado;x++){
                pixeles[x+y*lado]= hoja.pixeles[(x+this.x)+(y+this.y)*hoja.getAncho()];
            }
        }
    }
    
    private void cargaManipulada(int version){
        int[]pixelesTemporales=iniciarPixelesTemporales();
        
        switch (version){
        
            case 1:invertirXY(pixelesTemporales);break;
            case 2:invertirX(pixelesTemporales);break;
            case 3:invertirY(pixelesTemporales);break;
            case 4:rotar90I(pixelesTemporales);break;
            case 5:rotar90D(pixelesTemporales);break;
            case 6:rotar90IYInvertido(pixelesTemporales);break;
            case 7:rotar90DYInvertido(pixelesTemporales);break;    
            default:cargaNormal();
        }
    
    
    }
    private int[] iniciarPixelesTemporales(){
    int []pixelesTemporales=new int[lado*lado];
        for (int y = 0;y<lado;y++){
            for (int x=0;x<lado;x++){
                pixelesTemporales[x+y*lado]= hoja.pixeles[(x+this.x)+(y+this.y)*hoja.getAncho()];
            }
        }
        return pixelesTemporales;
    }
    //1
    private void invertirXY(int[]pixelesTemporales){
    
        for (int i=0;i<pixeles.length;i++){
            pixeles[i]=pixelesTemporales[(pixelesTemporales.length-1)-i];
        }
    }
    //2
    private void invertirX(int[]pixelesTemporales){
        int i=0;
        for(int y=0;y<lado;y++){
            for (int x=lado-1;x>-1;x--){
                pixeles[i]=pixelesTemporales[x+y*lado];
                i++;
            }
        }
    }
    //3
    private void invertirY(int[]pixelesTemporales){
        int i=0;
        for(int y=lado-1;y>-1;y--){
            for (int x=0;x<lado;x++){
                pixeles[i]=pixelesTemporales[x+y*lado];
                i++;
            }
        }
    }
    //4
    private void rotar90I(int[]pixelesTemporales){
        int i=0;
        for(int x=lado-1;x>-1;x--){
            for (int y=0;y<lado;y++){
                pixeles[i]=pixelesTemporales[x+y*lado];
                i++;
            }
        }
    
    }
    //5
    private void rotar90D(int[]pixelesTemporales){

        int i=0;
        for(int x=0;x<lado;x++){
            for (int y=lado -1;y>-1;y--){
                pixeles[i]=pixelesTemporales[x+y*lado];
                i++;
            }
        }
        
    }
    //6
    private void rotar90IYInvertido(int[]pixelesTemporales){
        int i=0;
        for(int x=0;x<lado;x++){
            for (int y=0;y<lado;y++){
                pixeles[i]=pixelesTemporales[x+y*lado];
                i++;
            }
        }
    }
    //7
    private void rotar90DYInvertido(int[]pixelesTemporales){

        int i=0;
        for(int x=lado-1;x>-1;x--){
            for (int y=lado-1;y>-1;y--){
                pixeles[i]=pixelesTemporales[x+y*lado];
                i++;
            }
        }
    }
    
}
