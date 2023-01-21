package tp1.tp4.ej2;


import tp1.tp4.tj3.RangoDeEnteros;

public abstract class Persona {
	
	final RangoDeEnteros RANGO_ANIO_NACIMIENTO = new RangoDeEnteros(1900, 2019);
	final int VALOR_AUN_VIVE= -9999;
	private String nombreCompleto;
	private int anioNacimiento;
	private int anioFallecimiento;
	private int anioActual = 2022;
	
	public Persona (String nombreCompleto, int anioNacimiento ) {
		
		setNombreCompleto (nombreCompleto);
		setAnioNacimiento (anioNacimiento);

	
	}
	
public Persona (String nombreCompleto, int anioNacimiento, int anioFallecimiento ) {
	
		setNombreCompleto (nombreCompleto);
		setAnioNacimiento (anioNacimiento);
		setAnioFallecimiento(anioFallecimiento);
		
}

	public boolean vive () {
		boolean vivo = false;
		
		if (anioFallecimiento == 0) {
			vivo = true;
			
		}
		
		return vivo;
	}
	
	String getNombreCompleto() {
		return nombreCompleto;
	}

	private void setNombreCompleto(String nombreCompleto) {
		
		if (nombreCompleto.isEmpty()|| nombreCompleto == null) {
			throw new IllegalArgumentException("nombre invalido");
		} else {
		this.nombreCompleto = nombreCompleto;		
	} }
	

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	private void setAnioNacimiento(int anioNacimiento) {
		if (anioNacimiento < 1900 || anioNacimiento > anioActual ) {
			throw new IllegalArgumentException( "Anio invalido");
		}
		this.anioNacimiento = anioNacimiento;
	}
	
	public int getAnioFallecimiento() {
		return anioFallecimiento;
	}

	private void setAnioFallecimiento(int anioFallecimiento) {
		if (anioFallecimiento > anioActual) {
			throw new IllegalArgumentException( "anio invalido");
			
		} else {
		this.anioFallecimiento = anioFallecimiento;
	}}

	public int getAnioActual() {
		return anioActual;
	}

	void setAnioActual(int anioActual) {
		this.anioActual = anioActual;
	}

	@Override
	public String toString() {
		return "Persona  nombre completo= " + nombreCompleto + ", anioNacimiento="
				+ anioNacimiento + ", anioFallecimiento=" + anioFallecimiento + ", anioActual=" + anioActual + "]";
	}
	
	
	

}
