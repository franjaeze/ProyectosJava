package ejercicio6;

import java.util.ArrayList;

public class OrtFlix {

	private ArrayList<Peliculas> pelicula; //= new ArrayList();
	private ArrayList<Clientes> cliente; //= new ArrayList();
	private ArrayList<Clientes> listaNegra;
	private altaDeClientesEnum alta;
	

	
	public OrtFlix() {			//////OJO NO ES PUBLIC VOID!!!!
		
		this.pelicula = new ArrayList<Peliculas> (); /// AQUI VAN DIAMANTES DE NUEVO 
		this.cliente= new ArrayList<Clientes>();
		this.listaNegra= new ArrayList<Clientes>();
	}
	
	public void agregarPelicula (String titulo, int anio) {
		pelicula.add(new Peliculas (titulo, anio));
	}
	
	public void mostrarCatalogo () {
		for (Peliculas c : pelicula) {
			System.out.println(c);
		}
	}
	
	
	
	public boolean existeCliente(int dni) {
		Clientes clienteEncontrado = null;
		int i = 0;
		while (i < cliente.size() || clienteEncontrado != null) {
			Clientes cliente = this.cliente.get(i);
			if (cliente.getDni() == dni) {
				return true;
			} else {
			}
			;

			i++;
		}
		return false;

	}
	
	public Clientes buscarCliente(int dni) {
		Clientes clienteEncontrado = null;
		int i = 0;
		while (i < cliente.size() || clienteEncontrado != null) {
			Clientes cliente = this.cliente.get(i);
			if (cliente.getDni() == dni) {
				clienteEncontrado = this.cliente.get(i);
				return clienteEncontrado;
			} else {
			}
			;

			i++;
		}
		return clienteEncontrado;

	}
	public int buscarPosicionCliente(int dni) {
		Clientes clienteEncontrado = null;
		int i = 0;
		while (i < cliente.size() || clienteEncontrado != null) {
			Clientes cliente = this.cliente.get(i);
			if (cliente.getDni() == dni) {
				clienteEncontrado = this.cliente.get(i);
				return i;
			} else {
			}
			;

			i++;
		}
		return -1;

	}
	

	public boolean encontrarPelicula(String peli) {
		Peliculas peliculaEncontrada = null;
		int j = 0;
		while (j < pelicula.size() && peliculaEncontrada == null) {
			Peliculas pelicula1 = this.pelicula.get(j);
			if (pelicula1.getTitulo() == peli) {
				return true;
			}
			j++;

		}
		return false;
	}
	
	public Peliculas retornarPelicula(String peli) {
		Peliculas peliculaEncontrada = null;
		int j = 0;
		while (j < pelicula.size() || peliculaEncontrada != null) {
			Peliculas pelicula1 = this.pelicula.get(j);
			if (pelicula1.getTitulo() == peli) {
				peliculaEncontrada = this.pelicula.get(j);
				return peliculaEncontrada;
			}
			j++;

		}
		return peliculaEncontrada;
	}

	public void verPelicula(int dni, String peli) {
		if (!existeCliente(dni)) {

			System.out.println(verPeliculasRespuestaEnum.CLIENTE_INEXISTENTE);

		} else if (! encontrarPelicula(peli)){
			System.out.println(verPeliculasRespuestaEnum.CONTENIDO_INEXISTENTE);


		} else if(buscarCliente(dni).esDeudor())  {
			System.out.println(verPeliculasRespuestaEnum.CLIENTE_DEUDOR);
		} else if (buscarCliente(dni).getStandarOpremium()== tipoDeClienteEnum.STANDAR &&
					retornarPelicula(peli).getAnio()== 2022) {
			System.out.println(verPeliculasRespuestaEnum.CONTENIDO_NO_DISPONIBLE);

		} else {
			buscarCliente (dni).getHistorial().add(retornarPelicula(peli));// puede reemplazarse x un metodo agregarAlHistorial() en clientesd
			System.out.println(verPeliculasRespuestaEnum.OK);

			
		}
	}

	

	public void darDeAlta(int dni, tipoDeClienteEnum tipo) {

		Clientes clienteEncontrado = null;
		int i = 0;
		while (i < cliente.size() && clienteEncontrado == null) {
			Clientes cliente = this.cliente.get(i);
			if (cliente.getDni() == dni) {
				clienteEncontrado = cliente;
			}

			i++;
		}
		if (clienteEncontrado != null) {
			System.out.println(altaDeClientesEnum.CLIENTE_EXISTENTE);
		} else {
			Clientes p = new Clientes(dni, tipo);
			cliente.add(p);
		}
	}
	
	public void darDeBaja(int dni ) {
	//	buscarCliente(dni). 
		
	}
	
	public void depurarListaNegra(double importe) {
		Clientes cliente;
		int i = 0;
		while (i < listaNegra.size()) {
			cliente = listaNegra.get(i);
			if (cliente.getDeudaAPagar() <= importe) {
				listaNegra.remove(cliente);
			} else {
				i++;
			}
		}
	}

}
