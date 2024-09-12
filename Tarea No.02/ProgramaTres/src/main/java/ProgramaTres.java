/**
 * Nombre: Angel Roberto Jacinto Payes
 * No.Carnet: 5990-20-1756
 * Sección: "A"
 */
import java.util.*;
public class ProgramaTres {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int primerNumero, segundoNumero, adivinar, respuesta;//Variables
        System.out.println("Bienvenido, a continuacion se le solicitará que ingrese dos numeros");
        System.out.println("Ingrese primer numero: ");
        primerNumero = entrada.nextInt();
        System.out.println("Ingrese segundo numero: ");
        segundoNumero = entrada.nextInt();
        System.out.println("\nAdivene el resultado de los dos numeros ingresados anteriormente\nIngrese su respuesta: ");
        adivinar = entrada.nextInt();
        respuesta = primerNumero + segundoNumero; 
        if (respuesta == adivinar){
             System.out.println("\n¡Felicidades! su respuesta es corecta");
             System.out.println(primerNumero+" + "+segundoNumero+" = "+respuesta);
        }
        else{
             System.out.println("\n¡Incorrecto! más suerete la próxima, la respuesta correcta es...");
             System.out.println(primerNumero+" + "+segundoNumero+" = "+respuesta);
        }
    }
}
