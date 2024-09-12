
package principal;
import static operaciones.Crear.*;
import static operaciones.Escribir.*;
import static operaciones.Leer.*;
import static operaciones.Adjuntar.*;

public class GestionArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\angel\\Documents\\Ingeniería en Sitemas de Información y Ciencias de la Computación\\Semestre IV\\Programación II\\Proyectos Java\\Manejo de Excepciones\\PG2.txt"/*"*C:\\TEMP\\PG2.txt*"*/;
        crearArchivo(nombreArchivo);
        escribirArchivo(nombreArchivo);
        leerArchivo(nombreArchivo);
        adjuntarArchivo(nombreArchivo); 
        leerArchivo(nombreArchivo);
    }
    
}
