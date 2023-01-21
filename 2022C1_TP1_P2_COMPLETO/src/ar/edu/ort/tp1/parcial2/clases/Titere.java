package ar.edu.ort.tp1.parcial2.clases;

public class Titere extends Juguete {

	private static final String MSG_TAMANIO_INVALIDO = "Tamanio de titere invalido.";
	private static final String MSG_TITERE =
			"La titere cuesta %.2f tiene un tamanio de %d cm es de la marca %s y tiene un id %d\n";
	
	//TODO Completar
	private static final int TAMANIO_MINIMO = 30;
	private static final int TAMANIO_MAXIMO = 70;
	private int tamanio;

	//TODO Completar
	public Titere(int id, String marca, int tamanioAro, float precio) {
		super(id, marca, precio);
		this.setTamanio(tamanioAro);
	}

	//TODO Completar
	private void setTamanio(int tamanio) {
		if (tamanio < TAMANIO_MINIMO || tamanio > TAMANIO_MAXIMO) {
			throw new IllegalArgumentException(MSG_TAMANIO_INVALIDO);
		}
		this.tamanio = tamanio;
	}

	//TODO Completar
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.printf(MSG_TITERE, this.getPrecio(), this.tamanio, this.getMarca(), this.getId());
	}
}
