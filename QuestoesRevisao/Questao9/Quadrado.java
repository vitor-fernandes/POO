package Questao9;

class Quadrado implements FormaGeometrica
{
	private double lado;
	
	Quadrado(double lado)
	{
		this.lado = lado;
	}
	
	
	@Override
	public double calculaArea() 
	{
		return (this.lado * this.lado);
	}

	@Override
	public double calculaPerimetro() 
	{
		return (this.lado * 4);
	}


	@Override
	public void imprimeDados() 
	{
		System.out.println("Lado: " + this.lado + " | Área: " + this.calculaArea() + " | Perímetro: " + this.calculaPerimetro());
		
	}

}
