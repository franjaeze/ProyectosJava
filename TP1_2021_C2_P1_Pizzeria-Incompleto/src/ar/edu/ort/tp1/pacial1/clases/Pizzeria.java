package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class Pizzeria implements Mostrable {

	private static final String MSG_TOTALES = "La venta total fue: $%8.2f\n";
	private static final String MSG_CANTIDADES = "Se han fabricado: %d Tradicionales, %d Especiales y %d Rectangulares\n";
	private static final String MSG_FABRICANDO = "Fabricando la Pizza: ";
	//TODO A completar
	private String nombre;
	private ArrayList <Pizza> pizzas = new ArrayList(); 
	

	public Pizzeria (String nombre) {
		this.nombre = nombre;
		this.pizzas = new ArrayList<>();
		
	}
	
	public boolean fabricar(Pizza m) {
		System.out.printf(MSG_FABRICANDO);
		boolean sePudo = false;
		if (m !=null) {
			this.pizzas.add(m);
			sePudo = true;
			m.mostrar();
			
		}
		return sePudo;
	}


	/**
	 * Retorna la sumatoria de los precios de Venta de nombre de la pizza enviado por parametro. 
	 * @param nombre
	 * @return
	 */
	public float sumatoriaDePizzas(String nombre) {
		float total = 0;
		for (Pizza pizza : pizzas) {
			if ( pizza.getNombre().equals(nombre)) {
				total += pizza.getPrecioDeVenta(); 
			}
			
		}
		return total;
	}
	
	/**
	 * 	Retorna la cantidad de pizzas vendidas con el precio de venta entre los parametros enviados.
	 * 	Los valores enviados son inclusivos.
	 * @param precioInferior
	 * @param precioSuperior
	 * @return
	 */
	
	public int vendidasConPrecioEntre(float precioInferior, float precioSuperior) {
		//TODO A completar
		int 	cantidad = 0;
		for (Pizza pizza : pizzas) {
			if (pizza.getPrecioDeVenta() > precioInferior && pizza.getPrecioDeVenta() <= precioSuperior)
			{
				cantidad ++;
			}
			
		}
		
		
		
		
		
		return cantidad;
	}
	
	/**
	 * Retorna el precio de venta de la primer pizza enviada por parametro.
	 * En caso de no encontrarse retorna 0.
	 * @param nombre
	 * @return
	 */
	public float precioVentaDeLaPrimerPizza(String nombre) {
		int indice = 0 ;
		 float precio= 0;
		
		 while (precio == 0 && pizzas.size()< indice)
		 {
			 if (pizzas.get(indice).getNombre().equals(nombre)) {
				 precio = pizzas.get(indice).getPrecioDeVenta();
			 }
			 indice ++;
		 }
			 
		return precio;
	}


	@Override
	public void mostrar() {
		
		System.out.println( " Pizzeria " + this.nombre);
		int sumaRectangular = 0;
		int sumaEspecial = 0;
		int sumaTradicional = 0;
		for (Pizza pizza : pizzas) {
			if (pizza instanceof Rectangular) {
				sumaRectangular ++;
				
			} else if (pizza instanceof Especial) {
				sumaEspecial ++;
			} else {
				sumaTradicional++;
			}
			
		}
		
		float precioVentaTotal = 0;
		for (Pizza pizza : pizzas) {
			precioVentaTotal += pizza.getPrecioDeVenta();
			
		}
		System.out.println(this.getClass().getCanonicalName() + ": " + this.nombre);
		System.out.printf(MSG_CANTIDADES, sumaTradicional, sumaEspecial, sumaRectangular );
		System.out.printf(MSG_TOTALES, precioVentaTotal);
	}
}
