package tp1.tp4.tj3;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		int nacimiento = 0;
		int fallecimiento = 0;
		Scanner input = new Scanner(System.in);
		// TODO implementar
		
		LectorEnteros lector = new LectorEnteros(input);
		
		lector.pedir("Ingrese un numero entero");
		
		/*public void calcular() {
			System.out.println("Ingrese el año de nacimiento y de fallecimiento de la persona ( o -1 si aun sigue viva");
			nacimiento = Integer.parseInt(input.nextLine());
			fallecimiento = Integer.parseInt(input.nextLine());
			
			
			
		}*/
		
		public boolean vive() {

			return nacimiento > fallecimiento;
		}
		
		input.close();
	}
}
