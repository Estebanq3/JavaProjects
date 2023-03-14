import java.util.Scanner;
public class EfectuadoraDeConversiones{
    public void conversion(){
        Scanner entrada = new Scanner( System.in );
        int tipoDeConversion;
        double cucharadas;
		double tazas;
		double onzas;
		double gramos;
		double centigrados;
		double farenheit;
		int repetir=7;
		
        
        
        
		while (repetir==7){
		
		System.out.println( "Escriba cual conversion desea realizar" );
		System.out.println("Cucharadas a tazas - ingrese 1" );
		System.out.println("Tazas a cucharadas - ingrese 2" );
		System.out.println("Onzas a gramos - ingrese 3" );
		System.out.println("Gramos a onzas - ingrese 4" );
		System.out.println("Centigrados a farenheit - ingrese 5" );
		System.out.println("Farenheit a centigrados - ingrese 6" );
        tipoDeConversion = entrada.nextInt();
		switch(tipoDeConversion){
			
			
			case 1:
            System.out.println( "Ingrese la unidad en cucharadas" );
			cucharadas= entrada.nextDouble();
			tazas= ( cucharadas/16 ) ;
			System.out.println(cucharadas+ " cucharadas equivalen a " +tazas+ " tazas");
			System.out.println("Digite el numero 7 para salir al menu principal u 8 para terminar el programa");
			repetir = entrada.nextInt();
			if (repetir==8){
			System.out.println("El programa ha terminado de ejecutarse");
		}
			break;
			
			case 2:
			System.out.println( "Ingrese la unidad en tazas" );
			tazas= entrada.nextDouble();
			cucharadas= ( tazas* 16 );
			System.out.println(tazas+ " tazas equivalen a "+cucharadas+ " cucharadas");
			System.out.println("Digite el numero 7 para salir al menu principal u 8 para terminar el programa");
			repetir = entrada.nextInt();
			if (repetir==8){
			System.out.println("El programa ha terminado de ejecutarse");
		}
			break;
			
			case 3:
			System.out.println( "Ingrese la unidad en onzas" );
			onzas= entrada.nextDouble();
			gramos= ( onzas* 28.3495 );
			System.out.println(onzas+" onzas equivalen a "+gramos+ " gramos");
			System.out.println("Digite el numero 7 para salir al menu principal u 8 para terminar el programa");
			repetir = entrada.nextInt();
			if (repetir==8){
			System.out.println("El programa ha terminado de ejecutarse");
		}
			break;
			
			case 4:
			System.out.println( "Ingrese la unidad en gramos" );
			gramos= entrada.nextDouble();
			onzas= ( gramos* 0.035274 );
			System.out.println(gramos+" gramos equivalen a "+onzas+ " onzas");
			System.out.println("Digite el numero 7 para salir al menu principal u 8 para terminar el programa");
			repetir = entrada.nextInt();
			if (repetir==8){
			System.out.println("El programa ha terminado de ejecutarse");
		}
			break;
			
			case 5:
			System.out.println( "Ingrese la unidad en centigrados" );
			centigrados= entrada.nextDouble();
			farenheit= ( (centigrados * 1.8) + 32 );
			System.out.println(centigrados+" centigrados equivalen a "+farenheit+ " farenheit");
			System.out.println("Digite el numero 7 para salir al menu principal u 8 para terminar el programa");
			repetir = entrada.nextInt();
			if (repetir==8){
			System.out.println("El programa ha terminado de ejecutarse");
		}
			break;
			
			case 6:
			System.out.println( "Ingrese la unidad en farenheit" );
			farenheit= entrada.nextDouble();
			centigrados= ( (farenheit -32) / 1.8 );
			System.out.println(farenheit+" farenheit equivalen a "+centigrados+ " centigrados");
			System.out.println("Digite el numero 7 para salir al menu principal u 8 para terminar el programa");
			repetir = entrada.nextInt();
			if (repetir==8){
			System.out.println("El programa ha terminado de ejecutarse");
		}
			break;
			
			default:
				System.out.println("La opcion elegida no existe, favor digite una correcta");
			}
		}
	}
	
        
    
    
    	
}
