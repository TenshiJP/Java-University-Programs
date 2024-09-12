/**
 *
 * @author Angel Roberto Jacinto Payes
 */
import java.util.*;
public class Switch {
    public static void main (String [] argcs){
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Ingrese tipo de Cliente");
        System.out.println("Oro, Plata, Bronce :");
        String nivelCliente = entrada.nextLine();
        nivelCliente = nivelCliente.toLowerCase();
        System.out.println("Sus beneficios son los siguientes: ");
        switch (nivelCliente)
        {
            case "oro":
                System.out.println("\t Incluye cena para una persona");
            case "plata":
                System.out.println("\t Incluye desayuno");
            case "bronce":
                System.out.println("\t Parqueo gratis");
                System.out.println("\t Incluye periodico");
            default:
                System.out.println("\t Habitacion");
        }
    }
}
