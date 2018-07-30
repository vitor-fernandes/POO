package Questao9;

class Retangulo implements FormaGeometrica
{
	private double base;
	private double altura;
	
	Retangulo(double bs, double altr)
	{
		this.base = bs;
		this.altura = altr;
	}

	@Override
	public double calculaArea() 
	{
		return this.base * this.altura;
	}

	@Override
	public double calculaPerimetro() 
	{
		return 2 * (this.base + this.altura);
	}

	@Override
	public void imprimeDados() 
	{
		System.out.println("Base: " + this.base + " | Altura: " + this.altura + " | Área: " + this.calculaArea() + " | Perímetro: " + this.calculaPerimetro());
	}

}
