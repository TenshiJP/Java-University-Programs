/**
 * @author Angel Roberto Jacinto Payes 5990-20-1756
 */
import java.util.*;
public class CicloFor {
    public static void main (String [] argcs){
        int upperCaseLetters = 0;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese una cadena de texto:");
        String str = entrada.nextLine();
        for (int i =0; i < str.length();i++){
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                upperCaseLetters++;
            }
        }
        System.out.println("Numero de letra mayusculas: "+ upperCaseLetters);
    }
}
