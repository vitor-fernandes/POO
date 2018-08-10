import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		Quadrado quad = new Quadrado(2);
		Retangulo ret = new Retangulo(3, 2);
		Circulo cir = new Circulo(4);
		
		ArrayList<AreaCalculavel> areas = new ArrayList<>();
		
		areas.add(quad);
		areas.add(ret);
		areas.add(cir);
		
		for (int i = 0; i < areas.size(); i++)
		{
			System.out.println(areas.get(i).getNome() + " tem área de: " + areas.get(i).calculaArea());
		}
		
	}

}
