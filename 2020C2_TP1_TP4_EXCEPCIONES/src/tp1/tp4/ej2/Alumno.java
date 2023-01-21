package tp1.tp4.ej2;

import tp1.tp4.tj3.RangoDeEnteros;

public class Alumno extends Persona {

	private int numeroLegajo;
	final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
	
	public Alumno(String nombreCompleto, int anioNacimiento, int numeroLegajo) {
		
		super(nombreCompleto, anioNacimiento);
		setNumeroLegajo(  numeroLegajo);
		}

	int getNumeroLegajo() {
		return numeroLegajo;
	}

	void setNumeroLegajo(int numeroLegajo) {
		if (!RANGO_NRO_DOCUMENTO.incluye(numeroLegajo)) {
		this.numeroLegajo = numeroLegajo;
	} else {
		throw new IllegalArgumentException ("fuera de rango");
			
		}
	}
	
	 ;
	
			
//	
//	
//	
//	
//	public void setNumeroLegajo (int numeroLegajo) {
//		if ( RANGO_ANIO_NACIMIENTO.incluye(numerolegajo) )
//		
//		
//	}
	}


