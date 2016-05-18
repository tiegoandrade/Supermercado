package depositorio;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;	

public class Produtos {
	
	 
	// Formatador de datas. 
	//Como o método não recebe parâmetro, o Locale é o setado no sistema
	private static final DateFormat DF = DateFormat.getDateInstance();
	
	// Atributo que armazena o códido do produto.
	private static int codigoProduto = 1;
	
	// Atributo que armazena o nome do produto.
	private String nome;
	
	// Atributo que armazena o peso do alimento.
	private double peso;
	
	// Atributo que armazena a data de validade do produto.
	private Date dataValidade;
	
	// Construtor que recebe nome, peso, um dia, um mês e um ano.
	public Produtos(String nome, double peso, int dia, int mes, int ano) {
		this.nome = nome;
		this.peso = peso;
		
		// Objeto que representa a data e a hora atual do sistema.
		Calendar c = Calendar.getInstance();
		
		// Método que define a data e a hora.
		c.set(ano, mes, dia);
		
		// É atribuído ao objeto Date a data e hora informados pelo usuário.
		this.dataValidade = c.getTime();
	}	
	
	// Método GET que retorna o nome do produto.
	public String getNome() {
		return nome;
	}
	
	// Método GET que retorna o peso do produto.
	public double getPeso() {
		return peso;
	}
	
	// Método GET que retorna a data de validade do produto.
	public Date getDataValidade() {
		return dataValidade;
	}
	
	// Método GET que formata a data como uma String no padrão curto.
	public String getFormattedDataValidade() {
		return DF.format(dataValidade);
	}
	
	// Incrementa o código do produto toda vez que esse método é chamado.
	public int getNumeroProduto() {
		return codigoProduto++;
	}
}
