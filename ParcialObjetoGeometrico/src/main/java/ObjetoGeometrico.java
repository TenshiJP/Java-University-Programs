/*  *****   PARCIAL I *****
 *  Nombre:     Angel Roberto Jacinto Payes
 *  Carnet:     5990-20-1756
 *  Sección:    "A"
 */
public abstract class ObjetoGeometrico {
    private String color;//Variables
    
    public ObjetoGeometrico(){                  /*Constructor Vacio*/
        this("color");
    }

    public ObjetoGeometrico(String color) {     /*Constructor*/
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract double getPerimetro();//Metodo abstracto perimetro.
    public abstract double getArea();//Metodo abstracto area.

    @Override
    public String toString() {
        return "ObjetoGeometrico {" + "color = " + color + '}';
    }
    
}
