
package tarjetadecreditoydebito;

/**
 *
 * @author mgeoh
 */


public class TarjetaCredito {
    
   private int limiteCredito; 
   private String nombreTarjeta;
   private float tasaInteres;
   private String numeroTarjeta;
   private float saldoTarjeta;
   
    
   
   public TarjetaCredito (){
       this.limiteCredito = 10000;
       this.tasaInteres = (float) 0.5;
   }
    public int getlimiteCredito() {
        return limiteCredito;
    }
public int comprar (int monto){
    return limiteCredito-monto;
}
public int pagar (int monto1){
    return limiteCredito+monto1;
}

   
   
}
