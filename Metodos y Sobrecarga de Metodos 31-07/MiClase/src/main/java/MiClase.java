/*
 * @author Angel Roberto Jacinto Payes 5990-20-1756
 */
public class MiClase {
    public static void main(String[] args) {
     Microfono microfono = new Microfono("Bat","Negro",123);//Instancia Oriniginal
     /*microfono.nombre = "Bat";
     microfono.color = "negro";
     microfono.modelo = 123;*/
     Micro micro = new Micro("Shure",2020,"Inalambrico");//Segunda Instancia
     /*micro.marca = "Shure";
     micro.anio = 2020;
     micro.clase = "Inalambrico";*/
     /*System.out.println(microfono);//1° instancia
     System.out.println(microfono.nombre);
     System.out.println(microfono.color);
     System.out.println(microfono.modelo);
     System.out.println(micro);//2° instancia
     System.out.println(micro.marca);
     System.out.println(micro.anio);
     System.out.println(micro.clase);
     //Metodos de la clase Microfono
     microfono.encender();
     microfono.apagar();
     microfono.seVolumen();
     System.out.println(microfono.getDescripcion());*/
     System.out.println(micro);//Caracteristicas de 2° instancia
     micro.conectado();
     micro.desconectado();
     micro.getDescripcion();
    }
}
