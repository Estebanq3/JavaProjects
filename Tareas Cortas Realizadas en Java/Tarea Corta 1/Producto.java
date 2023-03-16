public class Producto {
	private String	Nombre;
	private int	Precio;
	private boolean Anejo;
	private char Dia;
	
	public Producto(){
		Nombre="name";
		Precio=0;
		Anejo=false;
		Dia='L';
	}
	public void	setNombre(String Nombre){
		this.Nombre=Nombre;
	}
	public void	setPrecio(int Precio){
		this.Precio=Precio;
	}
	public void	setAnejo(boolean Anejo){
		this.Anejo=Anejo;
	}
	public void	setDia(char Dia){
		this.Dia=Dia;
	}
	public String getNombre(){
		return Nombre;
	}
	public int getPrecio(){
		return Precio;
	}
	public boolean getAnejo(){
		return Anejo;
	}
	public char getDia(){
		return Dia;
	}
	public String toString(){
		return "Nombre: "+Nombre+"\nPrecio: "+Precio+" \nAnejo: "+Anejo+" \nDia: "+Dia;
	}
}