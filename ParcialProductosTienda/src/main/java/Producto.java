/*
    PROGRAMACIÓN II -SEGUNDO PARCIAL
    Nombre:     Angel Roberto Jacinto Payes
    Carnet:     5990-20-1756
    Sección:    "A"
 */
public abstract class Producto {
    private String codigo;             //Varialbes: Atributos del producto dados en el PDF.
    private String nombre;
    private double precio;
    private String descripcion;
    private String ubicacion;
    private boolean descuento;
    
    public Producto(){      /*Constructor Vacío*/
        codigo = "0000";
        nombre = "nombre_producto";
        precio = 0.0;
        descripcion = "descripcion";
        ubicacion = "ubicacion";
    }

    public Producto(String codigo, String nombre, double precio, String descripcion, String ubicacion) { /*Constructor*/
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public double calcularIva(){                /*Metodo para cacular iva del producto*/
        return precio*0.12;
    }
    
    public abstract void tipoProducto();        /*Metodo Abstracto*/
    //public abstract double descuento();

    public abstract void imprimirInfo();
    
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", ubicacion=" + ubicacion + '}';
    }
    
    
}
