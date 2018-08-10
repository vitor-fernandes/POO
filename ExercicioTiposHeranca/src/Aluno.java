
public class Aluno implements Nomeavel
{
	private String nome;
	
	public Aluno(String nome)
	{
		this.nome = nome;
	}

	@Override
	public String getNome() 
	{
		return this.nome;
	}
	
}
