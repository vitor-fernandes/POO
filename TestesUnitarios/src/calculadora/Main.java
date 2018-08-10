package calculadora;

public class Main 
{

	public static void main(String[] args)
	{
		Calculadora calc = new Calculadora();
		
		int [] n = {1, 2, 3, 4, 5};
		
		System.out.println(calc.maior(4, 5));
		System.out.println(calc.raiz(4));
		System.out.println(calc.soma(10, 10));
		System.out.println(calc.subtrai(5, 3));
		System.out.println(calc.media(n));

	}

}
