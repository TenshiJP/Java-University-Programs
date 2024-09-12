/*
 *  Nombre:     Angel Roberto Jacinto Payes
 *  Carnet:     5990-20-1756
 *  Sección:    "A"
 */
public class EmpleadoAsalariado extends Empleado{
    double salarioSemanal;
    
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        this.salarioSemanal = salario;
    }
    
    void establecerSalarioSemanal(double salario){
        this.salarioSemanal = salario;
    }
    
    double obtenerSalarioSemanal(){
        return salarioSemanal;
    }
    
    @Override
    double ingresos(){
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nSalario Semanal:            " + salarioSemanal;
    }
    
}
