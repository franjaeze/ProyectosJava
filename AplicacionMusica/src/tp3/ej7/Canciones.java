package tp3.ej7;

public class Canciones {
	
private String titulo;
private String	autor;
private int diasPublicada;
private int cantidadEscuchada;
private GeneroEnum genero;




public boolean cancionPremium () {
	if (diasPublicada > 7 || cantidadEscuchada <1000 ) {
		return true;
	} return false;
	
}

public void agregarEsucha() {
	cantidadEscuchada++;
}




public Canciones(String titulo, String autor, GeneroEnum genero) {
	super();
	this.titulo = titulo;
	this.autor = autor;
	this.genero = genero;
	cantidadEscuchada = 0;
	diasPublicada = 0;
}
@Override
public String toString() {
	return "Canciones [titulo=" + titulo + ", autor=" + autor + ", diasPublicada=" + diasPublicada
			+ ", cantidadEscuchada=" + cantidadEscuchada + "]";
}
public String getTitulo() {
	return titulo;
}
private void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
private void setAutor(String autor) {
	this.autor = autor;
}
public int getDiasPublicada() {
	return diasPublicada;
}
private void setDiasPublicada(int diasPublicada) {
	this.diasPublicada = diasPublicada;
}
public int getCantidadEscuchada() {
	return cantidadEscuchada;
}
private void setCantidadEscuchada(int cantidadEscuchada) {
	this.cantidadEscuchada = cantidadEscuchada;
}
public GeneroEnum getGenero() {
	return genero;
}
private void setGenero(GeneroEnum genero) {
	this.genero = genero;
}


	
	
}
