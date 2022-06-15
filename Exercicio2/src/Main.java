
public class Main {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setPreco(5500);
		produto.setQuantidade(12);
		
		double precoProduto = produto.getPreco();
		
		System.out.println(produto.getPreco() * produto.getQuantidade());
		
		
		

	}

}
