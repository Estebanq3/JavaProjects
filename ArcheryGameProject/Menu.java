
/**
 * El menu debe presentarse al usuario por medio de la interfaz de consola o graﬁca segun 
 * corresponda al modo de ejecucion del programa. Este debe tener las siguientes opciones:
 * Iniciar nueva partida
 * Ver el puntaje más alto
 * Configurar cantidad de Sets
 * Configurar cantidad de Tiros
 * Salir
 * Luego de cada set debera mostrarse el tipo de viento con que se jugo el set. 
 * Luego de cada partida debera mostrarse el tipo de jugador humano y automatico que se 
 * enfrentaron y todas las estadısticas que el juez registro.
 * 
 *  @Esteban Quesada Quesada
 * Sebastián González Varela
 * Steven Nuñez Murillo.
 * @version 1.6 (29/9/2019)
 */

/**
 * Clase necesaria para que el usuario pueda interactuar con el programa
 * 
 * @Esteban Quesada Quesada 
 * @version 1 22/8/19
 */
import javax.swing.JOptionPane;
public class Menu
{
    ConfiguracionDePartida configuracion1= new ConfiguracionDePartida();
    RegistroPuntuacion registro1 = new RegistroPuntuacion();
    Juez juez1 = new Juez();
    private int opcionDelMenu;
    double x;

    public Menu()
    {
        // initialise instance variables
        opcionDelMenu = -1;
        x = 0 ;
    }

