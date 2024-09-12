/**
 * @author Angel Roberto Jacinto Payes 5990-20-1756
 */
import java.util.*;
public class DoWhile {
    public static void main (String [] argcs){
        int cantidad;
        int cont = 1;
        float x, promedio;
        float suma = 0;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Promedio de numeros enteros");
        System.out.println("Ingrese la cantidad de numeros");
        cantidad = entrada.nextInt();
        do {
            System.out.printf("Ingrese numero %2d = ",cont);
            x = entrada.nextFloat();
            suma += x;
            cont++;
        }while(cont <= cantidad);
        promedio = suma/cantidad;
        System.out.printf("El promedio es: %.2f\n",promedio);
    }
}
