package edu.pruebas;

public class Calculo extends Variable
{
	
	public Calculo(Integer x, Integer y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public Integer sumar() {
		return this.getX() + this.getY();
	}

}
