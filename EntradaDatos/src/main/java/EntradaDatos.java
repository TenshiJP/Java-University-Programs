/**
 *
 * @author Angel Roberto Jacinto Payes 5990-20-1756
 */
import java.util.Scanner;
public class EntradaDatos {
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        double precio, impuesto;
        System.out.print("**Precio del Articulo**\n");
        System.out.print("Ingrese precio inicial: \n");
        precio = teclado.nextDouble();
        System.out.print("Ingrese tarifa de impuesto: \n");
        impuesto = teclado.nextDouble();
        precio = precio * (1+ impuesto/100);
        System.out.print("Costo despues de impuestos : " + precio);
    }
}
