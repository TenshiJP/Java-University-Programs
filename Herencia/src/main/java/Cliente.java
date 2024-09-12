
public class Cliente extends Persona{
    private int idCliente;
    private boolean vip;
    
    public Cliente(String nombre, int idCliente, boolean vip){
        super(nombre);
        this.idCliente = idCliente;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "idCliente=" + idCliente + ", vip=" + vip + '}';
    }
    
}
