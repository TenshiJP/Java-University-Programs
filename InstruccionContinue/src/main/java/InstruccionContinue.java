/**
 * @author Angel Roberto Jacinto Payes 5990-20-1756
 */
public class InstruccionContinue {
    public static void main (String[] argcs){
        int i;
        for(i=0;i<100;i++){
            if(i % 2 == 0)/* ¿par? */
                continue;/* Comienzo la iteración */
            System.out.printf("%d ",i);
        }
    }
}
