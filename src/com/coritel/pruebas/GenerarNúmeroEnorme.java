package com.coritel.pruebas;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class GenerarNúmeroEnorme {
	private Random r = new Random();
	private int valorEnorme;

	private void generarNumeroEnorme(int desde, int hasta ) {
		// fórmula (hasta - desde -1) + desde
		valorEnorme = r.nextInt( hasta - desde + 1 ) + desde;
	}

	private boolean validarDigitoFinal() {
		boolean resultado = false;
		String sValorEnorme = String.valueOf( valorEnorme );
		String valorTruncado = sValorEnorme
				.substring( sValorEnorme.length() - 1 );

		if( valorTruncado.matches( "(1|3|9)" ) ) {
			resultado = true;
		}
		return resultado;
	}

	public boolean validacionModular() {
		boolean resultado = false;
		int resto = valorEnorme % 10;
		if( resto == 1 | resto == 3 | resto == 9 ) {
			resultado = true;
		}
		return resultado;
	}

	public void imprimirValores() {
		int veces = 0;
		while( veces < 5 ) {
			generarNumeroEnorme(10000, 500000);
			if( validacionModular() ) {
				System.out.println( valorEnorme );
				veces++;
			}
		}
	}
}
