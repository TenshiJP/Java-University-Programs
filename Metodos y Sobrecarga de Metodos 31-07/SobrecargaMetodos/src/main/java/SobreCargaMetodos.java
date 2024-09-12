/*
 * @author Angel Roberto Jacinto Payes
 */
import java.util.*;
public class SobreCargaMetodos {
    public static void main(String[] args) {
        int maxDeDos, maxDeTres;
        int x1, x2, y1, y2, y3;//Varibles que se solicitarán.
        System.out.println("Bienvenido\n\tMETODO No.01");
        x1 = teclado();
        x2 = teclado();
        System.out.println("\tMETODO NO.02");
        y1 = teclado();
        y2 = teclado();
        y3 = teclado();
        int x = max(x1,x2);
        int y = max(y1,y2,y3);
        System.out.println("\tRESULTADO:\n"+ x);
        System.out.println(y);
    }
    //Primer Metodo
     static int max(int primerNumero, int segundoNumero){
        if(primerNumero > segundoNumero){
            return primerNumero;
        }
        else{
            return segundoNumero;
        }
    }
    //Segundo Metodo
    static int max(int primerNumero, int segundoNumero, int tercerNumero){
        int resultado;
        resultado = primerNumero;
        if(segundoNumero > resultado){
            resultado = segundoNumero;
        }
        if(tercerNumero > resultado){
            resultado = tercerNumero;
        }
        return resultado;
    }
    //metodo extra
    static int teclado(){
        Scanner entrada = new Scanner(System.in);
        int a;
        System.out.println("Ingrese un numero: ");
        a = entrada.nextInt();
        return a;
    }
}
