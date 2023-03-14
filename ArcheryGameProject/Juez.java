/**
 * El Juez tiene informacion de la cantidad de sets y la cantidad de tiros por set 
 * que se estaran jugando. El juez tiene la responsabilidad de revisar el Blanco y mantener 
 * las Estadısticas correspondientes al conteo de los puntos para cada jugador durante cada 
 * set, la partida y la cantidad de tiros efectuados en cada caso. De igual forma es el que 
 * indica cuando hay un ganador para la partida y para cada set. Despues de cada 
 * ﬂecha tirada se actualiza la suma total de puntos de jugador humano y jugador máquina, la cantidad de tiros 
 * efectuados y puntajes, tanto para la partida como para el set que esta jugando. Al ﬁnal 
 * de un set, el juez determina como el ganador del set al jugador con mas puntos 
 * en ese set especıﬁco. De no haber un ganador registra la informacion de 
 * puntajes de muerte subita. Por lo tanto el Juez mantiene las estadısticas del conteo de 
 * cuantos sets ha ganado cada jugador y declara un ganador y el ﬁnal de la 
 * partida. En el caso donde ambos jugadores ganaron la misma cantidad de sets, se inicia 
 * una ronda de desempate, donde los jugadores se alternan haciendo tiros individuales 
 * hasta que uno de los dos obtenga un mayor puntaje en ese tiro. Esta ultima ronda de 
 * desempate no debe tomarse en cuenta para el conteo de puntos ﬁnal de los jugadores.

 * 
 * 
 * @Esteban Quesada Quesada
 * Sebastián González Varela
 * Steven Nuñez Murillo.
 * @version 1.6 (29/9/2019)
 */

import javax.swing.JOptionPane;
public class Juez{
    ConfiguracionDePartida configuracion1= new ConfiguracionDePartida();
    BlancoDiana blanco1= new BlancoDiana();
    private int moneda;

    int sets;
    int tiros;
    int desempateJ1;
    int desempateMaq;
    int puntos;
    int puntosMaq;
    int puntosSetj1;
    int puntosSetMaq;
    int puntosTirosj1;
    int puntosTirosMaq;
    int setsGanadosj1;
    int setsGanadosMaq;
    int setsEmpatados;

    public Juez(){
        moneda = 0;
        sets = configuracion1.sets;
        tiros = configuracion1.tiros;
        puntos = 0;
        puntosMaq = 0;
        puntosSetj1 = 0;
        puntosSetMaq = 0;
        puntosTirosj1 = 0;
        puntosTirosMaq = 0;
        setsGanadosj1 = 0;
        setsGanadosMaq = 0;
        setsEmpatados = 0;
    }

    /*
     **@Función: Este método se encarga de realizar el lanzamiento de una moneda para determinar
     **quien jugará primero, es decir quien va a realizar el primer lanzamiento. En síntesis
     **únicamente le pregunta al jugador que desea escoger entre cara y escudo, para posteriormente
     **realizar la rifa y determinar al ganador del primer reto del juego.
     **@Parametros no posee, únicamente utiliza variables como moneda usuario que guarda la 
     **decisión del jugador y monedaLanzada que guarda la parte de la moneda que cayó.
     **@Retorna: En este método se retorna moneda para determinar que cara de la moneda cayó y
     **tomar las acciones respectivas, las cuales serían inicia jugador o inicia máquina.
     */    
    
    public int LanzarMoneda(){
        boolean seguir= true;
        while (seguir){
            try{
                String caraDeMoneda = JOptionPane.showInputDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nEscoja entre escudo o corona para ver quien inicia la partida: "+"\n1 = corona"+"\n2 = escudo");
                int monedaUsuario= Integer.parseInt(caraDeMoneda);
                int monedaLanzada = (int)((Math.random() * 2)+1);

                if (monedaUsuario == 1 || monedaUsuario == 2){
                    switch (monedaLanzada){
                        case 1:
                        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nCorona"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                        break;

                        case 2:
                        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nEscudo"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                        break;
                    } 

                    if (monedaLanzada == monedaUsuario){
                        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nInicia jugador"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                        moneda = 1;
                        seguir = false;
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nInicia maquina"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                        moneda = 2;
                        seguir = false;
                    }
                }
                else {
                    seguir = true;
                }
            }
            catch(Exception e){ 
                JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nError, introducir opcion válida"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
            }
        }
        return moneda;
    }

