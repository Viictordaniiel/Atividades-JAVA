package Atv;

public class Main {
	
	 public static void main(String[] args) {
	        Biblioteca biblioteca = new Biblioteca();

	        biblioteca.cadastrarLivro("Dom Quixote", "Miguel de Cervantes");
	        biblioteca.cadastrarLivro("1984", "George Orwell");
	        biblioteca.cadastrarLivro("O Senhor dos Anéis", "J. R. R. Tolkien");

	        biblioteca.exibirLivros();

	        biblioteca.emprestarLivro("1984");

	        biblioteca.verificarDisponibilidade("1984");

	        biblioteca.emprestarLivro("1984");

	        biblioteca.devolverLivro("1984");

	        biblioteca.verificarDisponibilidade("1984");

	        biblioteca.exibirLivros();
	    }
	}