    /*
     * Funcion: Este método es el responsable de mostrar al usuario las distintas opciones
     * que puede ejecutar. A través del mismo se le permite al usuario interactuar con una interfaz
     *  para modificar los sets y
     * los tiros que tendrá la partida llamando a distintos métodos de otras clases, o podrá consultar
     * la puntuación más alta, asimismo, podrá salir si lo desea o lo más importante, iniciar una nueva
     * partida en la cual ejecutará el juego de arquería.
     */
    public void solicitarOperacionARealizar(){
        while(opcionDelMenu != 0){
            //Try catch para evitar que el programa termine si hay un error
            try{
                String lectura = JOptionPane.showInputDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀\n               ⌂Menu ARCHERY\n         ⌬1 Iniciar Nueva Partida" +
                        "\n         ⌬2 Ver Puntaje mas Alto\n" +
                        "         ⌬3 Configurar Sets\n" +
                        "         ⌬4 Configurar Tiros\n" +
                        "                     ⌬0 Salir\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                //Recoger la variable por consola
                opcionDelMenu = Integer.parseInt(lectura); 

                //Switch case en Java
                switch(opcionDelMenu){
                    case 1:
                    int turno = juez1.LanzarMoneda();
                    juez1.sets=configuracion1.sets;       
                    Jugadores jugador1=new Jugadores();
                    Jugadores jugador2=new Jugadores();
                    double puntajej1=0;
                    double puntajeMaq=0;

                    while (juez1.sets!=0){ //esta anidación consiste en un while grande que comprende a otro while pequeño, el grande corresponde a las acciones que se realizan cada set y el pequeño corresponde a las acciones que se realizan cada tiro de la partida.
                        Viento viento1 = new Viento();
                        juez1.tiros=configuracion1.tiros;
                        while (juez1.tiros!=0){

                            if (turno == 1){ //En esta sección el jugador inicia la partida ganando el lanzamiento de moneda, por lo tanto si el jugador pierde en el lanzamiento de moneda se recurrirá al siguiente if en el cual inicia la máquina.
                                viento1.calcularVariacion();
                                double x0 = jugador1.TirarX();
                                double y0 = jugador1.TirarY();
                                double x1 = viento1.DesviarConVentX(x0);
                                double y1 = viento1.DesviarConVentY(y0);
                                puntajej1 = juez1.LocalizaciónTiroj1(x1,y1);
                                JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀ \nCoordenadas (X,Y):"+"  ( "+x1+" , "+y1+" )"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                                juez1.MostrarEstadísticasTiroj1();

                                viento1.calcularVariacion();
                                double x0j2 = jugador2.EstrategiaX();
                                double y0j2 = jugador2.EstrategiaY();
                                double x1j2 = viento1.DesviarConVentX(x0j2);
                                double y1j2 = viento1.DesviarConVentY(y0j2);
                                puntajeMaq = juez1.LocalizaciónTiroMaq(x1j2,y1j2);

                                juez1.restarTiros();
                                JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀ \nCoordenadas maquina (X,Y):"+"  ( "+x1j2+" , "+y1j2+" )"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                                juez1.MostrarEstadísticasTiroMaq();
                                juez1.puntosTirosj1 = 0;
                                juez1.puntosTirosMaq = 0;
                            }
                            else{
                                if(turno == 2){
                                    viento1.calcularVariacion();
                                    double x0j2 = jugador2.EstrategiaX();
                                    double y0j2 = jugador2.EstrategiaY();
                                    double x1j2 = viento1.DesviarConVentX(x0j2);
                                    double y1j2 = viento1.DesviarConVentY(y0j2);
                                    puntajeMaq = juez1.LocalizaciónTiroMaq(x1j2,y1j2);
                                    JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀ \nCoordenadas maquina (X,Y):"+"  ( "+x1j2+" , "+y1j2+" )"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                                    juez1.MostrarEstadísticasTiroMaq();

                                    viento1.calcularVariacion();
                                    double x0 = jugador1.TirarX();
                                    double y0 = jugador1.TirarY();
                                    double x1 = viento1.DesviarConVentX(x0);
                                    double y1 = viento1.DesviarConVentY(y0);
                                    puntajej1 = juez1.LocalizaciónTiroj1(x1,y1);

                                    juez1.restarTiros();
                                    JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀ \nCoordenadas (X,Y):"+"  ( "+x1+" , "+y1+" )"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                                    juez1.MostrarEstadísticasTiroj1();
                                    juez1.puntosTirosj1=0;
                                    juez1.puntosTirosj1 = 0;
                                    juez1.puntosTirosMaq = 0;
                                }
                            }

                        }
                        if(juez1.puntosSetj1>juez1.puntosSetMaq){ //mediante estos if se comparan las puntuaciones para determinar quien ganó cada set y así asignar la victoria al jugador que corresponde, esto será de gran ayuda para mostrar las estadísticas finales.
                            juez1.SumarSetj1();
                        }
                        else{   
                            if(juez1.puntosSetMaq>juez1.puntosSetj1){
                                juez1.SumarSetMaq();
                            }
                            else{
                                if(juez1.puntosSetMaq == juez1.puntosSetj1){
                                    juez1.SumarSetEmpate();
                                }
                            }
                        }
                        juez1.restarSets();
                        juez1.MostrarEstadísticasSets();
                        juez1.puntosSetj1=0;
                        juez1.puntosSetMaq=0;
                        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nEste set se jugó con un "+viento1.NombreTipoDeViento+"\nPuntos totales jugador 1:"+juez1.puntos+"\nPuntos totales maquina:"+juez1.puntosMaq+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");

                 }           
               
                 //En esta sección se presenta el código para llevar a cabo cierta parte de la muerte súbita, todos los datos se recopilan para determinar el ganador de la misma. Todo esto ocurre en caso de que haya ocurrido un empate.
                 
                    boolean muerteSubita=true;
                    if(juez1.setsGanadosj1==juez1.setsGanadosMaq){
                        muerteSubita=true;

                    }

                    else{

                        muerteSubita=false;

                    }

                   if (muerteSubita == false){
                        if (juez1.puntosMaq < juez1.puntos){
                            JOptionPane.showMessageDialog(null, "▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\n"+juez1.DeterminarGanador()+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");

                            JOptionPane.showMessageDialog(null, "▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nSe enfrentaron jugador1 : "+jugador1.NombreTipoDeJugador +" vs "+ "Jugador maquina: "+jugador2.NombreTipoDeJugador
                                + "\n"+juez1.MostrarEstadisticasFinales()+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                        }
                    }
                   else{
                        JOptionPane.showMessageDialog(null, "▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\n"+juez1.DeterminarGanador()+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");

                        JOptionPane.showMessageDialog(null, "▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nSe enfrentaron jugador1 : "+jugador1.NombreTipoDeJugador +" vs "+ "Jugador maquina: "+jugador2.NombreTipoDeJugador
                            + "\n"+juez1.MostrarEstadisticasFinales()+"\nQuedaron empates, la victoria se definirá en muerte subita"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                    }

                    registro1.CambiarPuntuacion(puntajej1);
                    juez1.reiniciarPuntos();
                    juez1.setsGanadosj1=0;
                    juez1.setsGanadosMaq=0;
                    puntajej1=0;
                    puntajeMaq=0;

                    while(muerteSubita){

                        Viento viento1 = new Viento();
                        viento1.calcularVariacion();
                        double x0=jugador1.TirarX();
                        double y0=jugador1.TirarY();
                        double x1=viento1.DesviarConVentX(x0);
                        double y1=viento1.DesviarConVentY(y0);
                        puntajej1=juez1.LocalizaciónTiroj1(x1,y1);
                        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nPuntaje: "+puntajej1+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");

                        viento1.calcularVariacion();
                        double x0j2=jugador2.EstrategiaX();
                        double y0j2=jugador2.EstrategiaY();
                        double x1j2=viento1.DesviarConVentX(x0j2);
                        double y1j2=viento1.DesviarConVentY(y0j2);
                        puntajeMaq=juez1.LocalizaciónTiroMaq(x1j2,y1j2);
                        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nPuntaje maquina: "+puntajeMaq+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");

                        if(puntajej1>puntajeMaq){
                            JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nGanaste"+"\nTu puntaje: "+puntajej1+"  vs  "+"Puntaje maquina: "+puntajeMaq+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                            muerteSubita=false;
                        }
                        if(puntajeMaq>puntajej1){
                            JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nPerdiste"+"\nTu puntaje: "+puntajej1+"  vs  "+"Puntaje maquina: "+puntajeMaq+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"); 
                            muerteSubita=false;
                        }
                        if(puntajeMaq==puntajej1){
                            JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nEmpate vuelva a tirar"+"\nTu puntaje: "+puntajej1+"  vs  "+"Puntaje maquina: "+puntajeMaq+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                            muerteSubita=true;
                        }
                    }

                    break;

                    case 2:
                    registro1.TablaPuntuaciones();

                    break;
                    case 3:
                    configuracion1.ConfigurarSets();
                    juez1.sets = configuracion1.sets;
                    registro1.BorrarPuntuacion();
                    break;

                    case 4:
                    configuracion1.ConfigurarTiros();
                    juez1.tiros = configuracion1.tiros;
                    registro1.BorrarPuntuacion();
                    break;

                    case 0: 
                    JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nPrograma ha terminado de Ejecutarse"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                    break;
                }
            }

            catch(Exception e){
                JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nError, introducir opcion válida o cerrar correctamente"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
            }

        }
    }
}

                else{
                    if(matrizTablero[i--][j]==X){
                        contadorX= contadorX++;
                        if(contadorX==3){
                            System.out.print("Ganó el jugador X");
                        }
                        DesplazarmeI(i,j);
                    }
                }