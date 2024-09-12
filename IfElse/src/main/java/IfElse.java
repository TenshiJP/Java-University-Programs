/**
 *
 * @author Angel Roberto Jacinto Payes
 */
import java.util.Scanner;
public class IfElse {
    public static void main (String [] argcs){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la nota entre (0-100)");
        double nota = entrada.nextDouble();
        if (nota >60){
            System.out.println("Curso Aprobado...");
        }
        else{
            System.out.println("Curso Reprobado...");
        }
    }
}
