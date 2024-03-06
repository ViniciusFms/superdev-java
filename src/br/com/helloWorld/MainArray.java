package br.com.helloWorld;

import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		
		// Comando para entrada de dados
		Scanner scan = new Scanner(System.in);


		// Estrutura de dados Array
		String[] nomes = new String[3];
		
		nomes[0] = "Harry";
		nomes[1] = "Rony";
		nomes[2] = "Bob";
		
		// Captura o valor do código através de entrada de dados
		// a partir do usuário
		System.out.print("Digite o código do aluno: ");
		int codigo = scan.nextInt();
		
		if (codigo > -1 && codigo < nomes.length) {
			
			// Atribui à variável 'aluno' o nome do aluno correspondente
			// ao código que o usuário digitou
			String aluno = nomes[codigo];
			
			// Exibe o nome do aluno encontrado!
			System.out.println("Aluno: " + aluno);
			
		} else {
			System.out.println("Não existe aluno para o código " + codigo);
		}
		
		
		

	}

}
