package Questao2;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Qwerty");
		pessoa.setIdade(22);
		pessoa.setAltura(1.80);
		pessoa.setPeso(67);
		pessoa.setSexo('M');
		
		System.out.println("IMC: "+ pessoa.calculaIMC());
		
		System.out.println(pessoa.toString());

	}

}
