package Questao9;

class Circulo implements FormaGeometrica
{

	private double raio;
	private final double PI = 3.14;
	
	Circulo(double raio)
	{
		this.raio = raio;
	}
	
	@Override
	public double calculaArea() 
	{
		return this.PI * (this.raio * this.raio);
	}

	@Override
	public double calculaPerimetro() 
	{
		return 2 * this.PI * this.raio;
	}

	@Override
	public void imprimeDados() 
	{
		System.out.println("Raio: " + this.raio + " | Área: " + this.calculaArea() + " | Perímetro: " + this.calculaPerimetro());
	}

}
