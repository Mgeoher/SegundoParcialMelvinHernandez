
package tarjetadecreditoydebito;

import java.util.Scanner;

/**
 *
 * @author mgeoh
 */
public class Principal {

    public static void main(String[] args) {
        
       TarjetaCredito tC = new TarjetaCredito () ; 
       
      System.out.println("Bienvenido");
       
       Scanner sc= new Scanner(System.in);
       
     /**   System.out.println("Digite el nombre de la Tarjeta");
       String nombre = sc.nextLine(); 
        
        System.out.println("Digite el numero de la Tarjeta");
        String numeroTarjeta = sc.nextLine(); 
        
        System.out.println("Digite la tasa de interes de la Tarjeta");
        String tasa = sc.nextLine(); 
        
       System.out.print("Bienvenido ");
       System.out.println(nombre);
       System.out.print("Su numero de tarjeta es ");
       System.out.println(numeroTarjeta);
       System.out.print("y su tasa se interes es ");
       System.out.println(tasa);
       System.out.print("su saldo acuatual es ");
       System.out.println(tC.getlimiteCredito()); **/
       
       System.out.println("que desea realizar");
       System.out.println("1-Comprar  2- pagar  3-consultar saldo");
       int opcion = sc.nextInt(); 
       
       switch (opcion) 
               {
           case 1:
               System.out.println("Ingrese el valor a pagar");
               int monto = sc.nextInt();
                System.out.print("el total de su saldo es ");
               System.out.println(tC.comprar(monto));
              
               
               break;
           case 2:
               
               System.out.println("Ingrese el valor");
               int monto1 = sc.nextInt();
               System.out.print("el nuevo monto es ");
               System.out.println(tC.pagar(monto1));
               
               break;
               
           case 3:
               System.out.print("su saldo acuatual es ");
                    System.out.println(tC.getlimiteCredito());
               break;
               
       }
    }
    
}
