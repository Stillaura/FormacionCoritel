package com.coritel.pruebas;

public class Persona {

	private String myName;
	private int myAge;
	private boolean myShouldGiveBooksBack;

	public Persona() {

	}

	public Persona( String nombre ) {
		this.myName = nombre;
	}

	public Persona( String myName, int myAge ) {
		this.myName = myName;
		this.myAge = myAge;
	}

	public Persona( String myName, int myAge, boolean myShouldGiveBooksBack ) {
		this( myName ); // Usando constructor de un sólo parámetro
		this.myAge = myAge;
		this.myShouldGiveBooksBack = myShouldGiveBooksBack;
	}

	public void printAttributes() {
		System.out
				.println( String
						.format(
								"Atributos { myName = %s, myAge = %d, myShouldGiveBooksBack = %b }",
								this.myName, this.myAge,
								this.myShouldGiveBooksBack ) );
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName( String myName ) {
		this.myName = myName;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge( int myAge ) {
		this.myAge = myAge;
	}

	public boolean isMyShouldGiveBooksBack() {
		return myShouldGiveBooksBack;
	}

	public void setMyShouldGiveBooksBack( boolean myShouldGiveBooksBack ) {
		this.myShouldGiveBooksBack = myShouldGiveBooksBack;
	}

}
