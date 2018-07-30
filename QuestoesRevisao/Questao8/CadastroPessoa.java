package Questao8;

import java.util.ArrayList;

class CadastroPessoa 
{
	private ArrayList<Pessoa> pessoas;
	
	CadastroPessoa()
	{
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	void CadastrarPessoa(Pessoa pessoa)
	{
		this.pessoas.add(pessoa);
	}
	
	void imprimeCadastro()
	{
		for(int i = 0; i < this.pessoas.size(); i++)
		{
			this.pessoas.get(i).imprimeDados();
		}
	}
}
