package Atv;

import java.util.ArrayList;

public class Biblioteca {
	
	    private ArrayList<Livro> livros; 

	    public Biblioteca() {
	        this.livros = new ArrayList<>();
	    }

	    public void cadastrarLivro(String titulo, String autor) {
	        Livro livro = new Livro(titulo, autor);
	        livros.add(livro);
	        System.out.println("Livro '" + titulo + "' cadastrado com sucesso.");
	    }

	    public void emprestarLivro(String titulo) {
	        Livro livro = buscarLivro(titulo);
	        if (livro != null) {
	            if (livro.isDisponivel()) {
	                livro.emprestar();
	                System.out.println("O livro '" + titulo + "' foi emprestado.");
	            } else {
	                System.out.println("O livro '" + titulo + "' já está emprestado.");
	            }
	        } else {
	            System.out.println("Livro '" + titulo + "' não encontrado.");
	        }
	    }

	    public void devolverLivro(String titulo) {
	        Livro livro = buscarLivro(titulo);
	        if (livro != null) {
	            if (!livro.isDisponivel()) {
	                livro.devolver();
	                System.out.println("O livro '" + titulo + "' foi devolvido.");
	            } else {
	                System.out.println("O livro '" + titulo + "' já está disponível na biblioteca.");
	            }
	        } else {
	            System.out.println("Livro '" + titulo + "' não encontrado.");
	        }
	    }

	    public void verificarDisponibilidade(String titulo) {
	        Livro livro = buscarLivro(titulo);
	        if (livro != null) {
	            System.out.println("O livro '" + titulo + "' está " + (livro.isDisponivel() ? "disponível." : "emprestado."));
	        } else {
	            System.out.println("Livro '" + titulo + "' não encontrado.");
	        }
	    }

	    private Livro buscarLivro(String titulo) {
	        for (Livro livro : livros) {
	            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
	                return livro;
	            }
	        }
	        return null;
	    }

	    public void exibirLivros() {
	        System.out.println("Lista de livros na biblioteca:");
	        for (Livro livro : livros) {
	            System.out.println(livro);
	        }
	    }
	    
}

	   