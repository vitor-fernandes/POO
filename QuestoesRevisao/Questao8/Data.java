package Questao8;

class Data 
{
	private int dia;
	private int mes;
	private int ano;

	Data(int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String toString()
	{
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
