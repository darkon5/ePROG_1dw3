package ebaluaketa3;
//package examen3;

import java.io.Serializable;
import java.util.Scanner;

public class Racional implements Comparable<Racional>, Serializable{

	private static final long serialVersionUID = 1543359510048065949L;
	private int numerador;
	private int denominador;
	
	// constructor por defecto
	Racional(){
		this.numerador = 0;
		this.denominador = 1;
	}
	
	// constructores personalizados
	Racional(int n, int d){
		this.numerador = n;
		this.denominador = d;
	}
	
	Racional(int n){
		this.numerador = n;
		this.denominador = 1;
	}
	
	// constructor copia
	Racional(Racional r){
		this.numerador = r.numerador;
		this.denominador = r.denominador;
	}

	// Getters and Setters
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	// toString
	@Override
	public String toString() {
		return (this.numerador + "/" + this.denominador);
	}

	// hashCode
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + denominador;
	result = prime * result + numerador;
	return result;
	}

	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		// compara si apuntan al mismo objeto
			return true;
		if (obj == null)
		// comprueba si obj esta creado o no
			return false;
		if (getClass() != obj.getClass())
		// comprueba si son de la misma clase
			return false;
		//compara el contenido de dos objetos de la misma clase
		Racional other = (Racional) obj;
		if (this.denominador != other.denominador)
			return false;
		if (this.numerador != other.numerador)
			return false;
		return true;
	}

	//compareTo
	@Override
	public int compareTo(Racional r) {
		int n1,n2;
		n1 = this.numerador * r.denominador;
		n2 = this.denominador * r.numerador;
		
		if (n1 < n2){
			return -1;
		}
		else if (n1 > n2){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	//leer
	public void leer(Scanner teclado){
		// recibo un objeto de la clase Scanner
		// porque no lo puedo declarar dentro ya que da 
		// problemas al leer m�s de un dato seguido
		
		System.out.print("Numerador: ");
		this.numerador = teclado.nextInt();
		
		System.out.print("Denominador: ");
		this.denominador = teclado.nextInt();
	}
	
}