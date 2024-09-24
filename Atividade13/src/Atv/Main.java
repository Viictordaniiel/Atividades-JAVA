package Atv;

public class Main {
	
	  public static void main(String[] args) {
		  
	        LojaVirtual loja = new LojaVirtual();

	        loja.cadastrarProduto("Notebook", 3500.00, 10);
	        loja.cadastrarProduto("Smartphone", 1500.00, 5);
	        loja.cadastrarProduto("Teclado", 200.00, 20);

	        loja.listarProdutos();

	        loja.adicionarAoCarrinho("Notebook", 1);
	        loja.adicionarAoCarrinho("Teclado", 2);

	        loja.finalizarCompra(10.0);
	    }
	}
	
	
