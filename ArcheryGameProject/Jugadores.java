
/**
 * Las partidas se dan entre dos jugadores, uno es controlado por un humano mientras que el
 * otro es un jugador automatico. Cada jugador debe ser capaz de decidir a donde quiere 
 * apuntar su ﬂecha. Despues de cada tiro, la aplicacion le brindara retroalimentacion 
 * indicando las coordenadas donde impacto su ﬂecha y la puntuacion obtenida. Solo el primer 
 * tiro no tiene ninguna informacion para tomar la decision de a donde apuntar. Todo 
 * jugador, humano o no, tendra uno de los siguientes niveles de experiencia: novato, 
 * intermedio o profesional. El nivel de experiencia afecta aleatoriamente la posible desviacion 
 * producto del error de cada jugador en sus tiros.Al inicio de cada partida se debe crear un jugador 
 * automatico y uno manual. El nivel de experiencia de cada jugador se asigna aleatoriamente 
 * y no cambia durante la partida. Los jugadores no pueden saber que nivel de experiencia 
 * tienen asignado cuando toman la decision de a donde apuntar. La estrategia del jugador 
 * automatico sera seleccionada aleatoriamente entre las programadas por los miembros del 
 * grupo.
 * 
 *  @Esteban Quesada Quesada
 * Sebastián González Varela
 * Steven Nuñez Murillo.
 * @version 1.6 (29/9/2019)
 */
import javax.swing.JOptionPane;
public class Jugadores {
    BlancoDiana blanco1= new BlancoDiana();
    public String NombreTipoDeJugador;
    private int TipoDeJugador;
    private double estrategia;
    double coordenadaX;
    double coordenadaY;
    double errorX;
    double errorY;
    int TipoDeEstrategia;

    public Jugadores(){
        TipoDeJugador = (int)((Math.random()*3)+1);

        switch(TipoDeJugador){
            case 1:
            NombreTipoDeJugador = "Jugador Novato";
            break;
            case 2:
            NombreTipoDeJugador = "Jugador Intermedio";
            break;
            case 3:
            NombreTipoDeJugador = "Jugador Profesional";
            break;
        }
        TipoDeEstrategia=(int)((Math.random()*3)+1);
        errorX = 0.0;
        errorY = 0.0;
        coordenadaX = 0.0;
        coordenadaY = 0.0;
    }

    /*
     * @Funcion: Mediante este método se solicita al usuario ingresar una coordenada x, la cual
     * posteriormente va a sufrir los efectos del nivel de jugador, tipo de viento y la
     * intensidad del mismo.
     * @Retorna: Coordenada X, la cual va a ser la variable que sufrirá la serie de modificaciones
     * para terminar siendo localizada en el plano cartesiano, ya sea adentro o afuera de
     * la diana.
     */
    public double SolicitarCoordenadaX(){
        boolean seguir = true;

        while (seguir){
            try{
                String lecturax = JOptionPane.showInputDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nDigite la coordenada X"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                coordenadaX = Double.parseDouble(lecturax); 
                seguir = false;
            }

            catch(Exception e){
                JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nDigite un numero valido"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
            }
        }

        return coordenadaX;
    }

    
    /*
     * @Funcion: Mediante este método se solicita al usuario ingresar una coordenada y, la cual
     * posteriormente va a sufrir los efectos del nivel de jugador, tipo de viento y la
     * intensidad del mismo.
     * @Retorna: Coordenada Y, la cual va a ser la variable que sufrirá la serie de modificaciones
     * para terminar siendo localizada en el plano cartesiano, ya sea adentro o afuera de
     * la diana.
     */
    public double SolicitarCoordenadaY(){
        boolean seguir = true;

        while (seguir){
            try{
                String lecturay = JOptionPane.showInputDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nDigite la coordenada Y"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                coordenadaY= Double.parseDouble(lecturay); 
                seguir = false;
            }

            catch(Exception e){
                JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nDigite un numero valido"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
            }
        }

        return coordenadaY;
    }

    
    /*
     * @Funcion: Este método se encarga de calcular el error del jugador humano y máquina en el eje X. Se 
     * efectúa con la ayuda de un Switch y un Math random que determinará el error que afectará
     * durante la partida los lanzamientos del jugador humano y el jugador máquina en el eje X.
     * @Retorna: ErrorX, el cual será aplicado a la coordenada X que ingresa el jugador en el
     * método de solicitarCoordenada X.
     */
    public double RangoDeErrorEjeX(){

        switch (TipoDeJugador){
            case 1:

            errorX = (double)((Math.random() * 2) - 1);

            break;

            case 2:

            errorX = (double)((Math.random() * 0.5) - 0.25);

            break;

            case 3:

            errorX = (double)((Math.random() * 0.1) - 0.05);

            break;

        } 
        return errorX;
    }

    
     /*
     * @Funcion: Este método se encarga de calcular el error del jugador humano y máquina en el eje Y. Se 
     * efectúa con la ayuda de un Switch y un Math random que determinará el error que afectará
     * durante la partida los lanzamientos del jugador humano y el jugador máquina en el eje Y.
     * @Retorna: ErrorY, el cual será aplicado a la coordenada Y que ingresa el jugador en el
     * método de solicitarCoordenada Y.
     */
    public double RangoDeErrorEjeY(){
        switch (TipoDeJugador){
            case 1:

            errorY= (double)((Math.random() * 2) - 1);

            break;

            case 2:

            errorY= (double)((Math.random() * 0.5) - 0.25);

            break;

            case 3:

            errorY= (double)((Math.random() * 0.1) - 0.05);

            break;

        } 

        return errorY;
    }

