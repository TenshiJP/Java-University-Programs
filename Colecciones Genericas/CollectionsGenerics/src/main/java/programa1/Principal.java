package programa1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();              /*Colecion de objetos*/
        Vehiculo vehiculo1 = new Vehiculo ("Toyota","Yaris",100000,true);
        
        vehiculos.add(vehiculo1);
        vehiculos.add(new Vehiculo("Honda","Civic",150000,true));
        
        for(Vehiculo carro: vehiculos){                                         /*Codigo para imprimir*/
                System.out.println(carro);
        }
    }
}
