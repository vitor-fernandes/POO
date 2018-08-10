
public class Retangulo implements AreaCalculavel
{
	
	private double base;
	private double altura;
	private String nome;
	
	public Retangulo(double base, double altura) 
	{
		this.base = base;
		this.altura = altura;
		this.nome = "Retângulo";
	}

	@Override
	public double calculaArea() {
		
		return this.base * this.altura;
	}

	@Override
	public String getNome() {
		return this.nome;
	}
	
}
