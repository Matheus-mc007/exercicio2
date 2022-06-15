
public class ItemDeVenda {
	
	private Produto produto;
	private int quantidade;
	private double subtotal;
	private double calcularSubtotal;
	
	public ItemDeVenda(Produto produto, int quantidade, double subtotal) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.subtotal = subtotal;
		
		
	}

	public Produto getProduto() {
		return produto;
	}


	public int getQuantidade() {
		return quantidade;
	}

public double setQuantidade() {
	return quantidade;
		
	
	}

	public double getSubtotal() {
		return subtotal;
	}

	public double getCalcularSubtotal() {
		return calcularSubtotal;
	}
	
	
	

	
}
	
	

	
	

	


