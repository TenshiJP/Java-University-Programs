package operaciones;

import java.io.*;
public class Crear {
    
    public static void crearArchivotxt(String nombreArchivo){
        File archivotxt = new File(nombreArchivo);
        try{
            boolean archivo = archivotxt.createNewFile();
            if(archivo){
                System.out.println("\tArchivo fue creado.\n\tOperacion exitosa");
            }else{
                System.out.println("\tArchivo existente");
            }
        }catch(IOException ex)  {
            System.out.println("Excepcion al crear el archivo" + ex);
        }
    }
}
