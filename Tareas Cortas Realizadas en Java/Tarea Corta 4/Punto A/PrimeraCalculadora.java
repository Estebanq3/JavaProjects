

public class PrimeraCalculadora {
  
    private int instruccion;
    private String cantidadBinaria;
    private int cantidadDecimal;
    private String resultado;
    private int resultado1;
    private String unidad;
    
    public  PrimeraCalculadora(){
        instruccion = 0;
        cantidadBinaria = "";
        cantidadDecimal = 0;
        resultado = "";
        resultado1 = 0;
        unidad = "";
    }
    
    public void recibirTipo (int instruccion){
    this.instruccion = instruccion; 
    }
    
    public void recibirCantidadBinaria (String cantidadBinaria){
    this.cantidadBinaria = cantidadBinaria; 
    }
    
     public void recibirCantidadDecimal (int cantidadDecimal){
    this.cantidadDecimal = cantidadDecimal; 
    }
    
    public int calcularConversionBinaria(){
            int longitud = cantidadBinaria.length();
            int resultado1 = 0;
            int potencia = longitud - 1;
            for(int i = 0;i < longitud;i++){
               if(cantidadBinaria.charAt(i) == '1'){
                resultado1 += Math.pow(2,potencia);
               }
               potencia --;
            }
            return resultado1;
    }
    
    public String calcularConversionDecimal(){
        
        int temp = cantidadDecimal;
        String respuesta = "";
        int unidades = "1000".length();
        while (respuesta.length() < unidades){
            while (temp != 0){
               if(temp % 2 == 0){
                respuesta = "0" + respuesta;
               }else{
                respuesta = "1" + respuesta;
               }
               temp = temp / 2;
            }
            respuesta = "0" + respuesta;
        }
        return respuesta;
    }
     
     public String apuntarConversion (int instruccion){
        String unidad = "";
        switch (instruccion){
            case 1:
            unidad = cantidadBinaria+" Binario equivalen a "+resultado+" Decimal";
            break;
            case 2:
            unidad = cantidadDecimal+" Decimal equivalen a "+resultado+" Binario";
            break; 
        }
        return unidad;
    }
    
    public String getConversion(){
        return ""+apuntarConversion(instruccion);
    }
}
  
