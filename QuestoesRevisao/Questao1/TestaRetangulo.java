package Questao1;

public class TestaRetangulo 
{

	public static void main(String[] args) 
	{
		Retangulo ret1 = new Retangulo(2, 3);
		Retangulo ret2 = new Retangulo(2, 2);
		

		System.out.println("Área: " + ret1.calculaArea());
		System.out.println("Perímetro: " + ret1.calculaPerimetro());
		System.out.println(ret1.toString());
		ret1.setAltura(3.14);
		ret1.setLargura(5.64);
		System.out.println(ret1.toString());
		
		System.out.println("");
		
		System.out.println("Área: " + ret2.calculaArea());
		System.out.println("Perímetro: " + ret2.calculaPerimetro());
		System.out.println(ret2.toString());
		ret2.setAltura(5.43);
		ret2.setLargura(10.4);
		System.out.println(ret2.toString());

		System.out.println("");
		
		System.out.println("São iguais: " + ret1.equals(ret2));
		
		ret1.setAltura(ret2.getAltura());
		ret1.setLargura(ret2.getLargura());
		
		System.out.println("São iguais: " + ret1.equals(ret2));
		
	}

}
