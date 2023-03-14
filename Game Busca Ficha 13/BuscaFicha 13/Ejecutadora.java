 import javax.swing.JOptionPane;
public class Ejecutadora
{
    private String j1;
    private String j2;
    private int extension=0;
    private int salir=0;
    private int puntosJ1;
    private int puntosMJ1;
    private int puntosJ2;
    private int puntosMJ2;

     
    //public int tablero[];
    //public int casillaJugadores[];
    Tablero tablero = new Tablero();
  
 

public void Correr(){ //método que ejecuta todos los métodos para correr el juego, por eso se llama correr
    PreguntarExtension(); //método
    tablero.tablero = new int[extension]; 
    tablero.casillaJugadores = new int [extension];
    tablero.colores = new int [extension];
    for(int i=0; i<tablero.casillaJugadores.length; i++){
    tablero.tablero[i]= (int)(Math.random() * 4) + 0;
    tablero.colores[i]= (int)(Math.random() * 3) + 0;
    }
    tablero.AsignarFichas(extension);
    while(salir==0){
    ImprimirTablero();
    toString();
    StatsJ1();
    StatsJ2();
    if(puntosMJ1==13){ //en esta parte si se comienza el juego y ya alguien empieza con trece puntos pues gana y se termina el juego
    JOptionPane.showMessageDialog(null,"Ganó "+j1);
    salir=1;
    System.exit(0);
    }
    if(puntosMJ2==13){
    JOptionPane.showMessageDialog(null,"Ganó "+j2);
    salir=1;
    System.exit(0);
    }
    puntosJ1=0; // reinicio todos los puntos para que los puntos después de cada turno no se acumulen y se haga un cáluclo érroneo con puntos viejos
    puntosMJ1=0;
    puntosJ2=0;
    puntosMJ2=0;
    PreguntarJugadaJ1(); //pregunta al j1 por el movimiento que desea realizar
    ImprimirTablero(); // imprime el tablero para que el segundo jugador pueda observar el movimiento del primer jugador
    PreguntarJugadaJ2(); // pregunta al j2 por su movimiento a realizar
    System.out.print("\n");
    //ImprimirTablero(); //imprime el movimiento del segundo jugador
    }
    if(puntosMJ1==13){
    JOptionPane.showMessageDialog(null,"Ganó "+j1);
    salir=1;
    }
    if(puntosMJ2==13){
    JOptionPane.showMessageDialog(null,"Ganó "+j2);
    salir=1;
    }
    
}
    


public void StatsJ1(){
for(int i=0; i<tablero.casillaJugadores.length; ++i){
 if(tablero.casillaJugadores[i]==1){
    puntosJ1= puntosJ1+tablero.tablero[i];
 }
}
puntosMJ1=puntosJ1;
for(int i=0; i<tablero.casillaJugadores.length; ++i){
if(tablero.casillaJugadores[i]==1){
    if(tablero.colores[i]==1){
    puntosMJ1= puntosMJ1-1;
    }
    if(tablero.colores[i]==2){
    puntosMJ1= puntosMJ1*2;
    }
}
}
//JOptionPane.showMessageDialog(null,"Puntos de "+j1+":"+puntosJ1+ "\nPuntosReales:"+puntosMJ1); 
}  

  
public void StatsJ2(){
/*int colorAmarillo=0; //Método que calcula puntos reales según *+- o *-+
int colorRojo=0;
int colorVerde=0; */
for(int i=0; i<tablero.casillaJugadores.length; ++i){
 if(tablero.casillaJugadores[i]==2){
    puntosJ2= puntosJ2+tablero.tablero[i];
        /*if(tablero.colores[i]==0 && tablero.casillaJugadores[i]==2){ //Método *+- o *-+ 
            colorAmarillo=colorAmarillo+1;
        }
        if(tablero.colores[i]==1 && tablero.casillaJugadores[i]==2){
            colorRojo= colorRojo+1;
        }
        if(tablero.colores[i]==2 && tablero.casillaJugadores[i]==2){
            colorVerde= colorVerde+1;
        }*/
 }
}
puntosMJ2=puntosJ2;
for(int i=0; i<tablero.casillaJugadores.length; ++i){
if(tablero.casillaJugadores[i]==2){
    if(tablero.colores[i]==1){
    puntosMJ2= puntosMJ2-1;
    }
    if(tablero.colores[i]==2){
    puntosMJ2= puntosMJ2*2;
    }
}
}
/*puntosMJ1=puntosJ1; // otro método calculador de puntos según orden de operación *+- o *-+ 
for(int i=0; i<colorRojo; ++i){
puntosMJ1=puntosMJ1-1;
}
for(int i=0; i<colorVerde; ++i){
puntosMJ1=puntosMJ1*2;
}*/
JOptionPane.showMessageDialog(null,"Puntos de "+j1+":"+puntosJ1+ "\nPuntosReales:"+puntosMJ1+"\nPuntos de:"+j2+":"+puntosJ2+ "\nPuntosReales:"+puntosMJ2);   
}      
    

public int PreguntarExtension(){
    j1= JOptionPane.showInputDialog(null,"Nombre del jugador 1:");
    j2= JOptionPane.showInputDialog(null,"Nombre del jugador 2:"); 
    boolean seguir=false;
    while(seguir==false){    
    try{
       while(extension<12){
        extension = Integer.parseInt(JOptionPane.showInputDialog("Digite la extension del tablero:"));
        while(extension>16){
        extension = Integer.parseInt(JOptionPane.showInputDialog("Digite la extension del tablero:"));
        }
        seguir=true;
    }
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,"Digite un número entre 12 y 16");
    }
}
    return extension;
}
    
    
public void PreguntarJugadaJ1(){
    boolean seguir=false; 
    int opcionElegida=0;
        while(seguir==false){
        try{    
                while(opcionElegida<1){
                opcionElegida= Integer.parseInt(JOptionPane.showInputDialog(j1+"\nOpcion_1 Realizar Movimiento"+"\nOpcion_2 Salir"));
                switch(opcionElegida){
                case 1:
                tablero.MovFJ1(extension);
             
             
                //m[etodo de realizacion de movimiento
                break;
                case 2:
                salir=1;
                break;
                }
                    while(opcionElegida>2){
                    opcionElegida= Integer.parseInt(JOptionPane.showInputDialog(j1+"\nOpcion_1 Realizar Movimiento"+"\nOpcion_2 Salir"));
                    switch(opcionElegida){
                     case 1:
                     tablero.MovFJ1(extension);
                     
                     
                     //m[etodo de realizacion de movimiento
                     break;
                     case 2:
                     salir=1;
                     break;
                    }
                    }
             //seguir=true;
            }
        seguir=true;
        }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,"Digite la opcion 1 o la 2");
       }
      }
}    
    

    
    
    
public void PreguntarJugadaJ2(){
    boolean seguir=false; 
    int opcionElegida=0;
        while(seguir==false){
        try{    
                while(opcionElegida<1){
                opcionElegida= Integer.parseInt(JOptionPane.showInputDialog(j2+"\nOpcion_1 Realizar Movimiento"+"\nOpcion_2 Salir"));
                switch(opcionElegida){
                case 1:
                tablero.MovFJ2(extension);
             
             
                //m[etodo de realizacion de movimiento
                break;
                case 2:
                salir=1;
                break;
                }
                    while(opcionElegida>2){
                    opcionElegida= Integer.parseInt(JOptionPane.showInputDialog(j2+"\nOpcion_1 Realizar Movimiento"+"\nOpcion_2 Salir"));
                    switch(opcionElegida){
                     case 1:
                     tablero.MovFJ2(extension);
                     
                     
                     //m[etodo de realizacion de movimiento
                     break;
                     case 2:
                     salir=1;
                     break;
                    }
                    }
             //seguir=true;
            }
        seguir=true;
        }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,"Digite la opcion 1 o la 2");
       }
      }
}

