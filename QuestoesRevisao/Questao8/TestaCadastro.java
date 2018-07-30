package Questao8;

class TestaCadastro 
{

	public static void main(String[] args) 
	{
	
		Cliente cli1 = new Cliente("Cliente 1", new Data(10,05,1993), 1);
		Cliente cli2 = new Cliente("Cliente 2", new Data(9,02,1980), 2);
		Cliente cli3 = new Cliente("Cliente 3", new Data(23,12,1997), 3);
		
		Funcionario fun1 = new Funcionario("Funcionario 1", new Data(3, 11, 1965), 1000);
		Funcionario fun2 = new Funcionario("Funcionario 2", new Data(15, 1, 1993), 1500);
		Funcionario fun3 = new Funcionario("Funcionario 3", new Data(29, 7, 2003), 1270);
		
		Gerente ge1 = new Gerente("Gerente 1", new Data(5, 3, 1977), 5465, "Gerente de Vendas");
		Gerente ge2 = new Gerente("Gerente 2", new Data(18, 7, 1967), 6253, "Gerente de Segurança");
		Gerente ge3 = new Gerente("Gerente 3", new Data(23, 5, 1982), 7500, "Gerente de Tecnologia");

		CadastroPessoa cadastro = new CadastroPessoa();
		cadastro.CadastrarPessoa(cli1);
		cadastro.CadastrarPessoa(cli2);
		cadastro.CadastrarPessoa(cli3);
		
		cadastro.CadastrarPessoa(fun1);
		cadastro.CadastrarPessoa(fun2);
		cadastro.CadastrarPessoa(fun3);
		
		cadastro.CadastrarPessoa(ge1);
		cadastro.CadastrarPessoa(ge2);
		cadastro.CadastrarPessoa(ge3);
		
		cadastro.imprimeCadastro();
		
	}

}
