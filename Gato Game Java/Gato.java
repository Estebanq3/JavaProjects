import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gato {
  private static String[][] tablero = new String[3][3];

  static void imprimir_tablero(String tablero[][]){
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        System.out.print(tablero[i][j] + " ");
      }
      System.out.println("\n");
    }
  }

  int colocar_pieza(String tablero[][], int posicion, String marca){
    int exito = 0;
    switch (posicion){
      case 1:{
        if(tablero[0][0] == "_"){
          tablero[0][0] = marca;
          exito = 1;
        }
        break;
      }
      case 2:{
        if(tablero[0][1] == "_"){
          tablero[0][1] = marca;
          exito = 1;
        }
        break;
      }
      case 3:{
        if(tablero[0][2] == "_"){
          tablero[0][2] = marca;
          exito = 1;
        }
        break;
      }
      case 4:{
        if(tablero[1][0] == "_"){
          tablero[1][0] = marca;
          exito = 1;
        }
        break;
      }
      case 5:{
        if(tablero[1][1] == "_"){
          tablero[1][1] = marca;
          exito = 1;
        }
        break;
      }
      case 6:{
        if(tablero[1][2] == "_"){
          tablero[1][2] = marca;
          exito = 1;
        }
        break;
      }
      case 7:{
        if(tablero[2][0] == "_"){
          tablero[2][0] = marca;
          exito = 1;
        }
        break;
      }
      case 8:{
        if(tablero[2][1] == "_"){
          tablero[2][1] = marca;
          exito = 1;
        }
        break;
      }
      case 9:{
        if(tablero[2][2] == "_"){
          tablero[2][2] = marca;
          exito = 1;
        }
        break;
      }
    }
    return exito;
  }

  int verificar_ganador_columna(String tablero[][], String marca){
    int hay_3 = 0;
    for(int i = 0; i < 3; i++){
      if(tablero[0][i] == marca && tablero[1][i] == marca && tablero[2][i] == marca){
        hay_3 = 1;
      }
    }
    return hay_3;
  }

  int verificar_ganador_fila(String tablero[][], String marca){
    int hay_3 = 0;
    for(int i = 0; i < 3; i++){
      if(tablero[i][0] == marca && tablero[i][1] == marca && tablero[i][2] == marca){
        hay_3 = 1;
      }
    }
    return hay_3;
  }

  int verificar_ganador_diagonal(String tablero[][], String marca){
    int hay_3 = 0;
    if(tablero[0][0] == marca && tablero[1][1] == marca && tablero[2][2] == marca){
      hay_3 = 1;
    }
    return hay_3;
  }

  int verificar_lleno(String tablero[][]){
    int hay_3 = 1;
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        if(tablero[i][j] == "_"){
          hay_3 = 0;
        }
      }
    }
    return hay_3;
  }

 

  public static void main(String[] args) {
    Gato gato = new Gato();

    //initializar tablero
    int posiciones = 0;
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        gato.tablero[i][j] = "_";
        posiciones++;
      }
    }

    String marca = "x";
    while(gato.verificar_ganador_columna(gato.tablero, "x") != 1 && gato.verificar_ganador_columna(gato.tablero, "o") != 1 &&
    gato.verificar_ganador_fila(gato.tablero, "x") != 1 && gato.verificar_ganador_fila(gato.tablero, "o") != 1 &&
    gato.verificar_ganador_diagonal(gato.tablero, "x") != 1 && gato.verificar_ganador_diagonal(gato.tablero, "o") != 1 && gato.verificar_lleno(gato.tablero) != 1)
    {
      
      gato.imprimir_tablero(gato.tablero);
      Scanner entrada = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Seleccione la posicion en la cual colocará la ficha");
      String option = entrada.nextLine();

      if(gato.colocar_pieza(gato.tablero, Integer.parseInt(option), marca) == 1)
      {
        if(marca == "x"){
          marca = "o";
        }
        else{
          marca = "x";
        }
      }
      else{
        System.out.println(" *** Seleccione una posicion vacia ***");
      } 
    }
    //System.out.println("Tenemos un ganador!!!");
    gato.imprimir_tablero(gato.tablero);
    JOptionPane.showMessageDialog(null, "Tenemos un ganador!!!", "Fin del juego", JOptionPane.INFORMATION_MESSAGE);
  }
}