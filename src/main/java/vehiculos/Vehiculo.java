package vehiculos;

import java.util.*;

public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected float precio;
    protected float peso;
    protected String traccion;
    protected Fabricante fabricante;
    private static int CantidadVehiculos;
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, float precio, float peso,
            String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Vehiculo.CantidadVehiculos += 1;
        vehiculos.add(this);
    }

    public Vehiculo(String placa, String nombre, float precio, float peso, Fabricante fabricante) {
        this.placa = placa;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        Vehiculo.CantidadVehiculos += 1;
        vehiculos.add(this);
    }

    public Vehiculo(String placa, int puerta, String nombre, float precio, float peso, Fabricante fabricante) {
        this.placa = placa;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        Vehiculo.CantidadVehiculos += 1;
        this.puertas = puerta;
        vehiculos.add(this);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }

    public String vehiculosPorTipo() {
        return "Automoviles:: " + String.valueOf(Automovil.cantidadAutomovil) + "\n" +
                "Camionetas: " + String.valueOf(Camioneta.cantidadCamionetas) + "\n" +
                "Camiones: " + String.valueOf(Camion.cantidadCamion);
    }

}