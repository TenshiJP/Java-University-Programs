
public class Principal {
    public static void main(String[] args) {
        RevisionCuentaBanco cuenta1 = new RevisionCuentaBanco("01234567","nombre1");
        RevisionCuentaBanco cuenta2 = new RevisionCuentaBanco("41234567","nombre2");
        System.out.println("La cuenta No.1 es: " + revisarValidez(cuenta1));
        System.out.println("La cuenta No.2 es: " + revisarValidez(cuenta2));
        
    }
    
    public static String revisarValidez(Revisar objeto){/*Metodo para enviar el objeto*/
        if(objeto.revision()){
            return "Valida";
        }
        else{
            return "Invalaida";
        }
    }
    
}
