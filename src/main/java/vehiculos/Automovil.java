package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos;
	public static int cantidadAutomovil;
	public Automovil(String placa, String nombre , float precio , float peso, Fabricante fabricante , int puesto ) {
		super(placa, nombre , precio, peso,  fabricante);
		this.puestos=puesto;
		super.setTraccion("FWD");
		super.setVelocidadMaxima(100);
		super.setPuertas(4);
		Automovil.cantidadAutomovil+=1;
		
	}
	public void setPuestos(int np) {
		this.puestos=np;
		
	}
	public int getPuestos() {
		return this.puestos;
	}

}