public class Main {
    public static void main(String [] args){
        Cuenta cuenta1 = new Cuenta();
        //("001", "Arthur Fleck", 0, 
          //      "arthurfleck@mail.com","+50231411572");
//        Cuenta cuenta1 = new Cuenta();
//        cuenta1.setNumero("0001");
//        cuenta1.setNombreCliente("Arthur Fleck");
//        cuenta1.setBalance(0);
//        cuenta1.setDireccionEmailCliente("arthurfleck@mail.com");
//        cuenta1.setNumeroTelCliente("+50231411572");
        System.out.println(cuenta1.getNombreCliente());
        System.out.println(cuenta1.getNumero());
        cuenta1.deposito(1000.00);
        cuenta1.retiro(500.00);
        
        Cuenta cuenta2 = new Cuenta("002", "Joker", 0.0);
        System.out.println(cuenta2.getNombreCliente()); 
        
    }
}
