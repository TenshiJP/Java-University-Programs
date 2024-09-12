/**
 * Nombre: Angel Roberto Jacinto Payes
 * No.Carnet: 5990-20-1756
 * Sección: "A"
 */
import java.util.*;
public class ProgramaDos {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int primerNumero, segundoNumero;//Variables
        System.out.println("Bienvenido, a continuacion se le solicitará que ingrese dos numeros");
        System.out.println("Ingrese primer numero: ");
        primerNumero = entrada.nextInt();
        System.out.println("Ingrese segundo numero: ");
        segundoNumero = entrada.nextInt();
        if(primerNumero == segundoNumero){
            System.out.println("\nNÚMEROS SON IGUALES\n"+primerNumero+" = "+segundoNumero);
        }
        else{
            System.out.println("\nNÚMEROS NO SON IGUALES");
            if (primerNumero > segundoNumero){
                System.out.println("PRIMER NÚMERO ES MAYOR\n"+primerNumero+" > "+segundoNumero);
            }
            else{
                System.out.println("SEGUNDO NÚMERO ES MAYOR\n"+primerNumero+" < "+segundoNumero);
            }
        }
    }
}
