import javax.swing.JOptionPane; 
public class EfectuadoraDeConversiones{
    public void conversion(){
        String comentario="";
		String resultado="";
        int tipoDeConversion;
        double cucharadas;
		double tazas;
		double onzas;
		double gramos;
		double centigrados;
		double farenheit;
		double repetir=7;
		
        
        
        
			while (repetir==7){
			
			tipoDeConversion = Integer.parseInt(JOptionPane.showInputDialog( "Escriba cual conversion desea realizar:" 
			+ "\nCucharadas a tazas - ingrese 1" 
			+ "\nTazas a cucharadas - ingrese 2" 
			+ "\nOnzas a gramos - ingrese 3" 
			+ "\nGramos a onzas - ingrese 4" 
			+ "\nCentigrados a farenheit - ingrese 5" 
			+ "\nFarenheit a centigrados - ingrese 6" ));
	  
				switch(tipoDeConversion){
				
				
				case 1:
				cucharadas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la unidad en cucharadas"));
				tazas= ( cucharadas/16 );
				repetir= Double.parseDouble(JOptionPane.showInputDialog(cucharadas+ " cucharadas equivalen a " +tazas+ " tazas \n Digite el numero 7 para salir al menu principal" 
				+" u 8 para terminar el programa"));
				if (repetir==8){
				comentario=("El programa ha terminado de ejecutarse");
			}
				break;
				
				case 2:
				tazas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la unidad en tazas"));
				cucharadas= ( tazas* 16 );
				repetir= Double.parseDouble(JOptionPane.showInputDialog(tazas+ " tazas equivalen a "+cucharadas+ " cucharadas \n Digite el numero 7 para salir al menu principal" 
				+" u 8 para terminar el programa"));
				if (repetir==8){
				comentario=("El programa ha terminado de ejecutarse");
			}
				break;
				
				case 3:
				onzas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la unidad en onzas"));
				gramos= ( onzas* 28.3495 );
				repetir= Double.parseDouble(JOptionPane.showInputDialog(onzas+" onzas equivalen a "+gramos+ " gramos \n Digite el numero 7 para salir al menu principal" 
				+" u 8 para terminar el programa"));
				if (repetir==8){
				comentario=("El programa ha terminado de ejecutarse");
			}
				break;
				
				case 4:
				gramos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la unidad en gramos"));
				onzas= ( gramos* 0.035274 );
				repetir= Double.parseDouble(JOptionPane.showInputDialog(gramos+" gramos equivalen a "+onzas+ " onzas \n Digite el numero 7 para salir al menu principal" 
				+" u 8 para terminar el programa"));
				if (repetir==8){
				comentario=("El programa ha terminado de ejecutarse");
			}
				break;
				
				case 5:
				centigrados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la unidad en centigrados"));
				farenheit= ( (centigrados * 1.8) + 32 );
				repetir= Double.parseDouble(JOptionPane.showInputDialog(centigrados+" centigrados equivalen a "+farenheit+ " farenheit \n Digite el numero 7 para salir al menu principal" 
				+" u 8 para terminar el programa"));
				if (repetir==8){
				comentario=("El programa ha terminado de ejecutarse");
			}
				break;
				
				case 6:
				farenheit = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la unidad en farenheit"));
				centigrados= ( (farenheit -32) / 1.8 );
				comentario=(farenheit+" farenheit equivalen a "+centigrados+ " centigrados");
				repetir= Double.parseDouble(JOptionPane.showInputDialog(farenheit+" farenheit equivalen a "+centigrados+ " centigrados \n Digite el numero 7 para salir al menu principal" 
				+" u 8 para terminar el programa"));
				if (repetir==8){
				comentario=("El programa ha terminado de ejecutarse");
				}
				break;
				
				default:
					comentario=("La opcion elegida no existe, favor digite una correcta");
					}
			}
		
		JOptionPane.showMessageDialog(null, comentario);
		}
		
        
    
    
    	
}
