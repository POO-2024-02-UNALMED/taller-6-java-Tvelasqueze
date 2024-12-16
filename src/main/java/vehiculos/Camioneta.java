package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;
    public static int cantidadCamionetas;

    public Camioneta(String placa, int puerta, String nombre, float precio, float peso, Fabricante fabricante,
            boolean ok) {
        super(placa, puerta, nombre, precio, peso, fabricante);
        this.volco = ok;
        super.setTraccion("4X4");
        super.setVelocidadMaxima(90);
        Camioneta.cantidadCamionetas += 1;
    }

    public boolean isVolco() {
        return volco;

    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

}