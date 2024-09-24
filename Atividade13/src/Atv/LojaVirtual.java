package Atv;

import java.util.ArrayList;

public class LojaVirtual {
	
	    private ArrayList<Produto> produtos; 
	    private CarrinhoDeCompras carrinho;  

	    public LojaVirtual() {
	        this.produtos = new ArrayList<>();
	        this.carrinho = new CarrinhoDeCompras();
	    }

	    public void cadastrarProduto(String nome, double preco, int estoque) {
	        Produto produto = new Produto(nome, preco, estoque);
	        produtos.add(produto);
	        System.out.println("Produto " + nome + " cadastrado com sucesso.");
	    }

	    public void listarProdutos() {
	        System.out.println("Produtos disponíveis na loja:");
	        for (Produto produto : produtos) {
	            System.out.println(produto.getNome() + " - Preço: R$ " + produto.getPreco() + " - Estoque: " + produto.getQuantidadeEstoque());
	        }
	    }

	    public void adicionarAoCarrinho(String nomeProduto, int quantidade) {
	        for (Produto produto : produtos) {
	            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
	                carrinho.adicionarProduto(produto, quantidade);
	                return;
	            }
	        }
	        System.out.println("Produto não encontrado: " + nomeProduto);
	    }

	    public double aplicarDesconto(double percentualDesconto) {
	        double total = carrinho.calcularTotal();
	        double desconto = total * (percentualDesconto / 100);
	        return total - desconto;
	    }

	   
	    public void finalizarCompra(double percentualDesconto) {
	        carrinho.exibirItens();
	        double totalComDesconto = aplicarDesconto(percentualDesconto);
	        System.out.println("Total com desconto de " + percentualDesconto + "%: R$ " + totalComDesconto);
	    }
	}

