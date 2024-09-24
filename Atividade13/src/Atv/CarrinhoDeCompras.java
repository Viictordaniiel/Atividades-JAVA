package Atv;

import java.util.HashMap;

public class CarrinhoDeCompras {
 
	    private HashMap<Produto, Integer> itens; 
	    public CarrinhoDeCompras() {
	        this.itens = new HashMap<>();
	    }

	    public void adicionarProduto(Produto produto, int quantidade) {
	        if (produto.estaDisponivel(quantidade)) {
	            itens.put(produto, itens.getOrDefault(produto, 0) + quantidade);
	            produto.reduzirEstoque(quantidade);
	            System.out.println(quantidade + " unidades de " + produto.getNome() + " adicionadas ao carrinho.");
	        } else {
	            System.out.println("Estoque insuficiente para " + produto.getNome() + ".");
	        }
	    }

	    public double calcularTotal() {
	        double total = 0;
	        for (Produto produto : itens.keySet()) {
	            total += produto.getPreco() * itens.get(produto);
	        }
	        return total;
	    }

	    public void exibirItens() {
	        System.out.println("Itens no carrinho:");
	        for (Produto produto : itens.keySet()) {
	            System.out.println(produto.getNome() + " - Quantidade: " + itens.get(produto) + " - Preço unitário: R$ " + produto.getPreco());
	        }
	    }
	}

