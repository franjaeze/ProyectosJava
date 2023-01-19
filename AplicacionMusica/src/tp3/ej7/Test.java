package tp3.ej7;

public class Test {
public static void main(String[] args) {
	
	MusicApp app = new MusicApp();
	
	app.altaUsuario("fvwear@hotmail.com","Veron", 33, TiposUsuariosEnum.GRATUTIO);
	app.altaUsuario("jeversd@hotmai.com","Gomez", 33, TiposUsuariosEnum.PREMIUM);
	app.altaUsuario("suass2@hotmai.com","Rocco", 33, TiposUsuariosEnum.REGISTRADO);
	
	System.out.println(app.altaCancion("Yonaguni", "Bad Bunny", GeneroEnum.REGUETTON));
	System.out.println(app.altaCancion("Oasis", "Wonderwall", GeneroEnum.ROCK));
	System.out.println(app.altaCancion("Drexler", "Sea", GeneroEnum.POP));

	System.out.println(app.altaCancion("Oasis", "Wonderwall", GeneroEnum.ROCK));
	System.out.println(app.altaUsuario("suass2@hotmai.com","Rocco", 33, TiposUsuariosEnum.REGISTRADO));
		
	System.out.println(app.escucharCancion("xoluser@gmail.com", "Wonderwall", "Oasis"));

	System.out.println(app.escucharCancion("fvwear@hotmail.com",  "Oasis", "Wonderwall"));
	
	System.out.println(app.escucharCancion("suass2@hotmai.com",  "Oasis", "Wonderwall"));
	
	System.out.println(app.escucharCancion("jeversd@hotmai.com",  "Oasis", "Wonderwall"));
	System.out.println(app.escucharCancion("jeversd@hotmai.com",  "Yonaguni", "Bad Bunny"));
	System.out.println(app.escucharCancion("jeversd@hotmai.com",  "Drexler", "Sea"));
	
	app.listarCancionesPorUsuario("jeversd@hotmai.com");
	app.listarUsuarios();
	
	

}
}
