
package operaciones;

import java.io.*;
public class Escribir {
    public static void escribirArchivo(String nombreArchivo){
        File archivo = new File (nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter (archivo);
            String contenido = "Texto a escribir en el File. ";
            salida.println(contenido);
            salida.close();
            System.out.println("Escritura correcta.\nOperacion exitosa");
        } catch (FileNotFoundException ex) {
            //System.out.println("");
            ex.printStackTrace(System.out);
        }
    }
}