     /*
     * @Funcion: Este método se encarga de guardar el porcentaje de error a realizar.
     * @Param: Recibe como parámetros la X y el error que utilizará para efectuar el error en
     * la coordenada X del tiro.
     */
    public double CalcularTiroXe(double x,double error){
        double porcentajeDeErrorX = x+error;
        return porcentajeDeErrorX;
    }

     /*
     /*
     * @Funcion: Este método se encarga de guardar el porcentaje de error a realizar.
     * @Param: Recibe como parámetros la Y y el error que utilizará para efectuar el error en
     * la Y del tiro.
     */
    public double CalcularTiroYe(double y,double error){
        double porcentajeDeErrorY = y+error;
        return porcentajeDeErrorY;
    }
    
     /*
     /*
     * @Funcion: Este método se encarga de añadir el porcentaje de error a la X que solicita
     * mediante el método solicitar Coordenada X.
     * @Retorna: la X con el Error para poder modificar la coordenada del tiro.
     */
    public double TirarX(){
        double solicitarX = SolicitarCoordenadaX();
        double desviacionX = RangoDeErrorEjeX();
        double xConError = CalcularTiroXe(solicitarX,desviacionX);
        return xConError;
    }

     /*
     /*
     * @Funcion: Este método se encarga de añadir el porcentaje de error a la Y que solicita
     * mediante el método solicitar Coordenada Y.
     * @Retorna: la Y con el Error para poder modificar la coordenada del tiro.
     */
    public double TirarY(){
        double solicitarY = SolicitarCoordenadaY();
        double desviacionY = RangoDeErrorEjeY();
        double yConError = CalcularTiroYe(solicitarY,desviacionY);
        return yConError;
    }
    
     /*
     * @Funcion: Este método se encarga de añadir el porcentaje de error a la X que solicita
     * mediante el método solicitar Coordenada X.
     * @Retorna: la X con el Error para poder modificar la coordenada del tiro.
     */
    public double TirarXJ2(){
        double solicitarX = EstrategiaX();
        double desviacionX = RangoDeErrorEjeX();
        double xConError = CalcularTiroXe(solicitarX,desviacionX);
        return xConError;
    }

     /*
     * @Funcion: Este método se encarga de añadir el porcentaje de error a la Y que solicita
     * mediante el método solicitar Coordenada Y.
     * @Retorna: la Y con el Error para poder modificar la coordenada del tiro.
     */
    public double TirarYJ2(){
        double solicitarY = EstrategiaY();
        double desviacionY = RangoDeErrorEjeY();
        double yConError = CalcularTiroYe(solicitarY,desviacionY);
        return yConError;
    }
    
