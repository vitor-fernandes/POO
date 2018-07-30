package Questao9;

import java.util.ArrayList;

class TestaFormaGeometrica 
{

	public static void main(String[] args) 
	{
		ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
		
		Retangulo ret1 = new Retangulo(3, 4);
		Retangulo ret2 = new Retangulo(4, 5);
		
		Quadrado quad1 = new Quadrado(3);
		Quadrado quad2 = new Quadrado(4);
		
		Circulo cir1 = new Circulo(3);
		Circulo cir2 = new Circulo(4);
		
		formas.add(ret1);
		formas.add(ret2);
		formas.add(quad1);
		formas.add(quad2);
		formas.add(cir1);
		formas.add(cir2);
		
		for(int i = 0; i < formas.size(); i++)
		{
			formas.get(i).imprimeDados();
		}

	}

}
