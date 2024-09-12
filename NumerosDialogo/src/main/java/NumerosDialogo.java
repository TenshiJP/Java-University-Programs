/**
 *
 * @author Angel Roberto Jacinto Payes 5990-20-1756
 */
import javax.swing.JOptionPane;
public class NumerosDialogo {
    public static void main (String[] args){
        int diasCredito = 30;
        JOptionPane.showMessageDialog(null, ""+diasCredito);
        JOptionPane.showMessageDialog
                (null, "Cada factura vence en " + diasCredito + " dias.");
    }
}
