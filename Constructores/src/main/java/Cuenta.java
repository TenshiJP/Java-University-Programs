
public class Cuenta {
    private String numero, nombreCliente, direccionEmailCliente, numeroTelCliente;
    private double balance;
    
    public Cuenta(){
        this ("0000", "nombre", 0.0, "email", "telefono");
        System.out.println("Constructor vacio");
    }
    
    public Cuenta(String numero, String nombreCliente, double balance, 
            String direccionEmailCliente, String numeroTelCliente){
        System.out.println("Constructor con parametros");
        this.numero = numero;
        this.nombreCliente = nombreCliente;
        this.balance = balance;
        this.direccionEmailCliente = direccionEmailCliente;
        this.numeroTelCliente = numeroTelCliente;
    }

    public Cuenta(String numero, String nombreCliente, double balance) {
        this(numero, nombreCliente, balance, "email", "telefono");
//        this.numero = numero;
//        this.nombreCliente = nombreCliente;
//        this.balance = balance;
    }
    
    public void deposito(double montoDeposito){
        this.balance += montoDeposito;
        System.out.println("Deposito: "+ montoDeposito + " realizado" + 
                " nuevo Balance: " + this.balance);
    }
    
    public void retiro(double montoRetiro){
        if (this.balance - montoRetiro < 0){
            System.out.println("Saldo insuficiente, operación no realizada.");
        }
        else{
            this.balance -= montoRetiro;
            System.out.println("Retiro de " + montoRetiro + " procesado" + 
                    " nuevo Balance: " + this.balance);
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionEmailCliente() {
        return direccionEmailCliente;
    }

    public void setDireccionEmailCliente(String direccionEmailCliente) {
        this.direccionEmailCliente = direccionEmailCliente;
    }

    public String getNumeroTelCliente() {
        return numeroTelCliente;
    }

    public void setNumeroTelCliente(String numeroTelCliente) {
        this.numeroTelCliente = numeroTelCliente;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
