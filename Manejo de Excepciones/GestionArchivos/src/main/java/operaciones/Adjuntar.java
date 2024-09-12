
package operaciones;

import java.io.*;
public class Adjuntar {
    public static void adjuntarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido =  "Agregando informacion puto...";
            salida.println(contenido);
            salida.println("Fin de operacion. ");
            salida.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