    /*
     **@Función: Este método se encarga de determinar si las coordenadas se encuentran 
     **dentro de alguno de los círculos de la diana. Una vez que se realizan los cálculos respectivos
     **el juez verifica las variables de Blanco Diana llamadas puntoDentro, puntoFuera y punto
     **Pequeño para determinar los puntos obtenidos por cada lanzamiento. De esta forma, el juez
     **inicia el conteo de puntos del jugador humano y jugador máquina por cada respectivo
     **tiro y set.
     **@Parametros que posee son "x" y "y", los cuales son de tipo double, se utilizan para
     **enviar datos a la clase Blanco Diana, específicamente a las variables coordenada x y
     **coordenada y para poder realizar la localización del lanzamiento en el plano cartesiano y el 
     **área de cada círculo.
     **@Retorna: retorna la variable puntos, debido a la variable es necesaria para ir calculando 
     **progresivamente los puntos del jugador humano, y posteriormente así
     **poder realizar demás operaciones como el ganador de un set o partida efectuada.
     */    
    
    public double LocalizaciónTiroj1(double x,double y){

        blanco1.coordenadaX = x; 
        blanco1.coordenadaY= y; 

        blanco1.LocalizacionEnGranDiana();
        blanco1.LocalizacionEnMedianaDiana();
        blanco1.LocalizacionEnPequeñaDiana();

        if(blanco1.puntoDentroGrande==true && blanco1.puntoFueraMediano==true && blanco1.puntoFueraPequeño==true){
            puntos = puntos+15;
            puntosTirosj1 =+15;
            puntosSetj1 = puntosSetj1+15;

        }
        if(blanco1.puntoDentroGrande==true && blanco1.puntoDentroMediano==true && blanco1.puntoFueraPequeño==true){
            puntos= puntos+20;
            puntosTirosj1 =+20;
            puntosSetj1 =puntosSetj1+20;
        }
        if(blanco1.puntoDentroGrande==true && blanco1.puntoDentroMediano==true && blanco1.puntoDentroPequeño==true){
            puntos= puntos+100;
            puntosTirosj1 =+100;
            puntosSetj1 =puntosSetj1+100;
        }

        return puntos;
    }

    public int getpuntosTiros(){
        return puntosTirosj1;
    }

    public int getpuntosSets(){
        return puntosSetj1;
    }

     /*
     **@Función: Este método se encarga de obtener los puntos del jugador 1 también conocido
     **como jugador humano para poder posteriormente mostrar en pantalla los puntos obtenidos
     **por cada tiro.
     **
     */  
    public void MostrarEstadísticasTiroj1(){
        getpuntosTiros();
        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nPuntos_Tiros: "+puntosTirosj1+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
    }
     
    /*
     **@Función: Este método se encarga de obtener los puntos del jugador máquina para 
     **poder posteriormente mostrar en pantalla los puntos obtenidos por la máquina conocida
     **como el oponente del jugador humano.
     **
     */  
        public void MostrarEstadísticasTiroMaq(){
        getpuntosTirosMaq();
        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nPuntos_Tiros Maquina: "+puntosTirosMaq+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
    }
   
    
    
     /*
     **@Función: Este método se encarga de obtener los puntos del jugador máquina y jugador humano
     **para poder posteriormente mostrar en pantalla los puntos obtenidos por la máquina y el 
     **jugador humano. En este caso se muestran los puntos realizados por set de ambos jugadores.
     **
     */ 
    public void MostrarEstadísticasSets(){
        getpuntosSets();
        getpuntosSetsMaq();
        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nPuntos del set jugador 1: "+puntosSetj1+"\nPuntos del set maquina: "+puntosSetMaq+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
        puntosSetj1=0;
    }

     /*
     **@Función: Este método se encarga de obtener la información de la cantidad de sets y tiros 
     **configurados por el jugador para la partida, así mismo determina estadísticas finales
     **como los puntos totales,sets ganados por máquina o jugador y sets en los cuales se
     **repartieron puntaje al quedar empates.
     **@Retorna Stats para actualizar después de cada tiro y set los puntos totales en la partida.
     */ 
    
    public String MostrarEstadisticasFinales(){
        sets = configuracion1.sets;
        tiros = configuracion1.tiros;
        String stats = "\nSets Ganados por jugador1: "+setsGanadosj1+"\nSets Ganados por maquina: "+setsGanadosMaq+"\nSets Empatados: "+setsEmpatados
            + "\nPuntos totales jugador1: "+puntos+"\nPuntos totales Maquina: "+puntosMaq;
        return stats;
    }

