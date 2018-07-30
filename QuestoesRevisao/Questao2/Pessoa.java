package Questao2;

public class Pessoa 
{
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private char sexo;
	
	public Pessoa()
	{
		this.nome = "";
		this.idade = 0;
		this.altura = 0.0;
		this.peso = 0.0;
		this.sexo = '?';
	}
	
	public Pessoa(String nome, int idade, double altura, double peso, char sexo) 
	{
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String calculaIMC()
	{
		double IMC = this.peso / (this.altura * this.altura);
		
		String IMCFormatado = String.format("%.2f", IMC);
		
		if(IMC <= 18.5)
		{
			return IMCFormatado + " Abaixo do Peso";
		}
		if(18.5 < IMC && IMC <= 25)
		{
			return IMCFormatado + " Peso Normal";
		}
		if(25 < IMC && IMC <= 30)
		{
			return IMCFormatado + " Acima do Peso Normal";
		}
		else
		{
			return IMCFormatado + " Obeso";
		}
	}
	
	public String toString()
	{
		return "Nome: " + this.nome + " | IMC: " + this.calculaIMC();
	}
	
	public String getNome() 
	{
		return this.nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public int getIdade() 
	{
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura()
	{
		return this.altura;
	}
	
	public void setAltura(double altura) 
	{
		this.altura = altura;
	}
	
	public double getPeso() 
	{
		return this.peso;
	}
	
	public void setPeso(double peso) 
	{
		this.peso = peso;
	}
	
	public char getSexo()
	{
		return this.sexo;
	}
	
	public void setSexo(char sexo) 
	{
		this.sexo = sexo;
	}
	
}
