package Questao9;

abstract class Quadrilatero implements FormaGeometrica
{
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	
	Quadrilatero(double l1, double l2, double l3, double l4)
	{
		this.lado1 = l1;
		this.lado2 = l2;
		this.lado3 = l3;
		this.lado4 = l4;
	}
	
	public double calculaPerimetro()
	{
		return (this.lado1 + this.lado2 + this.lado3 + this.lado4);
	}
}
