package ar.edu.ort.tp1.parcial2.clases;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class Estante implements ContenedorInteligente<Juguete, Integer> {

	//TODO Completar
	private Pila<Juguete> ubicaciones;
	private int cantidadAlojados;
	private int profundidadEstanteria;

	public Estante(int profundidadEstanteria) {
		this.profundidadEstanteria = profundidadEstanteria;
		this.ubicaciones = new PilaNodos<>();
	}

	/**
	 * Agrega un elemento al estante siempre y cuando haya lugar, sino, debera emitir la excepcion que corresponda..
	 */
	@Override
	public void guardar(Juguete juguete) throws RuntimeException {

		if (profundidadEstanteria == cantidadAlojados) {
			throw new RuntimeException("No se puede agregar mas juguetes a este estante.");
		}
		ubicaciones.push(juguete);
		cantidadAlojados++;
	}

	/**
	 * Retira el juguete de la estanteria por su id
	 */
	@Override
	public Juguete retirarPorId(Integer id) {
		Juguete retorno = null;
		Pila<Juguete> aux = new PilaNodos<>();
		while (retorno == null && !this.ubicaciones.isEmpty()) {
			Juguete jugueteAuxiliar = ubicaciones.pop();
			if (jugueteAuxiliar.coincideId(id)) {
				retorno = jugueteAuxiliar;
			} else {
				aux.push(jugueteAuxiliar);
			}
		}

		while (!aux.isEmpty()) {
			ubicaciones.push(aux.pop());
		}

		return retorno;
	}

}
