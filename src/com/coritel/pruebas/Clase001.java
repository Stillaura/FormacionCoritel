package com.coritel.pruebas;

public class Clase001 {
	/**
	 * Secci�n de declaraci�n de atibutos de la clase
	 */

	int total = 1;

	/**
	 * M�todo default para indicar por pantalla el m�todo
	 *
	 * @param nombreM�todo
	 *            Nombre del m�todo a ejecutarse
	 */
	public void cabecera( String nombreM�todo ) {
		System.out.println( "\n\n-----------------------" );
		System.out.println( "M�todo " + nombreM�todo + "()" );
		System.out.println( "-----------------------" );
	}

	/**
	 * M�todo para verificar su un valor dado es par o no.
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
	 * M�todo recurvisivo
	 *
	 * @param valor
	 * @return Mientas valor > 1, retorna funci�n factorial con valor -1, sino
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
	 * Funci�n main de la clase
	 *
	 * @param args
	 */
	public static void main( String[] args ) {
//		// Variable local para pruebas
//		int numeroPrueba = 12;
//
//		// Nuevo objeto an�nimo
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
		
		//Con elecci�n por parte del usuario
//		ArrayMedia obj = new ArrayMedia();
//		obj.leerDatos( "Introduce el tama�o del array", 1 );
//		obj.generarArray();
//		obj.rellenarArray();
//		obj.calcularMedia();
//		
		//De forma aleatoria
//		ArrayMedia obj2 = new ArrayMedia();
//		obj2.leerDatos( "Introduce el tama�o del array", -1 );
//		obj2.generarArray();
//		obj2.rellenarArray();
//		obj2.calcularMedia();
		
		GenerarN�meroEnorme gnm = new GenerarN�meroEnorme();
		gnm.imprimirValores();
		
		
		
	}
}
