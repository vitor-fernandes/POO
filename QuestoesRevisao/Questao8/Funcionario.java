package Questao8;

class Funcionario extends Pessoa
{

	protected double salario;
	
	Funcionario(String name, Data data, double sala)
	{
		this.nome = name;
		this.nascimento =  data;
		this.salario = sala;
	}
	
	@Override
	void imprimeDados() 
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Nascimento: " + this.nascimento.toString());
		System.out.println("Salário: R$ " + this.salario);
		System.out.println("Imposto (3%): " + this.calculaImposto());
		System.out.println("");
	}
	
	double calculaImposto()
	{
		return this.salario * 0.3;
	}
	
}
