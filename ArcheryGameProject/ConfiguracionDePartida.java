
/**
 * Configuración Tiro: Las partidas tienen dos parametros, la cantidad de sets que se jugaran en la partida y 
 * la cantidad de ﬂechas que se dispararan en cada set. Estos deben ser conﬁgurables mediante
 * el menu de la aplicacion (descrito en la seccion 1.7). En caso de omision, la partida 
 * debe conﬁgurarse con dos sets y tres tiros por cada set.

 * 
 * @Esteban Quesada Quesada
 * Sebastián González Varela
 * Steven Nuñez Murillo.
 * @version 1.6 (29/9/2019))
 */
import javax.swing.JOptionPane;
public class ConfiguracionDePartida{
    public int sets;
    public int tiros;
    public int opcion;

    public ConfiguracionDePartida(){
        sets=2;
        tiros=3;
        opcion=-1;
    }

    public int getSets(){

        return sets;
    }

    public int getTiros(){

        return tiros;
    }

    /*
     * @Funcion: Este método se utiliza para configurar la cantidad de sets de la partida. Si
     * el jugador desea modificar la cantidad defecto de 2 sets, debera hacer uso de este
     * método a través del menú.
     */
    public void ConfigurarSets(){
        boolean seguir = true;
        while(seguir){
            try{
                String lectura = JOptionPane.showInputDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nEliga una opcion"+"\nOpcion 1: Cambiar numero de sets"+
                        "\nOpcion 0: Volver al menu"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                opcion = Integer.parseInt(lectura); 
                switch(opcion){
                    case 0:
                    seguir = false;
                    break;
                    case 1:
                    String x = JOptionPane.showInputDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nIngrese numero de sets"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");

                    if(Integer.parseInt(x)>0){
                        sets = Integer.parseInt(x);
                    }else{
                        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nEl valor debe ser mayor a 0"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");

                    }

                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nDigite un numero valido"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
            }

        }

    }

    
        /*
     * @Funcion: Este método se utiliza para configurar la cantidad de tiros de la partida. Si
     * el jugador desea modificar la cantidad defecto de 3 tiros, debera hacer uso de este
     * método a través del menú.
     */
    public void ConfigurarTiros(){
        boolean continuar = true;
        while(continuar){
            try{
                String lectura = JOptionPane.showInputDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nEliga una opcion"+"\nOpcion 1: Cambiar numero de tiros"+
                        "\nOpcion 0: Volver al menu"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                opcion = Integer.parseInt(lectura); 
                switch(opcion){
                    case 0:
                    continuar = false;
                    break;
                    case 1:
                    String x = JOptionPane.showInputDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nIngrese numero de tiros"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
                    
                    if(Integer.parseInt(x)>0){
                        tiros = Integer.parseInt(x);
                    }else{
                        JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nEl valor debe ser mayor a 0"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");

                    }

                }

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀"+"\nDigite un numero valido"+"\n▀▄▀▄▀▄▀▄▀▄▀▀▄▀▄▀▄▀");
            }

        }

    }
}
