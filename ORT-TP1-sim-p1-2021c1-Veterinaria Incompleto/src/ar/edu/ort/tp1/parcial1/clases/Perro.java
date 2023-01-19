package ar.edu.ort.tp1.parcial1.clases;

public class Perro extends Mascota {
	private static final double MULT_ALIMENTACION = 0.05;
	private static final double PORC_DESC_PESO = -3;

	public Perro (String nombre, double peso, boolean vacuna, Estado estado) {
		super(nombre, peso, vacuna, estado);
	}

	@Override
	public void comer(double comida) {
		System.out.println(this.getNombre());
		super.comer(comida, MULT_ALIMENTACION);
		

		
	}

	@Override
	public void defecar() {
		// TODO Auto-generated method stub
		
	}
}
