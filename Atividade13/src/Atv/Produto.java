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

	    public void setQuantidadeEstoque(int quantidadeEstoque) {
	        this.quantidadeEstoque = quantidadeEstoque;
	    }

	    public boolean estaDisponivel(int quantidade) {
	        return quantidadeEstoque >= quantidade;
	    }

	    public void reduzirEstoque(int quantidade) {
	        if (estaDisponivel(quantidade)) {
	            this.quantidadeEstoque -= quantidade;
	        }
	    }
	}
