
public class Micro {
    String marca;
    int anio;
    String clase;

    public void conectado(){
        System.out.println("Microfono "+ this.marca + " esta apagado");
    };
    public void desconectado(){
        System.out.println("Microfono "+ this.marca + " esta encendido");
    };
    public String getDescripcion(){
        return "Marca del Mic "+ this.marca +" Anio: "+ this.anio + " Clase: "+ this.clase;
    }

    public Micro(String marca, int anio, String clase) {
        this.marca = marca;
        this.anio = anio;
        this.clase = clase;
    }
    
}
