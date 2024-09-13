/*
    PROGRAMACIÓN II -SEGUNDO PARCIAL
    Nombre:     Angel Roberto Jacinto Payes
    Carnet:     5990-20-1756
    Sección:    "A"
 */
public class ProductoMuebles extends Producto implements Vencimiento, Garantia{
    private String material;            //Variable propia de la clase.
    
    public ProductoMuebles(){
        material = "material";
    }

    public ProductoMuebles(String codigo, String nombre, double precio, String descripcion, String ubicacion, String material) {
        super(codigo, nombre, precio, descripcion, ubicacion);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
     
    @Override
    public void tipoProducto(){
        System.out.println("\tMueble");
    }

    @Override
    public void imprimirInfo(){
        System.out.println("----------------------------------------------------");
        tipoProducto();
        System.out.println("    Codigo:         " + super.getCodigo());
        System.out.println("    Nombre:         " + super.getNombre());
        System.out.println("    Precio:         " + super.getPrecio());
        System.out.println("    IVA:            " + super.calcularIva());
        System.out.println("    Material:       " + material);
        System.out.println("    Descripcion:    " + super.getDescripcion());
        System.out.println("    Ubicación:      " + super.getUbicacion());
        System.out.println("----------------------------------------------------");
    }
    
    @Override
    public String toString() {
        return super.toString()+" Muebles{" + "material=" + material + '}';
    }

    
    public void fechaCaducacion() {
        System.out.println("Nuestro material " + getMaterial() + " es fino, por lo cual la durabilidad varia segun su cuido.");
    }


    public void tipoGarantia() {
        System.out.println("Garantia: Tienda Bebop garantiza el cambio o reposicion del mueble por accidentes en la entrega.");
    }
    
    
    
}
