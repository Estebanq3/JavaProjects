import java.util.Scanner; 
public class Vuelto{
	public static void main( String[] args ){
		int CostodeProducto;
		int Monedade5 = 0;
		int Monedade10 = 0;
		int Monedade25 = 0;
		int Monedade50 = 0;
		int Monedade100 = 0;
		int Monedade500 = 0;
		int Billetede1000 = 0;
		int Billetede2000 = 0;
		int Billetede5000 = 0;
		int Billetede10000 = 0;
		int Billetede20000 = 0;
		int Billetede50000 = 0;
		int PagaCon = 0;
	
	Scanner v = new Scanner(System.in);
	System.out.println( "Introduzca el costo del producto" );
	CostodeProducto = v.nextInt();
	Scanner p = new Scanner(System.in);
	System.out.println( "Introduzca el el dinero con el que paga" );
	PagaCon = p.nextInt();
	CostodeProducto = PagaCon - CostodeProducto;
	System.out.printf(" El vuelto del cliente es %d", CostodeProducto); //esto es para decir cuanto dinero es lo que se le devuelve
		if (CostodeProducto == 0){
			System.out.println( " \n Usted no tiene vuelto" );
			}
		else
			while (CostodeProducto >= 50000){
			CostodeProducto = CostodeProducto - 50000;
			Billetede50000 = Billetede50000 + 1;
			}
			while (CostodeProducto >= 20000){
			CostodeProducto = CostodeProducto - 20000;
			Billetede20000 = Billetede20000 + 1;
			}
			while (CostodeProducto >= 10000){
			CostodeProducto = CostodeProducto - 10000;
			Billetede10000 = Billetede10000 + 1;
			}
			while (CostodeProducto >= 5000){
			CostodeProducto = CostodeProducto - 5000;
			Billetede5000 = Billetede5000 + 1;
			}
		
			while (CostodeProducto >= 2000){
			CostodeProducto = CostodeProducto - 2000;
			Billetede2000 = Billetede2000 + 1;
			}
			while (CostodeProducto >= 1000){
			CostodeProducto = CostodeProducto - 1000;
			Billetede1000 = Billetede1000 + 1;
			}
		
			while (CostodeProducto >= 500){
			CostodeProducto = CostodeProducto - 500;
			Monedade500 = Monedade500 + 1;
			}
			while (CostodeProducto >= 100){
			CostodeProducto = CostodeProducto - 100;
			Monedade100 = Monedade100 + 1;
			}
			while (CostodeProducto >= 50){
			CostodeProducto = CostodeProducto - 50;
			Monedade50 = Monedade50 + 1;
			}
			while (CostodeProducto >= 25){
			CostodeProducto = CostodeProducto - 25;
			Monedade25 = Monedade25 + 1;
			}
			while (CostodeProducto >= 10){
			CostodeProducto = CostodeProducto - 10;
			Monedade10 = Monedade10 + 1;
			}
			while (CostodeProducto >= 5){
			CostodeProducto = CostodeProducto - 5;
			Monedade5 = Monedade5 + 1;
			}
			
	
	if ( Billetede50000 >= 1){		
	System.out.printf(" \n Billete de 50000: %d", Billetede50000);}
	if ( Billetede20000 >= 1){		
	System.out.printf(" \n Billete de 20000: %d", Billetede20000);}
	if ( Billetede10000 >= 1){		
	System.out.printf(" \n Billete de 10000: %d", Billetede10000);}
	if ( Billetede5000 >= 1){		
	System.out.printf(" \n Billete de 5000: %d", Billetede5000);}
	if ( Billetede2000 >= 1){		
	System.out.printf(" \n Billete de 2000: %d", Billetede2000);}
	if ( Billetede1000 >= 1){		
	System.out.printf(" \n Billete de 1000: %d", Billetede1000);}
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
