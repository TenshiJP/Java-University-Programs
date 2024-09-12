/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.io.*;
public class Crear {
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Archivo fue creado.\n Operacion exitosa");
        } catch (FileNotFoundException ex) {
            System.out.println("Operacion incorrecta");
            //ex.printStackTrace(System.out);
        }
    }
}