    /*
     **@Función: Este método se encarga de determinar si las coordenadas se encuentran 
     **dentro de alguno de los círculos de la diana. Una vez que se realizan los cálculos respectivos
     **el juez verifica las variables de Blanco Diana llamadas puntoDentro, puntoFuera y punto
     **Pequeño para determinar los puntos obtenidos por cada lanzamiento. De esta forma, el juez
     **inicia el conteo de puntos del jugador máquina por cada respectivo
     **tiro y set.
     **@Parametros que posee son "x" y "y", los cuales son de tipo double, se utilizan para
     **enviar datos a la clase Blanco Diana, específicamente a las variables coordenada x y
     **coordenada y para poder realizar la localización del lanzamiento en el plano cartesiano y
     **el área de cada círculo.
     **@Retorna: la variable puntos, debido a que son esta variable es necesaria para ir calculando 
     **progresivamente los puntos del jugador máquina y jugador humano, y posteriormente así
     **poder realizar demás operaciones para determinar como el ganador de un set o partida efectuada
     **a un jugador en específico.
     */ 
    
    public double LocalizaciónTiroMaq(double x,double y){

        blanco1.coordenadaX = x; 
        blanco1.coordenadaY = y; 

        blanco1.LocalizacionEnGranDiana();
        blanco1.LocalizacionEnMedianaDiana();
        blanco1.LocalizacionEnPequeñaDiana();

        if(blanco1.puntoDentroGrande==true && blanco1.puntoFueraMediano==true && blanco1.puntoFueraPequeño==true){
            puntosMaq= puntosMaq+15;
            puntosTirosMaq=+15;
            puntosSetMaq=puntosSetMaq+15;
        }
        if(blanco1.puntoDentroGrande==true && blanco1.puntoDentroMediano==true && blanco1.puntoFueraPequeño==true){
            puntosMaq= puntosMaq+20;
            puntosTirosMaq=+20;
            puntosSetMaq=puntosSetMaq+20;
        }
        if(blanco1.puntoDentroGrande==true && blanco1.puntoDentroMediano==true && blanco1.puntoDentroPequeño==true){
            puntosMaq= puntosMaq+100;

            puntosTirosMaq=+100;
            puntosSetMaq=puntosSetMaq+100;
        }

        return puntosMaq;
    }
    
        public int getpuntosTirosMaq(){
        return puntosTirosMaq;
    }

    public int getpuntosSetsMaq(){
        return puntosSetMaq;
    }

    /*@Funcion: Este método se utiliza para determinar la cantidad de sets ganados
     * por el jugador humano, de esta forma se puede mostrar en las estadísticas finales
     * la cantidad total de sets ganados por un jugador humano.
     * 
     */
    
    public void SumarSetj1(){
        setsGanadosj1 = setsGanadosj1+1;
    }

    /*@Funcion: Este método se utiliza para determinar la cantidad de sets ganados
     * por el jugador máquina, de esta forma se puede mostrar en las estadísticas finales
     * la cantidad total de sets ganados por un jugador máquina.
     * 
     */
    
    public void SumarSetMaq(){
        setsGanadosMaq = setsGanadosMaq+1;
    }

    /*@Funcion: Este método se utiliza para determinar la cantidad de sets empatados en la
     * partida. Si el jugador máquina y humano llegan a tener la misma cantidad de puntos en un
     * set se suma un uno a la variable setsEmpatados. De esta forma se podrá mostrar en las
     * estadísticas finales el total de sets empatados entre el jugador máquina y el jugador
     * humano.
     * 
     */
    
    public void SumarSetEmpate(){
        setsEmpatados = setsEmpatados+1;
    }

        /*@Funcion: Este método se utiliza para informar al jugador humano si ha ganado
         * la partida al terminar el juego mediante una serie de comparaciones entre los 
         * puntos totales del jugador máquina y el jugador humano.
         * @Retorna: message para poder actualizar el resultado de la partida, y así informar
         * correctamente al jugador humano sobre el resultado final.
        */
    
    public String DeterminarGanador(){
        String message;
        if (puntosMaq < puntos){
            message = "Ganaste";
        }
        else{
            if(puntosMaq > puntos){
                message = "Perdiste";
            }
            else{
                message = "Empate";
            }
        }
        return message;
    }

    /*@Funcion: Este método se utiliza realizar una cuenta de los sets que se han efectuado,
     * cada vez que se finaliza un set se resta un uno a la cantidad de sets totales.
    */
    public void restarSets(){
        sets=sets-1;
    }

    
    /*@Funcion: Este método se utiliza realizar una cuenta de los tiros que se han efectuado,
     * cada vez que se finaliza un tiro se resta un uno a la cantidad de tiros totales.
    */
    public void restarTiros(){
        tiros=tiros-1;
    }

    
    /*@Funcion: Este método se utiliza para reiniciar los puntos y los sets cada vez que se
     * inicia un nuevo tiro y set, para evitar informar erróneamente al usuario con una
     * acumulación de puntuaciones por olvidar limpiar el registro anterior.
     * 
     */
    public void reiniciarPuntos(){
        puntos=0;
        puntosMaq=0;
    }

}
