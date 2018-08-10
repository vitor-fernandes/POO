
public class Professor implements Nomeavel
{
	private String nome;
	
	public Professor(String nome)
	{
		this.nome = nome;
	}

	@Override
	public String getNome() 
	{
		return this.nome;
	}
	
}
