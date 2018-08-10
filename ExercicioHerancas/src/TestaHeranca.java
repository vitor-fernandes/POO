import java.util.ArrayList;

public class TestaHeranca
{
	public static void main(String [] args)
	{
		ArrayList<String> arrayAlunos = new ArrayList<String>("João", "Maria", "Pedro", "João Lucas", "Pedro Poste", "Maria João");
		ColecaoDeAlunos alunos = new ColecaoDeAlunos();
		ColecaoDeDisciplinas disciplinas = new ColecaoDeDisciplinas("Programação", "Calculo", "Física", "Introdução à Programação", "Programação II", "Matemática");
		
		ComponenteDeSelecao cds = new ComponenteDeSelecao(alunos, "João");
	}
}
