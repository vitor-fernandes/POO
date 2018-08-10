
public class Disciplina implements Nomeavel
{

	private String nome;
	
	public Disciplina(String nome)
	{
		this.nome = nome;
	}
	
	@Override
	public String getNome() 
	{
		return this.nome;
	}

}
