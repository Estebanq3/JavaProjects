import java.util.Scanner; 
public class Vuelto{
	public static void main( String[] args ){
		int DineroIngresado;
		int Monedade5 = 0;
		int Monedade10 = 0;
		int Monedade25 = 0;
		int Monedade50 = 0;
		int Monedade100 = 0;
		int Monedade500 = 0;
		int Billetede1000 = 0;
	
	Scanner v = new Scanner(System.in);
	System.out.println( "Introduzca el costo del producto" );
	DineroIngresado = v.nextInt();
	DineroIngresado = 1000 - DineroIngresado;
	System.out.printf(" El vuelto del cliente es %d", DineroIngresado); //esto es para decir cuanto dinero es lo que se le devuelve
		if (DineroIngresado == 0){
			System.out.println( " \n Usted no tiene vuelto" );
			}
		else
			while (DineroIngresado >= 500){
			DineroIngresado = DineroIngresado - 500;
			Monedade500 = Monedade500 + 1;
			}
			while (DineroIngresado >= 100){
			DineroIngresado = DineroIngresado - 100;
			Monedade100 = Monedade100 + 1;
			}
			while (DineroIngresado >= 50){
			DineroIngresado = DineroIngresado - 50;
			Monedade50 = Monedade50 + 1;
			}
			while (DineroIngresado >= 25){
			DineroIngresado = DineroIngresado - 25;
			Monedade25 = Monedade25 + 1;
			}
			while (DineroIngresado >= 10){
			DineroIngresado = DineroIngresado - 10;
			Monedade10 = Monedade10 + 1;
			}
			while (DineroIngresado >= 5){
			DineroIngresado = DineroIngresado - 5;
			Monedade5 = Monedade5 + 1;
			}
			
			
	if ( Monedade500 >= 1){		
	System.out.printf(" \n Monedas de 500: %d", Monedade500);}
	if ( Monedade100 >= 1){
	System.out.printf(" \n Monedas de 100: %d", Monedade100);}
	if ( Monedade50 >= 1){
	System.out.printf(" \n Monedas de 50: %d", Monedade50);}
	if ( Monedade25 >= 1){
	System.out.printf(" \n Monedas de 25: %d", Monedade25);}
	if ( Monedade10 >= 1){
	System.out.printf(" \n Monedas de 10: %d", Monedade10);}
	if ( Monedade5 >= 1){
	System.out.printf(" \n Monedas de 5: %d", Monedade5);}
	}
}
