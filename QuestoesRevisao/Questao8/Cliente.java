package Questao8;

class Cliente extends Pessoa
{

	private int codigo;
	
	Cliente(String name, Data date, int cod)
	{
		this.nome = name;
		this.nascimento = date;
		this.codigo = cod;
	}
	
	@Override
	void imprimeDados() 
	{	
		System.out.println("Nome: " + this.nome);
		System.out.println("Nascimento: " + this.nascimento.toString());
		System.out.println("Código: " + this.codigo);
		System.out.println("");
		
	}
	
}
