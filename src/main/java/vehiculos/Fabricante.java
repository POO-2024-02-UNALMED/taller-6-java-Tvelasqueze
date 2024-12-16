package vehiculos;

public class Fabricante {
    private static Fabricante[] lista = { null };
    private String nombre;
    private Pais pais;
    private int ventas = 0;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        if (lista[0] == null) {
            lista[0] = this;
        } else {
            int x = lista.length;
            Fabricante[] A = new Fabricante[x + 1];
            for (int i = 0; i < lista.length; i++) {
                A[i] = lista[i];
            }
            A[x] = this;
            lista = A;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void venta() {
        ventas++;
        pais.exportacion++;
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante potencia = null;
        for (Fabricante fabrica : lista) {
            if (potencia != null) {
                if (fabrica.ventas > potencia.ventas) {
                    potencia = fabrica;
                }
            } else {
                potencia = lista[0];
            }
        }
        return potencia;
    }
}
