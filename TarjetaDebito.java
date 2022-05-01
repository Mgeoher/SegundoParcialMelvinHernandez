
package tarjetadecreditoydebito;

/**
 *
 * @author mgeoh
 */
public class TarjetaDebito extends TarjetaCredito {
    private int limiteDebito;

    public TarjetaDebito (){
        this.limiteDebito = 5000;
    }

    public int getlimiteDebito() {
        return limiteDebito;
    }
    public int comprar (int monto){
        return limiteDebito-monto;
       }
    public int depositar (int monto1 ){
        return limiteDebito+monto1;
    }
    
    
}
