package ejercicio6;

public class Test {
public static void main(String[] args) {
	
	 OrtFlix admin = new OrtFlix();
	 
	
	 admin.agregarPelicula("Terminator", 1983);
	 admin.agregarPelicula("Gladiador", 2000);
	 admin.agregarPelicula("Liar Liar", 1999);
	 admin.agregarPelicula("Ace Ventura 1", 1987);
	 admin.agregarPelicula("The Batman", 2022);
	 
	 admin.mostrarCatalogo();
	 
	 admin.darDeAlta(34975922, tipoDeClienteEnum.STANDAR);
	 admin.darDeAlta(11352424, tipoDeClienteEnum.PREMIUM);
	 
	 
//	 System.out.println(admin.buscarCliente(34975922));
	 admin.verPelicula(34975922, "Terminator");
	 admin.verPelicula(34975922, "Gladiador");
	 admin.verPelicula(34975922, "The Batman");	
	 
	 admin.buscarCliente(34975922).mostrarHistorial();
	
	
	
}
}
