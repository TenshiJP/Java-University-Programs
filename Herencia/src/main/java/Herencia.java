/*Nombre:     Angel Roberto Jacinto Payes
Carnet:     5990-20-1756
Sección:    "A"*/
import java.util.*;
public class Herencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("nombreEmpleado1",1,1000.00);
        empleado1.setEdad(18);
        empleado1.setGenero('M');
        empleado1.setEmail("email@gmail.com");
        System.out.println(empleado1);
        Cliente cliente1 = new Cliente("nombreCliente1",1,true);
        System.out.println(cliente1);
        
        int id;String nombre;//Variables
        System.out.println("\nIngreso de Datos\t \nNOMBRE:  ");
        nombre=name();
        System.out.println("ID:  ");
        id=numero();
        //Nueva instancia de Empleado
        Empleado empleado2 = new Empleado(nombre,id,3000.00);
        empleado2.setGenero('M');
        empleado2.setEdad(19);
        empleado2.setEmail("ajacintor1@miumg.edu.gt");
        //Nueva instancia de Cliente
        Cliente cliente2 = new Cliente(nombre,id,true);
        cliente2.setEmail("ssatomigt@gmail.com");
        System.out.println("\nEmpleado Datos:\t " + empleado2);
        System.out.println("Cliente Datos: \t " + cliente2);
    }
    
    static int numero(){
        int a;
        Scanner entrada = new Scanner(System.in);
        a = entrada.nextInt();
        return a;
    }
    
    static String name(){
       String a;
       Scanner entrada = new Scanner(System.in);
       a = entrada.nextLine();
       return a; 
    }
}
