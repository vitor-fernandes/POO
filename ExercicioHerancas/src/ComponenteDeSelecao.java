import java.util.ArrayList;

public class ComponenteDeSelecao 
{
	private ArrayList<String> objetos;
	private String nome;
	
	public ComponenteDeSelecao(ArrayList<String> obj, String nome)
	{
		this.objetos = obj;
		this.nome = nome;
	}
	
	public void geraListaBox()
	{ 
		for (int i = 0; i < this.objetos.size(); i++)
		{
			if(this.objetos.get(i).equals(this.nome))
			{
				System.out.println(this.objetos.get(i));
			}
		}
	}
	
}
