package br.com.helloWorld;

public class Main {

	public static void main(String[] args) {
		
		// Declaração de variáveis
		String nome = "João";
		Integer codigo = 7;
		boolean status = true;
		int codigoTurma = 3;
		Double salario = 2500.0;
		int meses = 5;
		

		
		// Saída de dados
		System.out.println("Código: " + codigo);
		System.out.println("Nome: ".concat(nome));
		
		
		// Estrutura condicional IF
		if (status) {
			System.out.println("Cadastro ativo!");
		} else {
			System.out.println("Cadastro inativo!");
		}
		
		
		// Estrutura condicional SWITCH...CASE
		switch (codigoTurma) {
		case 1: 
			System.out.println("Setor: Tecnologia");
			break;
		case 2: 
			System.out.println("Setor: Suporte");
			break;
		case 3: 
			System.out.println("Setor: Desenvolvimento");
			break;
		default:
			System.out.println("Setor não encontrado!");
		}
		
		
		// Estrutua de repetição FOR
		System.out.println("*** Folha de Pagamento de " + nome + " ***");
		for (int cont = 0; cont <= meses; cont++) {
			System.out.println("Mês [" + cont + "]: Salário R$" + salario);
		}
		
		
		
		
		

	}
	
}