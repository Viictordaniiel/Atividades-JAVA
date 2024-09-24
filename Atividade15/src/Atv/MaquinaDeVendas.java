package Atv;


import java.util.ArrayList;

public class MaquinaDeVendas {
	

	
	    private ArrayList<Produto> produtos;
	    private double saldoInserido;

	    public MaquinaDeVendas() {
	        this.produtos = new ArrayList<>();
	        this.saldoInserido = 0;
	    }

	    public void cadastrarProduto(String nome, double preco, int quantidadeEstoque) {
	        Produto produto = new Produto(nome, preco, quantidadeEstoque);
	        produtos.add(produto);
	        System.out.println("Produto " + nome + " cadastrado com sucesso.");
	    }

	    public void exibirEstoque() {
	        System.out.println("Produtos disponíveis na máquina:");
	        for (Produto produto : produtos) {
	            System.out.println(produto);
	        }
	    }

	    public void inserirDinheiro(double valor) {
	        if (valor > 0) {
	            saldoInserido += valor;
	            System.out.println("Dinheiro inserido: R$" + valor);
	            System.out.println("Saldo total: R$" + saldoInserido);
	        } else {
	            System.out.println("Valor inválido.");
	        }
	    }

	    public void selecionarProduto(String nomeProduto) {
	        for (Produto produto : produtos) {
	            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
	                if (produto.estaDisponivel()) {
	                    if (saldoInserido >= produto.getPreco()) {
	                        realizarCompra(produto);
	                        return;
	                    } else {
	                        System.out.println("Saldo insuficiente. Produto custa: R$" + produto.getPreco());
	                        return;
	                    }
	                } else {
	                    System.out.println("Produto indisponível.");
	                    return;
	                }
	            }
	        }
	        System.out.println("Produto não encontrado.");
	    }

	    private void realizarCompra(Produto produto) {
	        saldoInserido -= produto.getPreco();
	        produto.reduzirEstoque();
	        System.out.println("Produto " + produto.getNome() + " comprado com sucesso!");
	        System.out.println("Troco: R$" + saldoInserido);
	        saldoInserido = 0;  
	    }

}
