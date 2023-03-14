

public class ConversoraDeBinarioDecimal {
    private Interfaz interfaz;
    private PrimeraCalculadora calculadora;
    
    public ConversoraDeBinarioDecimal(){
        interfaz = new Interfaz();
        calculadora = new PrimeraCalculadora();
    }
    
    public void pedirTipoDeConversion(){
        int instruccion = -1;
        boolean volverAPedir = true;
        boolean seguir = true;
        while (seguir){
            while (volverAPedir){
                instruccion = interfaz.pedirTipoEnInterfaz ("Digite el numero de la conversion a realizar:  \n"+"1 - Binario a Decimal\n"+"2 - Decimal a Binario\n"+"3 - SALIR");
                
                if (instruccion == 1){
                    
                    calculadora.recibirTipo(instruccion);
                    procedimientos();
                    volverAPedir = false;
                }
                else{
                    if (instruccion == 3){
                        
                        interfaz.terminar ("Terminando", "El programa ha terminado de ejecutarse");  
                        volverAPedir = false;
                        seguir = false;
                    }
                    else{
                        if(instruccion == 2){
                            
                            calculadora.recibirTipo(instruccion);
                            procedimientosParaDecimal();
                            volverAPedir = false;
                        }
                    }
                }
                volverAPedir = !(instruccion > 0 && instruccion <= 3);
            }
        }
    }
    
    
    public void pedirCantidadDeConversionBinaria(){
        int cantidadBinaria = -1;
        boolean volverAPedir= true;
        String cantidadBinaria1 = "";
        while (volverAPedir){
                cantidadBinaria = interfaz.pedirCantidadBinariaEnInterfaz("Digite el numero binario");
                cantidadBinaria1 = Integer.toString(cantidadBinaria);
                int longitud = cantidadBinaria1.length();
                
                for(int i = 0; i<longitud; i++){
                    if(cantidadBinaria1.charAt(i) != 0 || cantidadBinaria1.charAt(i) != 1 ) {
                        volverAPedir = true;
                    }
                }
                volverAPedir = false;
       }
       calculadora.recibirCantidadBinaria(cantidadBinaria1);
    }
    
    public void solicitarDigitoDeConversionDecimal(){
        int cantidadDecimal = -1;
        boolean volverAPedir = true;
        while (volverAPedir){
            cantidadDecimal = interfaz.pedirCantidadEnInterfaz("Digite el numero decimal");
            volverAPedir = !(cantidadDecimal >= 0 );
        }
        calculadora.recibirCantidadDecimal (cantidadDecimal);
    }
       
    public void realizarConversionBinaria(){
        calculadora.calcularConversionBinaria ();
    }
     
    public void realizarConversionDecimal(){
        calculadora.calcularConversionBinaria ();
     }
    
    public void mostrarConversion1(){
        interfaz.mostrarConversionFinal("Resultado",""+calculadora.calcularConversionBinaria());
    }
    
    public void mostrarConversion(){
        interfaz.mostrarConversionFinal("Resultado",""+calculadora.calcularConversionDecimal());
    }

    public void procedimientos(){
        pedirCantidadDeConversionBinaria();
        realizarConversionBinaria();
        mostrarConversion1();
        pedirTipoDeConversion();
    }
    
    public void procedimientosParaDecimal(){
    solicitarDigitoDeConversionDecimal();
    realizarConversionDecimal();
    mostrarConversion();
    pedirTipoDeConversion();
    }
}
