
/**
 * Calcula el área de los diferentes círculos para poder recibir las coordenadas modificadas 
 * y determinar si las coordenadas se encuentran dentro de los distintos círculos.
 * 
 * @Esteban Quesada Quesada
 * Sebastián González Varela
 * Steven Nuñez
 * @version 1.6 (29/9/2019)
 */


public class BlancoDiana {
    double cx, cy, r,coordenadaX, coordenadaY, x1Grande,y1Grande,r2Grande,rMedio,r2Medio,rPequeño,r2Pequeño, x1Mediano, y1Mediano,x1Pequeño,y1Pequeño;
    boolean puntoDentroGrande, puntoFueraGrande, puntoBordeGrande;
    boolean puntoDentroMediano, puntoFueraMediano, puntoBordeMediano;
    boolean puntoDentroPequeño, puntoFueraPequeño, puntoBordePequeño;

    public BlancoDiana(){
        cx=1;
        cy=1;
        r= 1;
        rMedio= 0.4;
        rPequeño= 0.05;
    }

    /*
     **@Función: Este método se encarga de calcular el área del círculo más grande de la diana
     **mediante el recibimiento de las variables cx y cy (las cuales son las coordenadas del 
     **centro del círculo), éstas variables se le restarán a las coordenadas X y Y para elevar
     **al cuadrado los resultados de la operación y así poder determinar si la coordenada final
     **x o y se encuentra adentro o afuera del círculo de mayor área, es decir, la gran Diana.
     **De acuerdo a la coordenada final se indicara mediante variables booleanas si el punto
     **queda dentro del círculo grande, queda en el borde o queda afuera.
     **@Parametros no posee, únicamente el método utiliza variables de la clase que se inician
     **en el constructor para realizar los cálculos determinados.Estas serían las variables 
     **booleanas puntoDentro,puntoFuera y puntoBorde, además las variables r2Grande, r, cx,
     **cy, x1Grande, y1Grande, coordenadaX y coordenadaY.
     */    
    public void LocalizacionEnGranDiana(){
        x1Grande = (coordenadaX-cx)*(coordenadaX-cx);
        y1Grande = (coordenadaY-cy)*(coordenadaY-cy);
        r2Grande = x1Grande+y1Grande;
        puntoDentroGrande = r2Grande<(r*r);
        puntoFueraGrande = r2Grande>(r*r);
        puntoBordeGrande = r2Grande==(r*r);
    }
    
    /*
     **@Función: Este método se encarga de calcular el área del círculo mediano de la diana
     **mediante el recibimiento de las variables cx y cy (las cuales son las coordenadas del 
     **centro del círculo), éstas variables se le restarán a las coordenadas X y Y para elevar
     **al cuadrado los resultados de la operación y así poder determinar si la coordenada final
     **x o y se encuentra adentro o afuera del círculo mediano, es decir, la Diana mediana.
     **De acuerdo a la coordenada final se indicara mediante variables booleanas si el punto
     **queda dentro del círculo mediano, queda en el borde o queda afuera.
     **@Parametros no posee, únicamente el método utiliza variables de la clase que se inician
     **en el constructor para realizar los cálculos determinados. Estas serían las variables 
     **booleanas puntoDentro,puntoFuera y puntoBorde, además las variables r2Medio, r medio, cx,
     **cy, x1Mediano, y1Mediano, coordenadaX y coordenadaY.
     */    
    public void LocalizacionEnMedianaDiana(){
        x1Mediano = (coordenadaX-cx)*(coordenadaX-cx);
        y1Mediano = (coordenadaY-cy)*(coordenadaY-cy);
        r2Medio = x1Mediano+y1Mediano;
        puntoDentroMediano = r2Medio<(rMedio*rMedio);
        puntoFueraMediano = r2Medio>(rMedio*rMedio);
        puntoBordeMediano = r2Medio==(rMedio*rMedio);
    }
    
/*
     **@Función: Este método se encarga de calcular el área del círculo más pequeño de la diana
     **mediante el recibimiento de las variables cx y cy (las cuales son las coordenadas del 
     **centro del círculo), éstas variables se le restarán a las coordenadas X y Y para elevar
     **al cuadrado los resultados de la operación y así poder determinar si la coordenada final
     **x o y se encuentra adentro o afuera del círculo de menor área, es decir, la pequeña Diana.
     **De acuerdo a la coordenada final se indicara mediante variables booleanas si el punto
     **queda dentro del círculo pequeño, queda en el borde o queda afuera.
     **@Parametros no posee, únicamente el método utiliza variables de la clase que se inician
     **en el constructor para realizar los cálculos determinados.Estas serían las variables 
     **booleanas puntoDentro,puntoFuera y puntoBorde, además las variables r2Pequeño, rPequeño, cx,
     **cy, x1Pequeño, y1Pequeño, coordenadaX y coordenadaY.
     */     
    public void LocalizacionEnPequeñaDiana(){
        x1Pequeño = (coordenadaX-cx)*(coordenadaX-cx);
        y1Pequeño = (coordenadaY-cy)*(coordenadaY-cy);
        r2Pequeño = x1Pequeño+y1Pequeño;
        puntoDentroPequeño = r2Pequeño<(rPequeño*rPequeño);
        puntoFueraPequeño = r2Pequeño>(rPequeño*rPequeño);
        puntoBordePequeño = r2Pequeño==(rPequeño*rPequeño);
    }

}

