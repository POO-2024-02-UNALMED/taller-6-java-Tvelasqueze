package vehiculos;

public class Pais {
    private static Pais[] lista = { null };
    private String nombre;
    public int exportacion = 0;

    public Pais(String nombre) {
        this.nombre = nombre;
        if (lista[0] == null) {
            lista[0] = this;
        } else {
            int x = lista.length;
            Pais[] A = new Pais[x + 1];
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

    public String getNombre() {
        return nombre;
    }

    public static Pais paisMasVendedor() {
        Pais potencia = null;
        for (Pais pais : lista) {
            if (potencia != null) {
                if (pais.exportacion > potencia.exportacion) {
                    potencia = pais;
                }
            } else {
                potencia = lista[0];
            }
        }
        return potencia;
    }
}
