package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";
	// TODO A completar
	private ArrayList<Mascota> mascotas;
	private String nombre;
	private Doctor doctor;

	public Veterinaria(String nombre, Doctor doctor) {
		this.nombre = nombre;
		this.doctor = doctor;
		this.mascotas = new ArrayList<>();
	}

	public void admitirMascota(Mascota mascota) {
	this.mascotas.add(mascota); 
	System.out.printf(TXT_INGRESO,  mascota.getNombre());
	}

	public Mascota buscarMascota(String nombreDeMascota) {
	int indice =0;
	Mascota encontrada = null;
	while (encontrada == null && indice < mascotas.size()) {
		if (mascotas.get(indice).getNombre().equals(nombreDeMascota)) {
			encontrada= mascotas.get(indice);
			
		} else {
				indice ++;}
	} return encontrada;
	}

	public void vacunar() {
		// TODO A completar
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

}
