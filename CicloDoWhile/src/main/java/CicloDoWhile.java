/** *
 * @author Angel Roberto Jacinto Payes 5990-20-1756
 */ 
import java.util.*;
public class CicloDoWhile {
    public static void main (String [] argcs){
        Scanner in = new Scanner(System.in);
        int value;
        do{
            System.out.println("Escribe un numero entero < 100: ");
            value = in.nextInt();
        }while(value >= 100);//test
    }
}
