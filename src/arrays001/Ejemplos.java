package arrays001;

import java.lang.reflect.Array;
import java.util.Scanner;

public abstract class Ejemplos {
	
	public static boolean DEPURACION=true;

	/**
	 * Genera un número aleatorio entre el mínimo y el máximo (no incluido).
	 * [minimo,maximo).
	 * @param minimo Número mínimo a generar
	 * @param maximo Número máximo no incluido
	 * @return
	 */
	public static int generarNumeroAleatorio(int minimo, int maximo) {
		/*
		 * int resultadoFinal;
		 * double resultadoDouble = Math.random();
		 * double resultadoDoubleIntervalo = resultadoDouble * (maximo - minimo);
		 * int resultadoEntero = (int) resultadoDoubleIntervalo;
		 * resultadoFinal = resultadoEntero + minimo; 
		 * System.out.println(resultadoFinal); 
		 * return resultadoFinal;
		 */
		return (int)(Math.random()*(maximo-minimo)+minimo);
	}

	/**
	 * Imprime un array de 4 posiciones.
	 */
	public static void imprimirArrayEnterosPredefinido() {
		int arrayEnteros[] = {4,7,8,2};
		//System.out.println(arrayEnteros[0]);//4
		//System.out.println(arrayEnteros[3]);//2
		//System.out.println(arrayEnteros[5]);//Dará error.
		//arrayEnteros[0]=99;
		//System.out.println(arrayEnteros[0]);//99
		String cadenaImprimir="{";
		for(int i=0;i<arrayEnteros.length;i++) {
			cadenaImprimir+=arrayEnteros[i];
			if(i<arrayEnteros.length-1)
				cadenaImprimir+=",";
		}
		cadenaImprimir+="}";
		System.out.println(cadenaImprimir);
	}
	
	public static void imprimirArrayEnterosAleatorios(int longitud) {
		int arrayEnteros[]=new int[longitud]; //Esto va a ser 10
		//Crear un array de 10 posiciones y llenarlo con números del 0 al 9
		//e imprimirlo
		for(int i=0;i<longitud;i++)
			arrayEnteros[i]=Ejemplos.generarNumeroAleatorio(0, 10);
		imprimirArrayEnteros(arrayEnteros);
	}
	
