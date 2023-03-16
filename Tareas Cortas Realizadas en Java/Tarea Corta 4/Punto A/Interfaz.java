import javax.swing.JOptionPane;

public class Interfaz{
    
   public int pedirTipoEnInterfaz(String mensaje){
        int tipo = -1;
        String tipoEnLetras = JOptionPane.showInputDialog(mensaje);
       
        try {
            tipo = Integer.parseInt(tipoEnLetras);
        }
        catch (Exception e) {
            tipo = -1;
        }
        return tipo;
   }
    
   public int pedirCantidadEnInterfaz(String mensaje){
        int cantidad = 0;
        String cantidadEnLetras =JOptionPane.showInputDialog(mensaje);
        
        try {
            cantidad = Integer.parseInt(cantidadEnLetras);
        }
        catch (Exception e) {
            cantidad = 0;
        
        }
        return cantidad;
   }
   
   public int pedirCantidadBinariaEnInterfaz(String mensaje){
        int cantidad = 0;
        String cantidadEnLetras =JOptionPane.showInputDialog(mensaje);
        
        try {
             cantidad = Integer.parseInt(cantidadEnLetras);
        }
        catch (Exception e) {
            cantidad = 0;
        
        }
        return cantidad;
   }
   
   public void terminar (String titulo, String mensaje){
       JOptionPane.showMessageDialog(null,mensaje,titulo,JOptionPane.INFORMATION_MESSAGE);
   }
    
   public void mostrarConversionFinal (String titulo, String mensaje){
        JOptionPane.showMessageDialog(null,mensaje,titulo,JOptionPane.QUESTION_MESSAGE);
   }
}
