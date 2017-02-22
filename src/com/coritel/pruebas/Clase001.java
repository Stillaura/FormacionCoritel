package com.coritel.pruebas;

public class Clase001 {
	/**
	 * Sección de declaración de atibutos de la clase
	 */

	int total = 1;

	/**
	 * Método default para indicar por pantalla el método
	 *
	 * @param nombreMétodo
	 *            Nombre del método a ejecutarse
	 */
	public void cabecera( String nombreMétodo ) {
		System.out.println( "\n\n-----------------------" );
		System.out.println( "Método " + nombreMétodo + "()" );
		System.out.println( "-----------------------" );
	}

	/**
	 * Método para verificar su un valor dado es par o no.
	 *
	 * @param valor
	 * @return
	 */
	public boolean esPar( int valor ) {
		boolean result = true;
		if( valor % 2 != 0 ) {
			result = false;
		}
		return result;
	}

	/**
	 * Método recurvisivo
	 *
	 * @param valor
	 * @return Mientas valor > 1, retorna función factorial con valor -1, sino
	 *         imprime valor final
	 */
	public int factorial( int valor ) {
		if( valor > 1 ) {
			total = total * valor;
			int aux = valor - 1;
			return factorial( aux );
		} else {
			System.out.println( total );
			return 0;
		}
	}

	/**
	 * Función main de la clase
	 *
	 * @param args
	 */
	public static void main( String[] args ) {
//		// Variable local para pruebas
//		int numeroPrueba = 12;
//
//		// Nuevo objeto anónimo
//		new Clase001().cabecera( "factorial" );
//		new Clase001().factorial( 3 );
//
//		new Clase001().cabecera( "esPar" );
//		System.out.println( new Clase001().esPar( numeroPrueba ) );
//
//		new Clase001().cabecera( "esParOImparEnTexto" );
//		Validator validador = new Validator();
//		System.out.println( validador.esParOImparEnTexto( numeroPrueba ) );
//
//		Persona oJuana, oLuis, oAmparo;
//		oJuana = new Persona( "Juana", 51, false );
//		oJuana.printAttributes();
//
//		oLuis = new Persona( "Luis", 14, true );
//		oLuis.printAttributes();
//
//		oAmparo = new Persona( "Amparo", 30, true );
//		oAmparo.printAttributes();
//
//		// Amparo pasa a llamarse Andrea
//		oAmparo.setMyName( "Andrea" );
//		oAmparo.printAttributes();
		
		//Con elección por parte del usuario
//		ArrayMedia obj = new ArrayMedia();
//		obj.leerDatos( "Introduce el tamaño del array", 1 );
//		obj.generarArray();
//		obj.rellenarArray();
//		obj.calcularMedia();
//		
		//De forma aleatoria
//		ArrayMedia obj2 = new ArrayMedia();
//		obj2.leerDatos( "Introduce el tamaño del array", -1 );
//		obj2.generarArray();
//		obj2.rellenarArray();
//		obj2.calcularMedia();
		
		GenerarNúmeroEnorme gnm = new GenerarNúmeroEnorme();
		gnm.imprimirValores();
		
		
		
	}
}
