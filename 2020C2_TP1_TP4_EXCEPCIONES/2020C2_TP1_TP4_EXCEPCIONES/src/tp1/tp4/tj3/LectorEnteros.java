package tp1.tp4.tj3;

import java.util.Scanner;

public class LectorEnteros {
	private static final String MENSAJE_ERROR_SCANNER_NULL = "Debe recibirse un Scanner.";
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";

	private Scanner scanner;

	private int cargar(String mensaje) {
		System.out.println(mensaje);
		return Integer.parseInt(scanner.nextLine());
	}
	public LectorEnteros(Scanner scanner) {
		if (scanner == null) {
			throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
		}
		this.scanner = scanner;
	}

	public int pedir(String mensaje) {
		int numero = 0;
		boolean ingreso = false;
		
		while (!ingreso) {
			try {
				System.out.println(mensaje);
				numero = Integer.parseInt(this.scanner.nextLine());
				ingreso = true;
			} catch (NumberFormatException e) {
				System.out.println("Debe ingresar un numero correcto");
			}
		}
	
		return numero;
	}

	public int pedir(String mensaje, int limiteA, int limiteB){
		System.out.println(MENSAJE_CARGA_ENTERO + " entre " + limiteA + " y " + limiteB);
		int numero = pedir(mensaje);

		if (numero < limiteA || numero > limiteB) {
			throw new IllegalArgumentException(MENSAJE_FUERA_DE_RANGO);
		}
		return numero;
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido){
		
		return this.pedir(mensaje, rangoValido.getLimiteInferior(), rangoValido.getLimiteSuperior());
	}
}
