package depositorio;

import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {
		
		// Cria��o dos objetos
		Produtos p1 = new Produtos("Feij�o", 2.5, 4, 10, 2020);
		Produtos p2 = new Produtos("Caf�", 1.0, 1, 1, 2022);
		Produtos p3 = new Produtos("Beterraba", 0.9, 12, 11, 2017);
		Produtos p4 = new Produtos("Laranja", 1.0, 11, 05, 2016);
		
		// Definido o padr�o da data que � usado em determinado pa�s.
		Locale l = new Locale("pt", "BR");
		
		System.out.println(String.format(l, "%d) %12s %07.2f %s", p1.getNumeroProduto(), p1.getNome(), p1.getPeso(), p1.getFormattedDataValidade()));
		System.out.println(String.format(l, "%d) %12s %07.2f %s", p2.getNumeroProduto(), p2.getNome(), p2.getPeso(), p2.getFormattedDataValidade()));
		System.out.println(String.format(l, "%d) %12s %07.2f %s", p3.getNumeroProduto(), p3.getNome(), p3.getPeso(), p3.getFormattedDataValidade()));
		System.out.println(String.format(l, "%d) %12s %07.2f %s", p4.getNumeroProduto(), p4.getNome(), p4.getPeso(), p4.getFormattedDataValidade()));
		
		/**
		 * Padr�o de formata��o:
		 * 
		 * %d     -> Exibe o ID sequencial do produto (1, 2, 3, etc.)
		 * %12s   -> Alinha o nome do produto � direita utilizando um espa�o fixo de 12 caracteres
		 * %07.2f -> Exibe o pre�o do produto com 2 casas decimais e com preenchimento de 0's a esquerda,
		 *           at� completar 7 caracteres
		 * %s     -> Data formatada
		 */
	}

}
