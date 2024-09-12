/*
 *  Nombre:     Angel Roberto Jacinto Payes
 *  Carnet:     5990-20-1756
 *  Sección:    "A"
 */
public class Empleado {
    String numeroSeguroSocial;//Varaibles
    String apellidoPaterno;
    String primerNombre;

    public Empleado(String nombre, String apellido, String nss) {
        this.primerNombre = nombre;
        this.apellidoPaterno = apellido;
        this.numeroSeguroSocial = nss;
    }

    void establecerPrimerNombre(String nombre){
        this.primerNombre = nombre;
    }
    
    String obetenerPrimerNombre(){
        return primerNombre;
    }
        
    void establecerApellidoPaterno(String apellido){
        this.apellidoPaterno = apellido;
    }
    
    String obetenerApellidoPaterno(){
        return apellidoPaterno;
    }
    
    void establecerSeguroSocial(String nss){
        this.numeroSeguroSocial = nss;
    }
    
    String obetenerSeguroSocial(){
        return numeroSeguroSocial;
    }
    
    double ingresos(){
        return 0;
    }

    @Override
    public String toString() {
        return "Empleado:                   " + primerNombre + " " 
                + apellidoPaterno + "\nNumero de Seguro Social:    " + numeroSeguroSocial;
    }
    
}
