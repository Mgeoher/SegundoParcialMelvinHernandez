
package tarjetadecreditoydebito;

/**
 *
 * @author mgeoh
 */


public class TarjetaCredito {
    
   private int limiteCredito; 
   private String nombre;
   private String numero;
   private String tasaI;
   
   
    
   public TarjetaCredito (){
       this.limiteCredito = 10000;  
   }
    public int getlimiteCredito() {
        return limiteCredito;
    }    
    public int comprar (int monto){
        return limiteCredito-monto;
       }
    public int pagar (int monto1 ){
        return limiteCredito+monto1;
    }
    public String n (String nombre){
       return nombre;
        
    }
    public String nu (String numero){
       return numero;
    }
    public String tasa (String tasaI){
       return tasaI;
    }

    

    


      
}
