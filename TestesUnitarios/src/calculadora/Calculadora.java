package calculadora;

class Calculadora 
{
	
	Calculadora() { }
	
	double maior(double n1, double n2)
	{
		if (n1 >= n2) return n1;
		else return n2;
	}
	
	double soma(double n1, double n2) { return n1 + n2; }
	
	double subtrai(double n1, double n2) { return n1 - n2; }
	
	double raiz(double n1) { return Math.sqrt(n1); }
	
	double media(int[] notas)
	{
		double result = 0;
		for (int i = 0; i < notas.length; i++){ result += notas[i]; }
		return result / notas.length;
	}
}
