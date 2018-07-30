package Questao8;

class Gerente extends Funcionario
{
	private String area;

	Gerente(String name, Data data, double sala, String area) 
	{
		super(name, data, sala);
		this.area = area;
		
	}
	
	double calculaImposto()
	{
		return this.salario * 0.5;
	}
	
	void imprimeDados() 
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Nascimento: " + this.nascimento.toString());
		System.out.println("Salário: R$ " + this.salario);
		System.out.println("Área: " + this.area);
		System.out.println("Imposto (5%): " + this.calculaImposto());
		System.out.println("");
	}

}
