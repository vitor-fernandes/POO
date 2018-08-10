
public class Quadrado implements AreaCalculavel 
{
	private double lado;
	private String nome;
	
	public Quadrado(double lado)
	{
		this.lado = lado;
		this.nome = "Quadrado";
	}
	
	@Override
	public double calculaArea() 
	{
		return this.lado * this.lado;
	}

	@Override
	public String getNome() {
		return this.nome;
	}
	
}
