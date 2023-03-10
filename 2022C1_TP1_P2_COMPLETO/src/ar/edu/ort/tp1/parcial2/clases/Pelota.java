package ar.edu.ort.tp1.parcial2.clases;

public class Pelota extends Juguete {
	
	private static final String LA_SUPERFICIE_NO_PUEDE_SER_NULA = "La superficie no puede ser nula";
	private static final String MSG_PELOTA = "La pelota cuesta %.2f pesos, es del tipo %s ademas es de la marca %s y tiene un id %d\n";
	
	//TODO Completar
	private TipoDePelota tipo;
	//TODO Completar
	public Pelota(int id, String marca, TipoDePelota superficie, float precio) {
		super(id, marca, precio);
		this.setTipo(superficie);
	}

	//TODO Completar
	private void setTipo(TipoDePelota tipo) {
		if (tipo == null) {
			throw new IllegalArgumentException(LA_SUPERFICIE_NO_PUEDE_SER_NULA);
		}
		this.tipo = tipo;
	}
	//TODO Completar
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.printf(MSG_PELOTA, this.getPrecio(), this.tipo.getDescripcion(), this.getMarca(), this.getId());
	}
}
