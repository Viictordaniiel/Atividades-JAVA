package Atv;

import java.util.ArrayList;

public class Postagem {
	

	    private Usuario autor;
	    private String mensagem;
	    private ArrayList<Comentario> comentarios;

	    public Postagem(Usuario autor, String mensagem) {
	        this.autor = autor;
	        this.mensagem = mensagem;
	        this.comentarios = new ArrayList<>();
	    }

	    public Usuario getAutor() {
	        return autor;
	    }

	    public String getMensagem() {
	        return mensagem;
	    }

	    public ArrayList<Comentario> getComentarios() {
	        return comentarios;
	    }

	    public void adicionarComentario(Usuario autor, String mensagem) {
	        Comentario comentario = new Comentario(autor, mensagem);
	        comentarios.add(comentario);
	    }

	    public void exibirComentarios() {
	        System.out.println("Comentários na postagem: " + mensagem);
	        for (Comentario comentario : comentarios) {
	            System.out.println("- " + comentario.getAutor().getNome() + ": " + comentario.getMensagem());
	        }
	    }
	}


