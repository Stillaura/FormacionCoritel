package com.coritel.pruebas;

import java.util.Random;
import java.util.Scanner;

public class ArrayMedia {

	private int arraySize;
	private int[] numeros;
	private Scanner sc = new Scanner( System.in );

	public int leerDatos( String texto ) {
		return leerDatos( texto, 0 );
	}

	public int leerDatos( String texto, int flag ) {
		int cr = 0;
		System.out.println( texto );
		System.out.print( "> " );
		if( flag > 0 ) {
			arraySize = sc.nextInt();
		} else if( flag == -1 ) {
			Random r = new Random();
			arraySize = r.nextInt( 11 );
		} else {
			cr = sc.nextInt();
		}
		return cr;
	}

	public void generarArray() {
		if( arraySize > 0 ) {
			numeros = new int[arraySize];
		} else {
			System.out
					.println( "El array no puede tener un tamaño de 0 o negativo" );
		}
	}

	public void rellenarArray() {
		int size = numeros.length;
		for( int i = 0; i < size; i++ ) {
			if( numeros[i] == 0 ) {
				numeros[i] = leerDatos( "Introduce valor en posición " + i
						+ ":" );
			}
		}
	}

	public void calcularMedia() {
		int size = numeros.length;
		int total = 0;
		for( int a : numeros ) {
			total += a;
		}
		int media = total / size;
		System.out.println( "La media es de " + media );
	}

}
