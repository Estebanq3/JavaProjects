import javax.swing.JOptionPane;
public class Main{
	public static void main( String [] args ){
		int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del primer lado:"));
		int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del segundo lado:"));
		int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del tercer lado:"));
		
		Operacion t = new Operacion();
		
		t.calcularMayor(lado1,lado2,lado3);
		t.calcularCatetos();
		t.calcularHipotenusa();
		t.esRectangulo();
		
	}
}