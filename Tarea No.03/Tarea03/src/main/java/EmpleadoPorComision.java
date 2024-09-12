/*
 *  Nombre:     Angel Roberto Jacinto Payes
 *  Carnet:     5990-20-1756
 *  Sección:    "A"
 */
public class EmpleadoPorComision extends Empleado {
    double tarifaComision;//Variables
    double ventaBrutas;
    
    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa){
        super (nombre, apellido, nss);
        this.ventaBrutas = ventas;
        this.tarifaComision = tarifa;
    }
    
    void establecerTarifaComision(double tarifa){
        this.tarifaComision = tarifa;
    }
    
    double obtenerTarifaComision(){
        return tarifaComision;
    }
    
    void establecerVentasBrutas(double ventas){
        this.ventaBrutas = ventas;
    }
    
    double obtenerVentasBrutas(){
        return ventaBrutas;
    }
    
    @Override
    double ingresos(){
        return ventaBrutas*tarifaComision;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "\nVentas brutas:              " + ventaBrutas 
                + "\nTarifa por comision:        " + tarifaComision;
    }
    
}
