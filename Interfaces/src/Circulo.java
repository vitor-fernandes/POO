
public class Circulo implements AreaCalculavel
{

	private double raio;
	private String nome;
	
	public Circulo(double raio)
	{
		this.raio = raio;
		this.nome = "Círculo";
	}
	
	@Override
	public double calculaArea() {
		return 3.14 * (this.raio * this.raio);
	
}

	@Override
	public String getNome() {
		return this.nome;
	}
}
