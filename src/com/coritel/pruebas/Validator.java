package com.coritel.pruebas;

public class Validator {

	public boolean esPar( int valor ) {
		boolean result = true;
		if( valor % 2 != 0 ) {
			result = false;
		}
		return result;
	}

	public boolean esImpar( int valor ) {
		return !esPar( valor );
	}

	public String esParOImparEnTexto( int dato ) {
		String texto = dato + " es ";
		if( esPar( dato ) ) {
			texto += "par";
		} else {
			texto += "impar";
		}
		return texto;
	}

	public boolean esPrimo( int number ) {
		int i, m = 0;
		boolean primo = true;
		m = number / 2;
		for( i = 2; i <= m; i++ ) {
			if( number % i == 0 ) {
				primo = false;
				break;
			}
		}
		return primo;
	}
}
