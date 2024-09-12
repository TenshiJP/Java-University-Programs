package operaciones;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Leer {
    public static void leerArchivo(String nombreArchivo){
        File archivotxt = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader (archivotxt));
            String lectura = entrada.readLine();
            while (lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
