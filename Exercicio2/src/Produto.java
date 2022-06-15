
public class Produto {
	
	private String idProduto;
	private String nome;
	private String categoria;
	private double preco;
	private String marca;
	private String modelo;
	private double altura;
	private double largura;
	private double comprimento;
	private double peso;
	
	public Produto(String idProduto, String nome, String categoria, double preco, String marca, String modelo,
			double altura, double largura, double comprimento, double peso) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.marca = marca;
		this.modelo = modelo;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.peso = peso;
	}



	//
	

public Produto() {
	}



	//
	public double getAltura() {
		return altura;
	}

	
public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	//
	public double getLargura() {
		return largura;
	}

	//
	public double getComprimento() {
		return comprimento;
	}

//
	public double getPeso() {
		return peso;
	}



	public void setQuantidade(int i) {
		// TODO Auto-generated method stub
		
	}



	public double getQuantidade() {
		// TODO Auto-generated method stub
		return 12;
	}



	


}
