/*
 *  Nombre:     Angel Roberto Jacinto Payes
 *  Carnet:     5990-20-1756
 *  Sección:    "A"
 */
public class EmpleadoPorHoras extends Empleado{
    double horas;
    double sueldo;

    public EmpleadoPorHoras(String nombre, String apellido, String nss, double sueldoPorHoras, double horasTrabajadas) {
        super(nombre, apellido, nss);
        this.sueldo = sueldoPorHoras;
        this.horas = horasTrabajadas;
    }
    
    void establecerSuledo(double sueldoPorHoras){
        this.sueldo = sueldoPorHoras;
    }
    
    double obtenerSueldo(){
        return sueldo;
    }
    
    void establecerHoras(double horasTrabajadas){
        this.horas = horasTrabajadas;
    }
    
    double obtenerHoras(){
        return horas;
    }
    
    @Override
    double ingresos(){
        return sueldo*horas;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nHoras trabajadas:           " + horas + 
                "\nSueldo por horas:           " + sueldo;
    }
    
}
