package Atv;

public class Main {
	
	public static void main(String[] args) {
		
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 863);

        livro.exibirInformacoes();

        livro.emprestar();

        livro.emprestar();

        livro.devolver();

        livro.exibirInformacoes();
    }
}

