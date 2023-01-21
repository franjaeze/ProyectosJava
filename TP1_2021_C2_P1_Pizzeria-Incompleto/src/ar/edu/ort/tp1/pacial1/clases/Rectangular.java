package ar.edu.ort.tp1.pacial1.clases;

public class Rectangular extends Pizza {

	private static final String MSG_RECTANGULAR = "%-12s - %-15s - Precio de Venta: $%8.2f - %d porciones - %s\n";
	private static final float PRECIO_POR_PORCION = 45f;
	private AdicionalQueso adicionalQueso;
	//TODO A completar
	private long largo;
	private long ancho;

	//TODO A completar
	public Rectangular(String nombre, float costoBase, float porcentajeGanancia, long largo, long ancho, AdicionalQueso adicionalQueso) {
		super(nombre, costoBase, porcentajeGanancia);
		this.adicionalQueso = adicionalQueso;
		this.largo = largo;
		this.ancho = ancho;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println( this.ancho * this.largo + " porciones - "+ this.adicionalQueso ); 
			
	}

	@Override
	public float getPrecioDeCosto() {
		// TODO Auto-generated method stub
		return getCostoProduccion() + (this.ancho * this.largo * PRECIO_POR_PORCION) * this.adicionalQueso.getMultiplicadorQueso();
	}
 
	//TODO A completar
	// Costo de produccion + Precio de las porciones (ancho y largo) y todo eso 
	//	se multiplica por el adicional del queso.
	//
}
