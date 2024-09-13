/*
    PROGRAMACIÓN II -SEGUNDO PARCIAL
    Nombre:     Angel Roberto Jacinto Payes
    Carnet:     5990-20-1756
    Sección:    "A"
 */
public class ProductoElectrodomestico extends Producto implements Vencimiento, Garantia{
    private String marca;              //Variables propias de la clase.
    private double peso;
    
    public ProductoElectrodomestico(){
        marca = "marca";
        peso = 0.00;
    }

    public ProductoElectrodomestico(String codigo, String nombre, double precio, String descripcion, String ubicacion, String marca, double peso) {
        super(codigo, nombre, precio, descripcion, ubicacion);
        this.marca = marca;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    @Override
    public void tipoProducto(){
        System.out.println("\tElectrodomestico");
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
        System.out.println("    Descripcion:    " + super.getDescripcion());
        System.out.println("    Peso:           " + peso);
        System.out.println("    Ubicación:      " + super.getUbicacion());
        System.out.println("----------------------------------------------------");
    }

    @Override
    public String toString() {
        return super.toString() + " Electrodomestico{" + "marca=" + marca + ", peso=" + peso + '}';
    }

    
    public void fechaCaducacion() {
        System.out.println(getNombre() + " tiene un aproximado de 15 años de vida");
    }


    public void tipoGarantia() {
        System.out.println("Garantia: Tienda Bebop garantiza por dos años a partir de la fecha de compra, "
                + "\nel funcionamiento de este producto contra cualquier defecto en los materiales "
                + "\ny mano de obra empleados para su fabricación ");
    }
       
}
