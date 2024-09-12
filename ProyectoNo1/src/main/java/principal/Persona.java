
package principal;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String dpi;
    private int edad;
    
    public Persona(){
        nombre = "nombres_estudiante";
        apellido = "apellidos_estudiante";
        dpi = "no._dpi";
        edad = 0;
    }
    
    public Persona(String nombre, String apellido, String dpi, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void imprimirInfo();    /*Metodo Abstracto Para generar Carnet*/

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dpi=" + dpi + '}';
    }
    
}
