package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;
    public static int cantidadCamion;

    public Camion(String placa, String nombre, float precio, float peso, Fabricante fabricante, int eje) {
        super(placa, nombre, precio, peso, fabricante);
        super.setPuertas(2);
        super.setVelocidadMaxima(80);
        super.setTraccion("4X2");
        this.ejes = eje;
        Camion.cantidadCamion += 1;

    }

    public void setEjes(int eje) {
        this.ejes = eje;
    }

    public int getEjes() {
        return this.ejes;
    }

}