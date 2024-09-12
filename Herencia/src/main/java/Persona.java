public class Persona {
    private String nombre;
    private char genero;
    private int edad;
    private String email;
    
    public Persona(){   
    }//Constructor Vacio
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    public Persona(String nombre, char genero, int edad, String email){
        this.nombre =   nombre;
        this.genero =   genero;
        this.edad   =   edad;
        this.email  =   email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", email=" + email + '}';
    }
    
}
