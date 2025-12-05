package arrays001;

import java.util.Scanner;

public class Aplicacion {

	public Aplicacion() {
		int opcion = -1;
		
		int array[]= {23,4,6,2};
		Ejemplos.meterNumeroEnteroArrayOrdenado2(array, 1);
			do {
			Scanner s = new Scanner(System.in);
			System.out.println("Escoge una opción:");
			System.out.println("1) Generar cien números aleatorios.");
			System.out.println("2) Imprimir array predefinido.");
			System.out.println("3) Imprimir lista de personas.");
			System.out.println("4) Imprimir array de enteros aleatorios.");
			System.out.println("5) Imprimir array de personas indeterminadas.");
			System.out.println("6) Imprimir array de lotería.");
			System.out.println("7) Comprobar si el array esta ordenado ascendentemente.");
			System.out.println("8) Comprobar si el array esta ordenado descendentemente.");
			System.out.println("9) Ordenar ascendentemente un array.");
			System.out.println("10) Ordenar descendentemente un array.");
			System.out.println("0) Salir.");
			opcion = s.nextInt();
			switch (opcion) {
			case 0:
				System.out.println("Saliendo de la aplicación...");
				break;
			case 1:
				for(int i=0;i<100;i++)
					System.out.println(Ejemplos.generarNumeroAleatorio(3, 9));
				break;
			case 2:
				Ejemplos.imprimirArrayEnterosPredefinido();
				break;
			case 3:
				Ejemplos.imprimirArrayCuatroPersonas();
				break;
			case 4:
				Ejemplos.imprimirArrayEnterosAleatorios(10);
				break;
			case 5:
				Ejemplos.imprimirArrayPersonasIndeterminadas(3);
				break;
			case 6:
				Ejemplos.imprimirApuestaLoteria();
				break;
			case 7:
				Ejemplos.estaOrdenadoAscendentemente(array);
				break;
			case 8:
				Ejemplos.estaOrdenadoDescendentemente(array);
				break;
			case 9:
				Ejemplos.ordenarArrayCreciente(array);
				break;
			case 10:
				Ejemplos.ordenarArrayDecreciente(array);
				break;
			default:
				System.out.println("Opción incorrecta.");
			}
			
		} while (opcion != 0);
	}

	public static void main(String[] args) {
		Aplicacion a = new Aplicacion();

	}

}
