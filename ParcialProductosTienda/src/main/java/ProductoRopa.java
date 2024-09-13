/*
    PROGRAMACIÓN II -SEGUNDO PARCIAL
    Nombre:     Angel Roberto Jacinto Payes
    Carnet:     5990-20-1756
    Sección:    "A"
 */
public class ProductoRopa extends Producto implements Vencimiento, Garantia{
    private String color;               //Variables propias de la clase.
    private String marca;
    
    public ProductoRopa(){
        color = "color";
        marca = "marca";
    }

    public ProductoRopa(String codigo, String nombre, double precio, String descripcion, String ubicacion, String color, String marca) {
        super(codigo, nombre, precio, descripcion, ubicacion);
        this.color = color;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    @Override
    public void tipoProducto(){
        System.out.println("\tRopa");
    }

    @Override
    public void imprimirInfo(){
        System.out.println("----------------------------------------------------");
        tipoProducto();
        System.out.println("    Codigo:         " + super.getCodigo());
        System.out.println("    Nombre:         " + super.getNombre());
        System.out.println("    Precio:         " + super.getPrecio());
        System.out.println("    IVA:            " + super.calcularIva());
        System.out.println("    Marca:          " + marca);
        System.out.println("    Color:          " + color);
        System.out.println("    Descripcion:    " + super.getDescripcion());
        System.out.println("    Ubicación:      " + super.getUbicacion());
        System.out.println("----------------------------------------------------");
    }
    
    @Override
    public String toString() {
        return super.toString()+" Ropa{" + "color=" + color + ", marca=" + marca + '}';
    }

    
    public void fechaCaducacion() {
        System.out.println(getNombre()+" su durabilidad varia segun el uso y cuidado.");
    }


    public void tipoGarantia() {
        System.out.println("Garantia: Tienda Bebop no acepta cambio, ni devoluciones.");
    }
    
    
    
}