    /*
     * Funcion: Realiza una estrategia que calcula un punto cercano al centro del círculo más
     * pequeño de la Diana.
     * @Retorna: La x que se utilizará para posteriormente calcular si el lanzamiento se encuentra dentro
     * o fuera de la diana.
     */
    public double EstrategiaCentroDemoledorX(){ //MejorEstrategia

        double lecturax= (double)(Math.random()*(1.06-1)+1);
        coordenadaX= lecturax;
        return lecturax;
    }

     /*
     * Funcion: Realiza una estrategia que calcula un punto cercano al centro círculo más
     * pequeño de la Diana.
     * @Retorna: La y que se utilizará para posteriormente calcular si el lanzamiento se encuentra dentro
     * o fuera de la diana.
     */
    public double EstrategiaCentroDemoledorY(){ //MejorEstrategia

        double lecturay= (double)(Math.random()*(1.06-1)+1);
        coordenadaY= lecturay;
        return lecturay;
    }
    
    
     /*
     * Funcion: Realiza una estrategia que calcula un punto cercano al círculo mediano
     * de la Diana.
     * @Retorna: La x que se utilizará para posteriormente calcular si el lanzamiento se encuentra dentro
     * o fuera de la diana.
     */
    public double EstrategiaPerdonaPuntosX(){ // MediaBuenaEstrategia

        double lecturax= (double)(Math.random()*(1.6-1)+1);
        coordenadaX= lecturax;
        return lecturax;
    }

     /*
     * Funcion: Realiza una estrategia que calcula un punto cercano al círculo mediano
     * de la Diana.
     * @Retorna: La y que se utilizará para posteriormente calcular si el lanzamiento se encuentra dentro
     * o fuera de la diana.
     */
    public double EstrategiaPerdonaPuntosY(){ //MediaBuenaEstrategia

        double lecturay= (double)(Math.random()*(1.6-1)+1);
        coordenadaY= lecturay;
        return lecturay;
    }
    
    /*
     * Funcion: Realiza una estrategia que calcula un punto cercano círculo más
     * grande de la Diana.
     * @Retorna: La y que se utilizará para posteriormente calcular si el lanzamiento se encuentra dentro
     * o fuera de la diana.
     */
    public double EstrategiaTembloreraX(){ //RegularEstrategia

        double lecturay= (double)(Math.random()*(2-1)+1);
        coordenadaY= lecturay;
        return lecturay;
    }
    
     /*
     * Funcion: Realiza una estrategia que calcula un punto cercano al círculo más
     * grande de la Diana.
     * @Retorna: La y que se utilizará para posteriormente calcular si el lanzamiento se encuentra dentro
     * o fuera de la diana.
     */
    public double EstrategiaTembloreraY(){ //RegularEstrategia

        double lecturay= (double)(Math.random()*(2-1)+1);
        coordenadaY= lecturay;
        return lecturay;
    }
    
    
     /*
     * Funcion: Se encarga de realizar un math random que alterna entre las diferentes
     * estrategias del jugador máquina en el Eje X.
     * @Retorna: La X que se utilizará para posteriormente calcular si el lanzamiento se encuentra dentro
     * o fuera de la diana.
     */
    public double EstrategiaX(){
    double GranX=0;  
        
    switch(TipoDeEstrategia){
        case 1:
        GranX= EstrategiaCentroDemoledorX();
        break;
        case 2:
        GranX= EstrategiaPerdonaPuntosX();
        break;
        case 3:
        GranX= EstrategiaTembloreraX();
        }
    return GranX;
    }
    
     /*
     * Funcion: Se encarga de realizar un math random que alterna entre las diferentes
     * estrategias del jugador máquina en el eje Y.
     * @Retorna: La Y que se utilizará para posteriormente calcular si el lanzamiento se encuentra dentro
     * o fuera de la diana.
     */
    public double EstrategiaY(){
    double GranY=0;  
        
    switch(TipoDeEstrategia){
        case 1:
        GranY= EstrategiaCentroDemoledorY();
        break;
        case 2:
        GranY= EstrategiaPerdonaPuntosY();
        break;
        case 3:
        GranY= EstrategiaTembloreraY();
        }
    return GranY;
    }

}

