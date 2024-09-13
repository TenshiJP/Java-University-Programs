/*  *****   PARCIAL I *****
 *  Nombre:     Angel Roberto Jacinto Payes
 *  Carnet:     5990-20-1756
 *  Sección:    "A"
 */
import java.util.*;
public class PruebaObjetoGeometrico {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);/*Leer valores desde el teclado*/
        /*Instancias del Circulo*/
        double radio;//Varbles para el circulo
        String colorCirculo;
        System.out.println("CIRCULO\t \nIngreso de Datos\nColor:      ");
        colorCirculo = a.next();
        System.out.println("Radio:      ");
        radio = a.nextDouble();
        Circulo circulo2 = new Circulo(colorCirculo,radio);//Instancia valores leidos. Inciso a)
        circulo2.printCirculo();
        
        Circulo circulo1 = new Circulo("Negro",6.0);//Instancia valores incrsutados. Inciso b)
        circulo1.printCirculo();
        //System.out.println(circulo1);
        
        /*Instancias del Rectángulo*/
        double alto, ancho;//Varibles para el Rectangulo
        String colorRectangulo;
        System.out.println("\n\tRECTANGULO \nIngreso de Datos \nColor:       ");
        colorRectangulo = a.next();
        System.out.println("Alto:       ");
        alto = a.nextDouble();
        System.out.println("Ancho:      ");
        ancho = a.nextDouble();
        Rectangulo rectangulo2 = new Rectangulo(colorRectangulo, alto, ancho);//Instancia valores leidos. Inciso a)
        System.out.println("\t***** RECTANGULO *****");
        System.out.println("Color:          "+ rectangulo2.getColor());
        System.out.println("Perimetro:      "+ rectangulo2.getPerimetro());
        System.out.println("Area:           "+ rectangulo2.getArea());
        
        Rectangulo rectangulo1 = new Rectangulo("Verde",2.0,5.0);//Instancia valores incrsutados. Inciso b)
        System.out.println("\t***** RECTANGULO *****");
        System.out.println("Color:          "+ rectangulo1.getColor());
        System.out.println("Perimetro:      "+ rectangulo1.getPerimetro());
        System.out.println("Area:           "+ rectangulo1.getArea());
        //System.out.println(rectangulo1);
        
    }
}
