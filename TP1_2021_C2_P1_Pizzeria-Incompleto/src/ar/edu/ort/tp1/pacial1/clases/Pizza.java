package ar.edu.ort.tp1.pacial1.clases;

public abstract class Pizza implements Mostrable {

	private static final String MSG_GANANCIA_INVALIDA = "Ganancia inválida";
	private static final String MSG_COSTO_INVALIDO = "Costo inválido";
	private static final String MSG_NOMBRE_INVALIDO = "Nombre inválido";
	private String nombre;
	private float costoDeProduccion;
	private float porcentajeGanancia;

	public Pizza(String nombre, float costoDeProduccion, float porcentajeGanancia) {
		this.setNombre(nombre);
		this.setCostoDeProduccion(costoDeProduccion);
		this.setPorcentajeGanancia(porcentajeGanancia);
	}

	private void setNombre(String nombre) {
		if (nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException (MSG_NOMBRE_INVALIDO);
		}
		this.nombre = nombre;
		
	}

	private void setCostoDeProduccion(float costoDeProduccion) {
		if (costoDeProduccion <=0) {
			throw new IllegalArgumentException (MSG_COSTO_INVALIDO);
		}
		this.costoDeProduccion= costoDeProduccion;
	}
	

	private void setPorcentajeGanancia(float porcentajeGanancia) {
		if (porcentajeGanancia <0) {
			throw new IllegalArgumentException (MSG_GANANCIA_INVALIDA);
		}
		this.porcentajeGanancia= porcentajeGanancia;
	}
	public void mostrar () {
		System.out.printf(this.getClass().getSimpleName() + " - " + this.nombre + " - " + this.getPrecioDeVenta());
	}

	
	public abstract float getPrecioDeCosto();
	{}

	public float getPrecioDeVenta() {

		
	return this.costoDeProduccion *  (1 * this.porcentajeGanancia) ;
	}

	protected float getCostoProduccion () {
		return this.costoDeProduccion;
	}
	
	protected String getNombre () {
		 return this.nombre;
	}

	public boolean modeloCorrecto(String modelo) {
	
		return modelo == this.nombre;
	}
	
}