	public static void imprimirArrayPersonasIndeterminadas(int longitud) {
		//Pida por teclado tantos nombres como longitud tiene el array
		//y los muestra por pantalla ("La persona 1 es Pepe", por ejemplo).
		String nombres[]=new String[longitud];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<nombres.length;i++) {
			System.out.println("Introduce un nombre:");
			nombres[i]=s.next();
		}
		for(int i=0;i<nombres.length;i++) {
			System.out.println("La persona "+(i+1)+" se llama "+nombres[i]);
		}
		Ejemplos.imprimirArrayStringInverso(nombres);
	}
	
	public static void imprimirArrayStringInverso(String arrayStrings[]) {
		String cadenaImprimir="{";
		for(int i=arrayStrings.length-1;i>=0;i--) {
			cadenaImprimir+=arrayStrings[i];
			if(i>0)
				cadenaImprimir+=",";			
		}
		cadenaImprimir+="}";
		System.out.println(cadenaImprimir);
	}
		
	public static void imprimirArrayEnteros(int arrayEnteros[]) {
		String cadenaImprimir="{";
		for(int i=0;i<arrayEnteros.length;i++) {
			cadenaImprimir+=arrayEnteros[i];
			if(i<arrayEnteros.length-1)
				cadenaImprimir+=",";
		}
		cadenaImprimir+="}";
		System.out.println(cadenaImprimir);	
	}
	
	public static String arrayEnterosToString(int arrayEnteros[]) {
		String cadenaImprimir="{";
		for(int i=0;i<arrayEnteros.length;i++) {
			cadenaImprimir+=arrayEnteros[i];
			if(i<arrayEnteros.length-1)
				cadenaImprimir+=",";
		}
		cadenaImprimir+="}";
		return cadenaImprimir;
	}
	
	public static void imprimirArrayCuatroPersonas() {
		String arrayPersonas[]= {"María","Luis","Manolo","Lola"};
		for(int i=0;i<arrayPersonas.length;i++)
			System.out.println("La persona "+(i+1)+" se llama "+arrayPersonas[i]);
	}
	
	/**
	 * Imprimir seis números aleatorios entre el 1 y el 49 no repetidos.
	 */
	public static void imprimirApuestaLoteria() {
		int apuestas[]=new int[6];
		for(int i=0;i<apuestas.length;i++) {
			int numeroAleatorio=generarNumeroAleatorio(1,50);
			while(Ejemplos.existeNumero(numeroAleatorio, apuestas)) {
				imprimirTraza("Número repetido: "+numeroAleatorio);
				numeroAleatorio=generarNumeroAleatorio(1,50);
			}
			apuestas[i]=numeroAleatorio;
		}
		Ejemplos.imprimirArrayEnteros(apuestas);	
	}
	
	public static boolean existeNumero(int n, int array[]) {
		boolean existe=false;
		for(int i=0;i<array.length;i++) {
			if(array[i]==n) {
				existe=true;
				break;
			}				
		}
		return existe;
	}
	
	public static boolean estaOrdenadoAscendentemente(int array[]) {
		imprimirTraza("Comprobando si "+arrayEnterosToString(array)+" está ordenado ascendentemente.");
		boolean estaOrdenado=true;
		for(int i=0;i<array.length-1;i++) {
			imprimirTraza("- Comparando array["+i+"] con array["+(i+1)+"]");
			if(esMayor(array[i],array[i+1])) {
				imprimirTraza("  - "+array[i]+" es mayor que "+array[i+1]);
				estaOrdenado=false;
				break;
			}
		}
		imprimirTraza("El resultado de la comprobación es "+estaOrdenado+".");
		return estaOrdenado;
	}
	

	
	public static boolean estaOrdenadoDescendentemente(int array[]) {
		imprimirTraza("Comprobando si el array "+array+" está ordenado descendentemente.");
		boolean estaOrdenado=true;
		for(int i=0;i<array.length-1;i++) {
			imprimirTraza("Comparando array["+i+"] con array["+(i+1)+"]");
			if(esMayor(array[i+1],array[i])) {
				imprimirTraza(array[i]+" es menor que "+array[i+1]);
				estaOrdenado=false;
				break;
			}
		}
		return estaOrdenado;
	}
	
	
	public static boolean esMayor(int a, int b) {
		if(a>b)
			return true;
		else
			return false;
	}
	

	public static int[] ordenarArrayEnterosAscendentemente(int arrayEnteros[]) {
		imprimirTraza("Ordenando el array "+arrayEnterosToString(arrayEnteros));
		while(!estaOrdenadoAscendentemente(arrayEnteros)) {
			imprimirTraza("Estado actual del array: "+arrayEnterosToString(arrayEnteros));
			for(int i=0;i<arrayEnteros.length-1;i++) {
				if(esMayor(arrayEnteros[i],arrayEnteros[i+1])) {
					int aux=arrayEnteros[i+1];
					arrayEnteros[i+1]=arrayEnteros[i];
					arrayEnteros[i]=aux;
					imprimirTraza("Intercambiando el "+arrayEnteros[i+1]+" por el "+arrayEnteros[i]);
				}
				imprimirTraza("Estado actual del array: "+arrayEnterosToString(arrayEnteros));
			}
		}
		imprimirTraza("Estado final del array: "+arrayEnterosToString(arrayEnteros));
		return arrayEnteros;
	}
	
	public static void imprimirTraza(String mensaje) {
		if(DEPURACION==true)
			System.out.println("[TRAZA] "+mensaje);
	}

}
