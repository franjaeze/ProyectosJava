package ar.edu.ort.tp1.parcial1.clases;

public class Conejo extends Mascota {
	private static final double MULT_ALIMENTACION = 0.022;
	private static final double PORC_DESC_PESO = -2;

	//TODO Completar

	public Conejo (String nombre, double peso, boolean vacuna, Estado estado) {
		super(nombre, peso, vacuna, estado);
	}

	@Override
	public void comer(double comida) {
		System.out.println(this.getNombre());
		super.comer(comida, MULT_ALIMENTACION);		
	}

	@Override
	public void defecar() {
		System.out.println(this.getNombre());
		this.actualizarPeso(PORC_DESC_PESO);
		
	}
}
