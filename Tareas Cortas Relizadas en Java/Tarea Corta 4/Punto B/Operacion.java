public class Operacion
{
	int calculoCatense;
	int calculohipotenuso;
	int hipotenusa;
	int cateto1;
	int cateto2;
	int error;
	
	public void calcularMayor(int c1, int c2, int c3){ //uso de parametros para poder calcular cuales son los catetos y cual es la hipotenusa.
	if(c1==c2 & c2==c3){
	error= 1;	
	}
	if( c1>c2 ){
	hipotenusa = c1;
	cateto1 = c2;
	}	
	if(c1>c3){
	hipotenusa = c1;
	cateto2 = c3;
	}
	if(c2>c1){
	hipotenusa = c2;
	cateto1 = c1;
	}
	if(c2>c3){
	hipotenusa = c2;
	cateto2 = c3;
	}
	if(c3>c1){
	hipotenusa = c3;
	cateto1 = c1;
	}
	if(c3>c2){
	hipotenusa = c3;
	cateto2 = c2;
	}
	}
	
	public void calcularCatetos (){
	calculoCatense = (cateto1*cateto1) + (cateto2*cateto2);
	}
	
	
	public void calcularHipotenusa(){
	calculohipotenuso = hipotenusa*hipotenusa;
	}
	public void esRectangulo(){
	if(error==1){
	System.out.println("No es un triangulo rectangulo");	
	}
	else
		if(calculoCatense==calculohipotenuso){
		System.out.println("Es un triangulo rectangulo");	
		}
		else
		System.out.println("No es un triangulo rectangulo");
	}
	public void mostrarQueEs(){
	System.out.println("La hipotenusa es:"+hipotenusa);
	System.out.println("La hipotenusa al cuadrado es:"+calculohipotenuso);
	System.out.println("La suma de los catetos al cuadrado es:"+calculoCatense);
	System.out.println("Cateto 1 es:"+cateto1);
	System.out.println("Cateto 2 es:"+cateto2);
	}
}