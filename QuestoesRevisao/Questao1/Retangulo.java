package Questao1;

public class Retangulo 
{
	private double largura;
	private double altura;
	
	public Retangulo()
	{
		this.largura = 0;
		this.altura = 0;
	}
	
	public Retangulo(double largura, double altura)
	{
		this.largura = largura;
		this.altura = altura;
	}
	
	public String toString()
	{
		return "Base: " + this.largura + " | Altura: " + this.altura + " | Área: " + this.calculaArea() + " | Perímetro: " + this.calculaPerimetro();
	}

	public double getLargura() {
		return this.largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calculaPerimetro()
	{
		return 2 * (this.largura + this.altura);
	}
	
	public double calculaArea()
	{
		return this.largura * this.altura;
	}
	
	public Boolean equals(Retangulo retangulo)
	{
		return (this.largura == retangulo.largura && this.altura == retangulo.altura);
	}
}
