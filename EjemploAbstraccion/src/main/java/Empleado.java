
public abstract class Empleado {
    private String numero, nombre;
    
    public Empleado(String numero, String nombre){
        this.numero = numero;
        this.nombre = nombre;   
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String getEstado();

    @Override
    public String toString() {
        return "Empleado{" + "numero=" + numero + ", nombre=" + nombre + '}';
    }
}
