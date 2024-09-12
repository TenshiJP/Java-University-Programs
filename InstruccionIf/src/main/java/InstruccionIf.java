/**
 *
 * @author Angel Roberto Jacinto Payes
 */
import java.util.Scanner;
public class InstruccionIf {
    public static void main (String [] args){
        Scanner entrada =  new Scanner(System.in);
        int nota;
        
        System.out.println("Ingrese valor de la nota: ");
        nota = entrada.nextInt();
        
        if (nota > 60){
            System.out.println("Curso aprobado");
        }
    }
}
