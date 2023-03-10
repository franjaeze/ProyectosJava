package ar.edu.ort.tp1.parcial2.clases;

public abstract class Juguete implements Mostrable {
	private static final String MSG_MARCA_INVALIDA = "La marca no puede ser nula ni vacia";
	private static final String MSG_ID_INVALIDO = "El id no puede ser menor a 1";
	//TODO Completar
	private int id;
	private String marca;
	private float precio;

	//TODO Completar
	/**
	 * Constructor
	 * 
	 * @param id    debe ser mayor o igual a 1
	 * @param marca no ser nulo ni vacio.
	 */
	public Juguete(int id, String marca, float precio) {
		this.setId(id);
		this.setMarca(marca);
		this.setPrecio(precio);
	}

	private void setPrecio(float precio) {
		if (precio < 1) {
			throw new IllegalArgumentException(MSG_ID_INVALIDO);
		}
		this.precio = precio;
	}

	//TODO Completar
	private void setId(int id) {
		if (id < 1) {
			throw new IllegalArgumentException(MSG_ID_INVALIDO);
		}
		this.id = id;
	}
	//TODO Completar
	private void setMarca(String marca) {
		if (marca == null || marca.isEmpty()) {
			throw new IllegalArgumentException(MSG_MARCA_INVALIDA);
		}
		this.marca = marca;
	}



	public boolean coincideId(int id) {
		return this.id == id;
	}

	public int getId() {
		return id;
	}

	protected String getMarca() {
		return marca;
	}

	protected float getPrecio() {
		return precio;
	}

}