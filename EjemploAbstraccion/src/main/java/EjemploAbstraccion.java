
public class EjemploAbstraccion {
    public static void main(String[] args) {
        EmpleadoTiempoParcial emp1 = new EmpleadoTiempoParcial("1","NombreEmpleado1",50);
        System.out.println(emp1);
//        System.out.println("Nombre: "+ emp1.getNombre());
//        System.out.println("Numero: "+ emp1.getNumero());
//        System.out.println("Pago: "+ emp1.calculoPagoHora(40));
//        
        EmpleadoTiempoCompleto emp2 = new EmpleadoTiempoCompleto("2","NombreEmpleado2",5000.00);
        System.out.println(emp2);
      
        pruebaMetodo(emp1);//Enviando Objetos a un metodo.  
        pruebaMetodo(emp2);//Enviando Objetos a un metodo.
    }    
    //Metodo
    static void pruebaMetodo(Empleado emp){
            System.out.println("Numero Empleado: "+ emp.getNumero());
    }
}
