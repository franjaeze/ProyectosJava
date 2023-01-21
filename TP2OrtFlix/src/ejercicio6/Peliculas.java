package ejercicio6;

public class Peliculas {
	private String titulo;
	private int anio;
	
	
	
	public Peliculas(String titulo, int anio) {
		super();
		
	//	this.titulo=titulo;
	//	this.anio=anio;
	this.setTitulo(titulo);
	this.setAnio(anio);
	}

	
	@Override
	public String toString() {
		return "Peliculas [titulo=" + titulo + ", anio=" + anio + "]";
	}


	public String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public int getAnio() {
		return anio;
	}



	private void setAnio(int anio) {
		this.anio = anio;
	}





}
