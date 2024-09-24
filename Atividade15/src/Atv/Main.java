package Atv;

public class Main {
	
	  public static void main(String[] args) {
	        MaquinaDeVendas maquina = new MaquinaDeVendas();

	        maquina.cadastrarProduto("Refrigerante", 5.00, 10);
	        maquina.cadastrarProduto("Chocolate", 2.50, 5);
	        maquina.cadastrarProduto("Chips", 3.00, 8);

	        maquina.exibirEstoque();

	        maquina.inserirDinheiro(10.00);  
	        maquina.selecionarProduto("Refrigerante"); 

	        maquina.exibirEstoque();

	        maquina.inserirDinheiro(2.00); 
	        maquina.selecionarProduto("Chips"); 
	    }
	}
	
	
