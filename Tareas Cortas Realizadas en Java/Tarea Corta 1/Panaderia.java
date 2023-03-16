import java.util.Scanner;

public class Panaderia{
	public static void main(String[]args){
		Producto p1=new Producto();
		Producto p2=new Producto();
		Producto p3=new	Producto();
		Producto p4=new Producto();
		Producto2 p5=new Producto2();
		
		p1.setNombre("Pizza");
		p1.setPrecio(18);
		p1.setAnejo(false);
		p1.setDia('L');
		
		p2.setNombre("Choripan");
		p2.setPrecio(20);
		p2.setAnejo(false);
		p2.setDia('K');
		
		p3.setNombre("Caneloncho");
		p3.setPrecio(30);
		p3.setAnejo(true);
		p3.setDia('M');
		
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Digite: nombre precio anejo dia");
	
		String nombre = entrada.next();
		int precio = entrada.nextInt();
		boolean anejo = entrada.nextBoolean();
		char dia = entrada.next().charAt(0);
		
		p4.setNombre(nombre);
		p4.setPrecio(precio);
		p4.setAnejo(anejo);
		p4.setDia(dia);

		Scanner entrada1 =new Scanner(System.in);
		
		System.out.println("Digite: nombre precio anejo dia");
	
		String nombre2 = entrada.next();
		int precio2 = entrada.nextInt();
		boolean anejo2 = entrada.nextBoolean();
		char dia2 = entrada.next().charAt(0);
		
		p5.setNombre2(nombre2);
		p5.setPrecio2(precio2);
		p5.setAnejo2(anejo2);
		p5.setDia2(dia2);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);	
		System.out.println(p5);
		
		System.exit(0);
	}
}	