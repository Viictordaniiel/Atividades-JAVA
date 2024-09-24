package Atv;

public class Produto {
	
	    private String nome;
	    private double preco;
	    private int quantidadeEstoque;

	    public Produto(String nome, double preco, int quantidadeEstoque) {
	        this.nome = nome;
	        this.preco = preco;
	        this.quantidadeEstoque = quantidadeEstoque;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public int getQuantidadeEstoque() {
	        return quantidadeEstoque;
	    }

	    public void reduzirEstoque() {
	        if (quantidadeEstoque > 0) {
	            this.quantidadeEstoque--;
	        }
	    }

	    public boolean estaDisponivel() {
	        return quantidadeEstoque > 0;
	    }

	    @Override
	    public String toString() {
	        return "Produto: " + nome + ", Preço: R$" + preco + ", Estoque: " + quantidadeEstoque;
	    }
	}


