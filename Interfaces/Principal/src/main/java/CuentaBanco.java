
public class CuentaBanco {
    private String numeroCuenta;
    private String nombreCuenta;
    private double balance;

    public CuentaBanco(String numeroCuenta, String nombreCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCuenta = nombreCuenta;
        balance = 0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposito(double deposito){
        balance = balance + deposito;
    }
    
    public boolean retiro(double retiro){
        if (retiro > balance){
            return false;
        }
        else{
            balance = balance - retiro;
            return true;
        }
    }
    
    
}
