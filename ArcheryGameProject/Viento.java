
/**
 *  El viento desvıa las ﬂechas segun su direccion e intensidad. Cada vez que se crea un 
 *  viento, se escoge un valor aleatorio θ entre 0.0 y 2π que determina la direccion del 
 *  viento. El Viento cambia entre un set y otro. Tambien habra un valor aleatorio de 
 *  intensidad r que determina la fuerza del viento. El valor de r cambia entre un tiro y otro.
 *  El cambio en la intensidad del viento se produce de forma aleatoria en el rango la 
 *  variacion determinada para cada tipo de viento. Existen tres tipos de viento: leve, 
 *  moderado y fuerte. El tipo de viento se determina tambien en forma aleatoria en el 
 *  momento en que se crea. El tipo de viento determina el rango dentro del cual varıa la 
 *  intensidad. El viento desvıa las ﬂechas del punto donde irıan a caer. Este efecto se 
 *  aplica despues de tomar en cuenta el nivel de experiencia del jugador. En resumen, los 
 *  atributos como la direccion y el tipo del viento cambian entre un set y otro. 
 *  Mientras que su intensidad cambia entre un tiro y otro segun el tipo de viento.

/**
 *
 * @Esteban Quesada Quesada
 * Sebastián González Varela
 * Steven Nuñez Murillo.
 * @version 1.6 (29/9/2019)
 */
import java.lang.Math;
public class Viento
{
    public String NombreTipoDeViento;
    private int TipoDeViento;
    private double direccion;
    private double intensidad;
    
    public Viento(){
        TipoDeViento = (int)((Math.random() * 3 )+1 );
        direccion = (double) ((Math.random() * 2*Math.PI ) );
        
        switch(TipoDeViento){
            case 1:
            NombreTipoDeViento="Viento Leve";
            break;
            case 2:
            NombreTipoDeViento="Viento Moderado";
            break;
            case 3:
            NombreTipoDeViento="Viento Fuerte";
            break;
        }
    }

    public double  getdireccion(){
        return direccion;
    }

    public int  getTipoDeViento(){
        return TipoDeViento;
    }

    /*
     * @Función: Este método se encarga de calcular la intensidad del viento, mediante la 
     * realización de un math random. De esta forma se selecciona una determinada intensidad
     * que afectará los disparos del jugador máquina y jugador humano en el transcurso de la
     * partida.
     * @Retorna: la intensidad debido a que la misma se debe actualizar entre cad tiro.
     */
    
    public double calcularVariacion(){
        switch(TipoDeViento){
            case 1:
            intensidad = (double)(Math.random()*0.2);
            break;
            case 2:
            intensidad = (double)(Math.random()*0.5);
            break;
            case 3:
            intensidad = (double)(Math.random()*1.0);
            break;

        }
        return intensidad;
    } 

     /*
     * @Función: Este método se encarga tomar el valor de x para aplicarle la desviación
     * respectiva mediante la fórmula matemática cos.
     * @Param: utiliza como parámetro la coordenada x que sufrirá de una serie de cambios
     * para actualizar el tiro del jugador debido a la influencia del viento.
     * @Retorna: la coordenada x, la cual posteriormente se utilizará para calcular si 
     * el tiro terminó adentro o afuera de alguna de los círculos de la diana.
     */
    public double  DesviarConVentX(double x){

        return x+intensidad*Math.cos(direccion);
    }

    
     /*
     * @Función: Este método se encarga tomar el valor de y para aplicarle la desviación
     * respectiva mediante la fórmula matemática sin.
     * @Param: utiliza como parámetro la coordenada y que sufrirá de una serie de cambios
     * para actualizar el tiro del jugador debido a la influencia del viento.
     * @Retorna: la coordenada y, la cual posteriormente se utilizará para calcular si 
     * el tiro terminó adentro o afuera de alguna de los círculos de la diana.
     */
    public double  DesviarConVentY(double y){

        return y+intensidad*Math.sin(direccion);
    }
}

