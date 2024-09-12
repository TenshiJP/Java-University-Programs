/**
 * Nombre: Angel Roberto Jacinto Payes
 * No.Carnet: 5990-20-1756
 * Sección: "A"
 */
import java.util.*;
public class ProgramaCuatro {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int nota;//variables
        System.out.println("Curso de Programación II 2021\nIngrese la nota obtenida del curso:");
        nota = entrada.nextInt();
        if(nota>90 && nota<=100){
            System.out.println(nota+ " pts. \n¡SOBRESALIENTE!");
        }
        else if(nota>60 && nota<=90){
            System.out.println(nota+ " pts. \n¡APROBADO!");
        }
        else{
            System.out.println(nota+ " pts. \n¡REPROBADO!");
        }
    }
}
