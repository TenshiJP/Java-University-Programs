/*  *****   PARCIAL I *****
 *  Nombre:     Angel Roberto Jacinto Payes
 *  Carnet:     5990-20-1756
 *  Sección:    "A"
 */
public class Rectangulo extends ObjetoGeometrico {
    private double alto, ancho;//Variabales

    public Rectangulo(){                 /*Constructor Vacio*/
        this("color",0.0,0.0);
    }

    public Rectangulo(String color, double alto, double ancho) { /*Constructor*/
        super(color);
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    @Override
    public double getPerimetro(){
        return (2*ancho + 2*alto);                     //Formula: P = 2(b+h)
    }
    
    @Override
    public double getArea(){
        return ancho*alto;                             //Formula: A = b*h
    }
    
}
