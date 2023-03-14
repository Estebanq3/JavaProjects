
/**
 * Registro de Puntuación: La aplicacion debe registrar la puntuacion mas alta obtenenida por un jugador humano 
 * entre partidas. Siempre y cuando no cambien los parametros del juego como cantidad de sets 
 * o la cantidad de tiros por set. Si al ﬁnal de una partida el jugador sobrepasa el puntaje 
 * mas alto registrado, se le debe pedir el nombre al usuario y guardar tanto el puntaje como 
 * el nombre. Es importante mencionar que no necesariamente debe haber ganado la partida para 
 * romper el record del puntaje mas alto. En caso de que se cambie la conﬁguracion de la 
 * partida se debe limpiar el registro del puntaje y reiniciar el conteo.

 * 
 * @Esteban Quesada Quesada
 * Sebastián González Varela
 * Steven Nuñez Murillo.
 * @version 1.6 (29/9/2019)
 */
import javax.swing.JOptionPane;
public class RegistroPuntuacion{
    private double PuntuacionPrimerLugar;
    private String NombrePrimerLugar;
    String mensaje;

    public RegistroPuntuacion(){
        PuntuacionPrimerLugar=0;

        NombrePrimerLugar="";

        String mensaje="";
    }

    /*
     * @Funcion: Este método tiene como función actualizar la tabla de puntuaciones, debido a que
     * recibe la puntuacion de un jugador y la guarda si este es el jugador de mayor puntaje
     * hasta el momento. Debido a esto último que se menciona, la presencia de un if es necesario
     * en el código para poder comparar la puntuación de dos jugadores diferentes y así
     * determinar quien es el de mayor puntaje.
     */
    
    public void CambiarPuntuacion(double puntuacion){

        if (puntuacion>=PuntuacionPrimerLugar){
            NombrePrimerLugar = JOptionPane.showInputDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nIngrese su nombre"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
            PuntuacionPrimerLugar = puntuacion; 
            JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nEres el primer lugar"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
        } 

    }

    /*
     * En este método se borra la puntuación menor para poder introducir la puntuación más
     * alta ingresada.
     */
    
    public void BorrarPuntuacion(){
        NombrePrimerLugar="";
        PuntuacionPrimerLugar=0;

    }

     /*
     * En este método se únicamente se muestra la puntuación más alta registrada en el 
     * juego.
     */
    public void TablaPuntuaciones(){
        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nPrimer Lugar: "+NombrePrimerLugar+"  puntuacion ---> "+PuntuacionPrimerLugar+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");

    }
}
