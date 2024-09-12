
public class RevisionCuentaBanco extends CuentaBanco implements Revisar {

    public RevisionCuentaBanco(String numeroCuenta, String nombreCuenta) {
        super(numeroCuenta, nombreCuenta);
    }

    @Override
    public boolean revision() {
        if (getNumeroCuenta().length() != 8){
            return false;
        }
        for(int i=0; i<7; i++){
            if (!Character.isDigit(getNumeroCuenta().charAt(i))){
                return false;
            }
        }
        return true;
    }
    
    
    
}
