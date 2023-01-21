package tp1.tp4.ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

import tp1.tp4.tj3.LectorEnteros;
import tp1.tp4.tj3.RangoDeEnteros;

public class Ej2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//LectorEnteros lector = new LectorEnteros(input);
		 
		Alumno alu = null;
		int dni = 0, anioNacimiento = 0;
		String nombreCompleto;
		
		
		while (alu == null) {
			System.out.println("Ingrese el nombre completo del Alumno");
			nombreCompleto = input.nextLine();
		
			System.out.println("Ingrese el nombre anio de nacimiento");
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
		
		
//		public boolean agregarAlumno (int numeroLegajo, String nombreCompleto, int anioNacimiento) {
//			boolean resultad = false;
//			try {
//				Alumno p =  new Alumno (numeroLegajo,nombreCompleto, anioNacimiento );
//			} catch (IllegalArgumentException ex) {
//				System.out.println( " Algunos de los datos es invalido");
//			} 
//			 
//			 return resultad;
//			}
//			
			
		

	}
}