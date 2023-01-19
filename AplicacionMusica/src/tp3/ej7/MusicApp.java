package tp3.ej7;

import java.util.ArrayList;

public class MusicApp {

	private ArrayList<Usuario> user = new ArrayList<>();
	private ArrayList<Canciones> songs = new ArrayList<>();
	private escuchaCancionEnum escucha;

	public boolean altaCancion(String titulo, String autor, GeneroEnum genero) {
		boolean respuesta = false;
		
		if(buscarCancion(titulo, autor)== null) {
		songs.add(new Canciones(titulo, autor, genero));
		respuesta = true;
		} else {
			}
			
		return respuesta;	
	};

	public boolean altaUsuario(String email, String apellido, int edad, TiposUsuariosEnum tipo) {
		boolean respuesta = false;
		
		if(buscarUsuario(email)== null) {
			user.add(new Usuario(email, apellido, edad, tipo));
		respuesta = true;
		} else {
			}
			
		return respuesta;	
		

	};

	public Canciones buscarCancion(String titulo, String autor) {
		Canciones cancionEncontrada = null;
		int i = 0;
		while (i < songs.size() && cancionEncontrada == null) {
			Canciones songs = this.songs.get(i);
			if (songs.getTitulo() == titulo && songs.getAutor() == autor) {
				cancionEncontrada = this.songs.get(i);
				return cancionEncontrada;

			} else {
				i++;
			}
		}
 		return cancionEncontrada;

	}
	public Usuario buscarUsuario(String email) {
		Usuario usuarioEncontrada = null;
		int i = 0;
		while ( i <user.size()  && usuarioEncontrada == null) {
			Usuario user = this.user.get(i);
			if (user.getEmail() == email) {
				usuarioEncontrada = this.user.get(i);
				return usuarioEncontrada;

			} else {
				i++;
			}
		}
		return usuarioEncontrada;

	}
	
	public escuchaCancionEnum escucharCancion(String email, String titulo, String autor) {
		Usuario user = buscarUsuario(email);
		Canciones cancion = buscarCancion (titulo, autor);
		
		if (user == null) {
			return escuchaCancionEnum.USUARIO_INEXISTENTE;
		} else if (cancion== null) {
			return escuchaCancionEnum.CANCION_INEXISTENTE;
		} else if (user.getTiposUsuario() == TiposUsuariosEnum.GRATUTIO && user.getLimiteDiario()==50) {
			return escuchaCancionEnum.LIMITE_ALCANZADO;
		} else if (cancion.cancionPremium() && user.getTiposUsuario() !=TiposUsuariosEnum.PREMIUM) {
			return escuchaCancionEnum.CANCION_NO_DISPONIBLE;
			
		} else {
			user.agregarAlHistorial(buscarCancion(titulo, autor));
			user.sumarEscucha();
			cancion.agregarEsucha();
			return escuchaCancionEnum.CANCION_ESCUCHADA;
		}
		
	}
	
	public void listarUsuarios() {
		for (Usuario u : user) {
			System.out.println(u.toString());
			;
			
		}
	}
	
	public void listarCancionesPorUsuario(String email) {
		Usuario user = buscarUsuario(email);
		if (user==null) {
			System.out.println("Usuario inexistente");
		} else {
			user.listarHistoria();
			
			
		}
		
	}
	

}
