/*  *****   PARCIAL I *****
 *  Nombre:     Angel Roberto Jacinto Payes
 *  Carnet:     5990-20-1756
 *  Sección:    "A"
 */
public class Circulo extends ObjetoGeometrico{
    private double radio;//Variable

    public Circulo() {                          /*Constructor Vacio*/
        this("color",0.0);
    }

    public Circulo(String color, double radio) {              /*Constructor*/
        super (color);
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double getPerimetro(){
        return (2*3.1416*radio);      //Formula: L = 2*π*r
    }
    
    public double getDiametro(){
        return radio*2;                 //Formula: D = r*2
    }
    
    @Override
    public double getArea(){
        return (radio*radio*3.1416);  //Formula: A= r^2*π
    }
    
    public void printCirculo(){
        System.out.println("\t***** CIRCULO *****");
        System.out.println(" Color:     " + super.getColor());
        System.out.printf(" Perimetro: %.2f", this.getPerimetro());
        System.out.printf("\n Diametro:  %.2f", this.getDiametro());
        System.out.printf("\n Area:      %.2f \n", this.getArea());
    }
    
}
