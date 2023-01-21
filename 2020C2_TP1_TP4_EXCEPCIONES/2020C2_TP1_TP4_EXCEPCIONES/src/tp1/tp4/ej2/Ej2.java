package tp1.tp4.ej2;

import java.util.Scanner;

import tp1.tp4.tj3.LectorEnteros;
import tp1.tp4.tj3.RangoDeEnteros;

public class Ej2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LectorEnteros lector = new LectorEnteros(input);
		final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
		final RangoDeEnteros RANGO_ANIO_NACIMIENTO = new RangoDeEnteros(1900, 2019);
		Alumno alu = null;
		int dni = 0, anioNacimiento = 0;
		String nombreCompleto;

		while (alu == null) {
			System.out.println("Ingrese el nombre completo del Alumno");
			nombreCompleto = input.nextLine();
		
			System.out.println("Ingrese el anio de nacimiento");
			anioNacimiento= input.nextInt(); 
			input.nextLine();
			System.out.println("Ingrese el numero de documento");
			dni = input.nextInt();
			
			try {
			alu = new Alumno (nombreCompleto, anioNacimiento, dni);
			} catch (IllegalArgumentException ex) {
				System.out.println(" Alguno de los datos es invalido, intente nuevamente");
				
			}
		}
		
		input.close();
		System.out.println(alu.toString());

		if (alu.vive()) {
			System.out.println("La persona vive");
		} else {
			System.out.println("La persona no vive");
		}

	}
}