package depositorio;

import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {
		
		// Criação dos objetos
		Produtos p1 = new Produtos("Feijão", 2.5, 4, 10, 2020);
		Produtos p2 = new Produtos("Café", 1.0, 1, 1, 2022);
		Produtos p3 = new Produtos("Beterraba", 0.9, 12, 11, 2017);
		Produtos p4 = new Produtos("Laranja", 1.0, 11, 05, 2016);
		
		// Definido o padrão da data que é usado em determinado país.
		Locale l = new Locale("pt", "BR");
		
		System.out.println(String.format(l, "%d) %12s %07.2f %s", p1.getNumeroProduto(), p1.getNome(), p1.getPeso(), p1.getFormattedDataValidade()));
		System.out.println(String.format(l, "%d) %12s %07.2f %s", p2.getNumeroProduto(), p2.getNome(), p2.getPeso(), p2.getFormattedDataValidade()));
		System.out.println(String.format(l, "%d) %12s %07.2f %s", p3.getNumeroProduto(), p3.getNome(), p3.getPeso(), p3.getFormattedDataValidade()));
		System.out.println(String.format(l, "%d) %12s %07.2f %s", p4.getNumeroProduto(), p4.getNome(), p4.getPeso(), p4.getFormattedDataValidade()));
		
		/**
		 * Padrão de formatação:
		 * 
		 * %d     -> Exibe o ID sequencial do produto (1, 2, 3, etc.)
		 * %12s   -> Alinha o nome do produto à direita utilizando um espaço fixo de 12 caracteres
		 * %07.2f -> Exibe o preço do produto com 2 casas decimais e com preenchimento de 0's a esquerda,
		 *           até completar 7 caracteres
		 * %s     -> Data formatada
		 */
	}

}
