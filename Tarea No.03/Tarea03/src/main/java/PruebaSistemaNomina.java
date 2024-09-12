/*
 *  Nombre:     Angel Roberto Jacinto Payes
 *  Carnet:     5990-20-1756
 *  Sección:    "A"
 */
import java.util.*;
public class PruebaSistemaNomina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String name1, name2, name3, ape1, ape2, ape3, nss1, nss2, nss3;//Variables
        double sueldo, horas, ventas, tarifa, salario;
        
        /*Clase EmpleadoAsalariado*/
        System.out.println("\tSISTEMA DE NOMINAS\nIngrese Datos Empleado Asalariado:");
        System.out.println("Nombre:");
        name1 = entrada.next();
        System.out.println("Apellido:");
        ape1 = entrada.next();
        System.out.println("No.Seguro social:");
        nss1 = entrada.next();
        System.out.println("Salario:");
        salario = validarDouble();
        EmpleadoAsalariado asalariado = new EmpleadoAsalariado(name1,ape1,nss1,salario);//Instancia
        System.out.println("\n\tASALARIADO\n" + asalariado);
        System.out.printf("Ingresos:                   Q. %.2f \n", asalariado.ingresos());
        
        /*Clase EmpleadoPorHoras*/
        System.out.println("\nIngrese Datos Empleado por Horas:");
        System.out.println("Nombre:");
        name2 = entrada.next();
        System.out.println("Apellido:");
        ape2 = entrada.next();
        System.out.println("No.Seguro social:");
        nss2 = entrada.next();
        System.out.println("Sueldo por horas:");
        sueldo = validarDouble();
        System.out.println("Horas trabajadas");
        horas = validarDouble();
        EmpleadoPorHoras empleadoHoras = new EmpleadoPorHoras(name2, ape2, nss2, sueldo, horas);//Instancia
        System.out.println("\n\tPOR HORAS\n" + empleadoHoras);
        System.out.printf("Ingresos:                   Q. %.2f \n", empleadoHoras.ingresos());
        
        /*Clase EmpleadoPorComision*/
        System.out.println("\nIngrese Datos Empleado por Comision:");
        System.out.println("Nombre:");
        name3 = entrada.next();
        System.out.println("Apellido:");
        ape3 = entrada.next();
        System.out.println("No.Seguro social:");
        nss3 = entrada.next();
        System.out.println("Tarifa comision:");
        tarifa = validarDouble();
        System.out.println("Ventas brutas:");
        ventas = validarDouble();
        EmpleadoPorComision empleadoComision = new EmpleadoPorComision(name3, ape3, nss3, ventas, tarifa);//Instancia
        System.out.println("\n\tPOR COMISION\n" + empleadoComision);
        System.out.printf("Ingresos:                   Q. %.2f \n", empleadoComision.ingresos());
    }
    
    static double validarDouble(){      /*Metodo para continuar por posibles valores inesperados*/
        Scanner teclado = new Scanner(System.in);
         do{
             if(teclado.hasNext()){
                 if(teclado.hasNextDouble()){
                    return teclado.nextDouble();
                }
                 else{
                    teclado.next();
                    System.out.println("\tERROR: *** El tipo de dato ingresado no es el correcto ***"
                            + "\nDatos validos tipo Double: 10, 2, 3000.00, 65.50"
                            + "\nIngrese de nuevo:");
                }
             }
             else{
                 return 0;
             }
        }while(true);
    }
}
