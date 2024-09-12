
public class EmpleadoTiempoCompleto extends Empleado{
    private double salarioAnual;
    
    public EmpleadoTiempoCompleto(String numero, String nombre, double salarioAnual){
        super (numero, nombre);
        this.salarioAnual = salarioAnual;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }
    
    @Override
    public String getEstado(){
        return "Tiempo Completo";
    }
    
    public double calculoPagoMensual(){
        return salarioAnual/12;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoTiempoCompleto{" + "salarioAnual=" + salarioAnual + '}';
    }
    
}
