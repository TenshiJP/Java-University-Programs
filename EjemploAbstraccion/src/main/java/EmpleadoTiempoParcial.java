
public class EmpleadoTiempoParcial extends Empleado{
    private double pagoHora;

    public EmpleadoTiempoParcial(String numero, String nombre, double pagoHora) {
        super(numero, nombre);
        this.pagoHora = pagoHora;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }
    
     public double calculoPagoHora (int noHora){
         return noHora*pagoHora;
     }
     
    @Override
     public String getEstado(){
         return "Tiempo Parcial";
     }
}
