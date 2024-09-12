
public class Microfono {
    String nombre;
    String color;
    int modelo;
    
    public void encender(){
        System.out.println(this.nombre + " Enceder");
    };
    public void apagar(){
        System.out.println(this.nombre + " Apagar");
    };
    public void seVolumen(){  
        System.out.println(this.nombre + " Establecer Volumen");
    };
    public String getDescripcion(){
        return "Nombre del Mic "+ this.nombre +" Color: "+ this.color + " Modelo: "+ this.modelo;
    }

    public Microfono(String nombre, String color, int modelo) {
        this.nombre = nombre;
        this.color = color;
        this.modelo = modelo;
    }
}
