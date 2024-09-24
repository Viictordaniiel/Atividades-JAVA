package Atv;

public class Livro {
	
	    private String titulo;
	    private String autor;
	    private int numeroPaginas;
	    private boolean disponivel; 

	    public Livro(String titulo, String autor, int numeroPaginas) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.numeroPaginas = numeroPaginas;
	        this.disponivel = true;  
	    }

	    public boolean emprestar() {
	        if (disponivel) {
	            disponivel = false; 
	            System.out.println("O livro '" + titulo + "' foi emprestado.");
	            return true;
	        } else {
	            System.out.println("O livro '" + titulo + "' já está emprestado.");
	            return false;
	        }
	    }

	    public void devolver() {
	        if (!disponivel) {
	            disponivel = true; 
	            System.out.println("O livro '" + titulo + "' foi devolvido.");
	        } else {
	            System.out.println("O livro '" + titulo + "' já estava disponível.");
	        }
	    }

	    public boolean estaDisponivel() {
	        return disponivel;
	    }

	    public void exibirInformacoes() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Número de Páginas: " + numeroPaginas);
	        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
	    }

}
