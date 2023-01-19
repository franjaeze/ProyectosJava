package tp3.ej7;

import java.util.ArrayList;


public class Usuario {
private String email;
private String apellido;
private int edad;
private TiposUsuariosEnum tipo;
private ArrayList <Canciones> historial = new ArrayList<>();
private int limiteDiario;
private int cantidadEscuchada;















public Usuario(String email, String apellido, int edad,TiposUsuariosEnum tipo) {
	super();
	this.email = email;
	this.apellido = apellido;
	this.edad = edad;
	this.tipo=tipo;
	cantidadEscuchada = 0;
	if (tipo == TiposUsuariosEnum.GRATUTIO) {
		limiteDiario = 0;
	}
	
	
}
@Override
public String toString() {
	return "Usuario [email=" + email + ", apellido=" + apellido + ", edad=" + edad + ", Cantidad Escuchada= " + cantidadEscuchada + "]";
}
public String getEmail() {
	return email;
}
public void listarHistoria() {
	for (Canciones canciones : historial) 
		System.out.println(canciones);
		
	}
public void sumarEscucha() {
	cantidadEscuchada+=1;
}

private void setEmail(String email) {
	this.email = email;
}
public String getApellido() {
	return apellido;
}
private void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getEdad() {
	return edad;
}
private void setEdad(int edad) {
	this.edad = edad;
}


public void agregarAlHistorial(Canciones cancion ) {
	historial.add(cancion);
	
	
}
private void setHistorial(ArrayList<Canciones> historial) {
	this.historial = historial;
}

public Enum getTiposUsuario (){
	
	 return tipo;
}

public int getLimiteDiario() {
	return limiteDiario;
}






}
