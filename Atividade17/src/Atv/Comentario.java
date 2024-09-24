package Atv;

public class Comentario {

	    private Usuario autor;
	    private String mensagem;

	    public Comentario(Usuario autor, String mensagem) {
	        this.autor = autor;
	        this.mensagem = mensagem;
	    }

	    public Usuario getAutor() {
	        return autor;
	    }

	    public String getMensagem() {
	        return mensagem;
	    }
	}

