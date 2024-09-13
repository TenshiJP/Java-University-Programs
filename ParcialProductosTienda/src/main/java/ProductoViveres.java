/*
    PROGRAMACIÓN II -SEGUNDO PARCIAL
    Nombre:     Angel Roberto Jacinto Payes
    Carnet:     5990-20-1756
    Sección:    "A"
 */
import java.time.*;
public class ProductoViveres extends Producto implements Vencimiento, Garantia{
    private String clasificacion;           //Variable propia de la clase.
    
    public ProductoViveres(){
        clasificacion = "clasificacion";
    }

    public ProductoViveres(String codigo, String nombre, double precio, String descripcion, String ubicacion, String clasificacion) {
        super(codigo, nombre, precio, descripcion, ubicacion);
        this.clasificacion = clasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
        
    @Override
    public void tipoProducto(){
        System.out.println("\tViveres");
    }

    @Override
    public void imprimirInfo(){
        System.out.println("----------------------------------------------------");
        tipoProducto();
        System.out.println("    Codigo:         " + super.getCodigo());
        System.out.println("    Nombre:         " + super.getNombre());
        System.out.println("    Precio:         " + super.getPrecio());
        System.out.println("    IVA:            " + super.calcularIva());
        System.out.println("    Clasificacion:  " + clasificacion);
        System.out.println("    Descripcion:    " + super.getDescripcion());
        System.out.println("    Ubicación:      " + super.getUbicacion());
        System.out.println("----------------------------------------------------");
    }
    
    @Override
    public String toString() {
        return super.toString()+" Viveres{" + "clasificacion=" + clasificacion + '}';
    }

 
    public void fechaCaducacion() {
        LocalDateTime hoy = LocalDateTime.now(); //Fecha y hora actual.
        LocalDateTime fechaCaduca = hoy.plusDays(265); //Fecha de vecimiento hoy + 265dias.
        System.out.println("Producto ingresado "+ hoy+"\nFecha de caducacion: "+fechaCaduca);
    }


    public void tipoGarantia() {
        System.out.println("Garantia: Tienda Bebop solo se acepta cambios si el producto ha caducado.");
    } 
    
}
