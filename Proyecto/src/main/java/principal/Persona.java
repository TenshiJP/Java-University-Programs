package principal;

public abstract class Persona {
    /*Variables de la clase Persona*/
    private String nombre;
    private String apellido;
    private String dpi;
    private int edad;
    
    public Persona(){       /*Constructor vacio*/
        
    }

    public Persona(String nombre, String apellido, String dpi, int edad) {  /*Constructor*/
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.edad = edad;
    }

    /*Inicio - Metodos get y set de las variables de la clase.*/
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
    /*Fin - Metodos get y set.*/

    public abstract void imprimirInfo();    /*Metodo Abstracto para imprimir informacion de la clase*/

    /*Metodo To String modificado*/
    @Override
    public String toString() {
        return "Nombre(s) = " + nombre + "||Apellido(s) = " + apellido + "|| DPI = " + dpi + "|| Edad = " + edad + " ||";
    }
    
}