public void ImprimirTablero(){    
System.out.print("\nTablero\n");
for(int i=0; i<tablero.colores.length; i++){
    if(tablero.colores[i]==0){
        System.out.print("|"+"A");
    }
    if(tablero.colores[i]==1){
        System.out.print("|"+"R");
    }
    if(tablero.colores[i]==2){
        System.out.print("|"+"V");
    }
}

System.out.print("\n");
for(int i=0; i<tablero.tablero.length; i++){
System.out.print("|"+tablero.tablero[i]);
}

System.out.print("\n");
for(int i=0; i<tablero.casillaJugadores.length; i++){
    if(tablero.casillaJugadores[i]==1){
        System.out.print("|"+j1.charAt(0));
    }
    if(tablero.casillaJugadores[i]==2){
        System.out.print("|"+j2.charAt(0));
    }
    if(tablero.casillaJugadores[i]==0){
        System.out.print("|"+"_");
    }
}   
}  
    
    
    
public int GetExtension(){
   return extension;
}
    

public String toString(){
String tira = "";
String tira2 = "";
String tira3 = "";
for(int c= 0; c < tablero.colores.length; ++c){
     if(tablero.colores[c]==0){
        tira+="a"+"|";
    }
    if(tablero.colores[c]==1){
        tira+="r"+"|";
    }
    if(tablero.colores[c]==2){
        tira+="v"+"|";
    }
}
for(int t= 0; t < tablero.tablero.length; ++t){
  tira2+=tablero.tablero[t]+"|"; 
}
for(int j = 0; j < tablero.casillaJugadores.length; ++j){
    if(tablero.casillaJugadores[j]==1){
        tira3+=j1.charAt(0)+"|";
    }
    if(tablero.casillaJugadores[j]==2){
        tira3+=j2.charAt(0)+"|";
    }
    if(tablero.casillaJugadores[j]==0){
        tira3+="_"+"|";
    }
}

JOptionPane.showMessageDialog(null, tira+"\n"+tira2+"\n"+tira3+"\n");
return tira;
}




}    


