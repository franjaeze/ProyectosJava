package ejercicio6;

import java.util.ArrayList;

public class Clientes {
	
 private int dni;
 private String nombre;
 private double deudaAPagar;
 private ArrayList <Peliculas> historial;// = new ArrayList<>();
 private tipoDeClienteEnum standarOpremium;
 
 
 
 
 public Clientes(int dni, tipoDeClienteEnum standarOpremium) {

	this.dni= dni;
	this.standarOpremium = standarOpremium;
	deudaAPagar = 0;
	this.historial= new ArrayList<Peliculas>();
	
}
 
 public void mostrarHistorial() {
	 for (Peliculas e : historial) {
		 System.out.println(e);
		
	}
 }
 
@Override
public String toString() {
	return "Clientes [dni=" + dni +  ", deudaAPagar=" + deudaAPagar + ", standarOpremium="
			+ standarOpremium + "]";
}

public int getDni() {
	return dni;
}

public double getDeudaAPagar() {
	return deudaAPagar;
}
private void setDni(int dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
private void setNombre(String nombre) {
	this.nombre = nombre;
}
private tipoDeClienteEnum getstandarOpremium() {
	return standarOpremium;
}
private void setstandarOpremium(tipoDeClienteEnum standarOpremium) {
	this.standarOpremium = standarOpremium;
}
public boolean esDeudor() {
	return deudaAPagar>0;
}
public tipoDeClienteEnum getStandarOpremium() {
	return standarOpremium;
}

private void setStandarOpremium(tipoDeClienteEnum standarOpremium) {
	this.standarOpremium = standarOpremium;
}

private void setDeudaAPagar(double saldoAPagar) {
	this.deudaAPagar = deudaAPagar;
}

public ArrayList<Peliculas> getHistorial() {
	return historial;
}

private void setHistorial(ArrayList<Peliculas> historial) {
	this.historial = historial;
}

 
 
 
 
 
 
}
