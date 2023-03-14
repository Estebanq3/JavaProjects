
import javax.swing.JOptionPane;
public class Tablero
{
    public int tablero[];
    public int casillaJugadores[];
    public int colores[];
    public int fichaPosJ1=1;
    public int posJ1=1;
    public int fichaPosJ2=1;
    public int posJ2=1;




   
public void AsignarFichas(int extension)
    {
    int ultimaCasilla= extension;
    casillaJugadores[ultimaCasilla-1]=2;
    casillaJugadores[ultimaCasilla-2]=2;
    casillaJugadores[ultimaCasilla-3]=2;
    casillaJugadores[0]=1;
    casillaJugadores[1]=1;
    casillaJugadores[2]=1;
    
}
    
public void MovFJ1(int extension){
boolean seguir=false;
boolean posicion= false;
boolean destino = false;
boolean seguir2=false;
int respuesta=0;
    
while(respuesta<1){
        fichaPosJ1 = Integer.parseInt(JOptionPane.showInputDialog("Posicion Ficha a mover:"));
        respuesta= fichaPosJ1;
        while(respuesta>extension){
        fichaPosJ1 = Integer.parseInt(JOptionPane.showInputDialog("Posicion Ficha a mover:"));
        respuesta= fichaPosJ1;
        }
}
respuesta=0;
while(casillaJugadores[fichaPosJ1-1]!=1){
      fichaPosJ1 = Integer.parseInt(JOptionPane.showInputDialog("Posicion Ficha a mover:"));
      posicion = true;
}
    
while(respuesta<1){
        posJ1 = Integer.parseInt(JOptionPane.showInputDialog("Destino"));
        respuesta= posJ1;
        while(respuesta>extension){
        posJ1 = Integer.parseInt(JOptionPane.showInputDialog("Destino:"));
        respuesta= posJ1;
        }
}
while(casillaJugadores[posJ1-1]!=0){
    posJ1 = Integer.parseInt(JOptionPane.showInputDialog("Destino"));
    destino = true;
}
    
if(posicion && destino == true){
    seguir=true;
}

if(casillaJugadores[fichaPosJ1-1]==1){
        casillaJugadores[posJ1-1]=casillaJugadores[fichaPosJ1-1];
        casillaJugadores[fichaPosJ1-1]=0;
}
if(casillaJugadores[posJ1-1]==0){
        casillaJugadores[posJ1-1]=casillaJugadores[fichaPosJ1-1];
        casillaJugadores[fichaPosJ1-1]=0;
}
}



public void MovFJ2(int extension){
boolean seguir=false;
boolean posicion= false;
boolean destino = false;
boolean seguir2=false;
int respuesta=0;
    
while(respuesta<1){
        fichaPosJ2 = Integer.parseInt(JOptionPane.showInputDialog("Posicion Ficha a mover:"));
        respuesta= fichaPosJ2;
        while(respuesta>extension){
        fichaPosJ2 = Integer.parseInt(JOptionPane.showInputDialog("Posicion Ficha a mover:"));
        respuesta= fichaPosJ2;
        }
}
respuesta=0;
while(casillaJugadores[fichaPosJ2-1]!=2){
      fichaPosJ2 = Integer.parseInt(JOptionPane.showInputDialog("Posicion Ficha a mover:"));
      posicion = true;
}
    
while(respuesta<1){
        posJ2 = Integer.parseInt(JOptionPane.showInputDialog("Destino"));
        respuesta= posJ2;
        while(respuesta>extension){
        posJ2 = Integer.parseInt(JOptionPane.showInputDialog("Destino:"));
        respuesta= posJ2;
        }
}
while(casillaJugadores[posJ2-1]!=0){
    posJ2 = Integer.parseInt(JOptionPane.showInputDialog("Destino"));
    destino = true;
}
    
if(posicion && destino == true){
    seguir=true;
}

if(casillaJugadores[fichaPosJ2-1]==1){
        casillaJugadores[posJ2-1]=casillaJugadores[fichaPosJ2-1];
        casillaJugadores[fichaPosJ2-1]=0;
}
if(casillaJugadores[posJ2-1]==0){
        casillaJugadores[posJ2-1]=casillaJugadores[fichaPosJ2-1];
        casillaJugadores[fichaPosJ2-1]=0;
}
}



    


}
