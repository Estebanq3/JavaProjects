public class Producto2 {
	private String	Nombre2;
	private int	Precio2;
	private boolean Anejo2;
	private char Dia2;
	
	public Producto2(){
		Nombre2="name";
		Precio2=0;
		Anejo2=false;
		Dia2='L';
	}
	public void	setNombre2(String Nombre2){
		this.Nombre2=Nombre2;
	}
	public void	setPrecio2(int Precio2){
		this.Precio2=Precio2;
	}
	public void	setAnejo2(boolean Anejo2){
		this.Anejo2=Anejo2;
	}
	public void	setDia2(char Dia2){
		this.Dia2=Dia2;
	}
	public String getNombre2(){
		return Nombre2;
	}
	public int getPrecio2(){
		return Precio2;
	}
	public boolean getAnejo2(){
		return Anejo2;
	}
	public char getDia2(){
		return Dia2;
	}
	public String toString(){
		return "Nombre2: "+Nombre2+" \nPrecio2: "+Precio2+" \nAnejo2: "+Anejo2+" \nDia2: "+Dia2;
	}
}