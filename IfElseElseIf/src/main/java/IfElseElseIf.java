/**
 *
 * @author angel
 */
import java.util.Scanner;
public class IfElseElseIf {
    public static void main (String [] argcs){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la nota entre (0-100)");
        double nota = entrada.nextDouble();
        if (nota == 100){
            System.out.println("...Excelente...");
        }
            else if ((nota >= 90 ) && (nota <100)){
                System.out.println("Muy Bueno");
            }
            else if (nota >= 70){
                System.out.println("Bueno");
            }
            else if (nota >= 60){
                System.out.println("Aprobado");
            }
            else{
                System.out.println("Reprobado");
            }
    }
}
