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

	    public double calcularValorTotalEstoque() {
	        return preco * quantidadeEstoque;
	    }

	    public boolean estaDisponivel() {
	        return quantidadeEstoque > 0;
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

	    public void exibirInformacoes() {
	        System.out.println("Nome do Produto: " + nome);
	        System.out.println("Preço: R$ " + preco);
	        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
	        System.out.println("Valor Total em Estoque: R$ " + calcularValorTotalEstoque());
	        System.out.println("Disponível: " + (estaDisponivel() ? "Sim" : "Não"));
	    }

	 
	}



