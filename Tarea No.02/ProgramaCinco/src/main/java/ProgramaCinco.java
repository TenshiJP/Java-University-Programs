/**
 * Nombre: Angel Roberto Jacinto Payes
 * No.Carnet: 5990-20-1756
 * Sección: "A"
 */
import java.text.DecimalFormat;
import java.util.*;
public class ProgramaCinco {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;//variables
        double peso, altura, imc;
        System.out.println("INDICE DE MASA COORPORAL");
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su peso (libras): ");
        peso = entrada.nextDouble();
        System.out.println("Ingrese su altura (pulgadas): ");
        altura = entrada.nextDouble();
        //calculo del IMC
        peso = peso*703;
        altura= altura*altura;
        imc = peso/altura;
        DecimalFormat in = new DecimalFormat("#.00");
        if (imc <18.5){
            System.out.println("\n"+nombre+" su IMC es: "+in.format(imc)+"\n¡Bajo de peso!");
        }
        else if (imc >=18.5 && imc <=24.9){
            System.out.println("\n"+nombre+" su IMC es: "+in.format(imc)+"\n¡Saludable!");
        }
        else{
            System.out.println("\n"+nombre+" su IMC es: "+in.format(imc)+"\n¡Sobrepeso!");
        }
    }
}
