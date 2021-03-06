package depositorio;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;	

public class Produtos {
	
	 
	// Formatador de datas. 
	//Como o m�todo n�o recebe par�metro, o Locale � o setado no sistema
	private static final DateFormat DF = DateFormat.getDateInstance();
	
	// Atributo que armazena o c�dido do produto.
	private static int codigoProduto = 1;
	
	// Atributo que armazena o nome do produto.
	private String nome;
	
	// Atributo que armazena o peso do alimento.
	private double peso;
	
	// Atributo que armazena a data de validade do produto.
	private Date dataValidade;
	
	// Construtor que recebe nome, peso, um dia, um m�s e um ano.
	public Produtos(String nome, double peso, int dia, int mes, int ano) {
		this.nome = nome;
		this.peso = peso;
		
		// Objeto que representa a data e a hora atual do sistema.
		Calendar c = Calendar.getInstance();
		
		// M�todo que define a data e a hora.
		c.set(ano, mes, dia);
		
		// � atribu�do ao objeto Date a data e hora informados pelo usu�rio.
		this.dataValidade = c.getTime();
	}	
	
	// M�todo GET que retorna o nome do produto.
	public String getNome() {
		return nome;
	}
	
	// M�todo GET que retorna o peso do produto.
	public double getPeso() {
		return peso;
	}
	
	// M�todo GET que retorna a data de validade do produto.
	public Date getDataValidade() {
		return dataValidade;
	}
	
	// M�todo GET que formata a data como uma String no padr�o curto.
	public String getFormattedDataValidade() {
		return DF.format(dataValidade);
	}
	
	// Incrementa o c�digo do produto toda vez que esse m�todo � chamado.
	public int getNumeroProduto() {
		return codigoProduto++;
	}
}
