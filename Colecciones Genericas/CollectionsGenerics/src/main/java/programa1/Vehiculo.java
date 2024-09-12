
package programa1;

public class Vehiculo {
    String fabricante;
    String modelo;
    int precio;
    boolean gasolina;

    public Vehiculo(String fabricante, String modelo, int precio, boolean gasolina) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.gasolina = gasolina;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isGasolina() {
        return gasolina;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "fabricante=" + fabricante + ", modelo=" + modelo + ", precio=" + precio + ", gasolina=" + gasolina + '}';
    }
    
}
