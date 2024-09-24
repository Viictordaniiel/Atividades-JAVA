package Atv;

import java.util.ArrayList;


public class Usuario {

	    private String nome;
	    private ArrayList<Usuario> amigos;
	    private ArrayList<Postagem> postagens;

	    public Usuario(String nome) {
	        this.nome = nome;
	        this.amigos = new ArrayList<>();
	        this.postagens = new ArrayList<>();
	    }

	    public String getNome() {
	        return nome;
	    }

	    public ArrayList<Usuario> getAmigos() {
	        return amigos;
	    }

	    public ArrayList<Postagem> getPostagens() {
	        return postagens;
	    }

	    public void adicionarAmigo(Usuario amigo) {
	        if (!amigos.contains(amigo)) {
	            amigos.add(amigo);
	            amigo.getAmigos().add(this);  
	            System.out.println(amigo.getNome() + " foi adicionado como amigo.");
	        } else {
	            System.out.println("Esse usuário já é seu amigo.");
	        }
	    }

	    public void publicarMensagem(String mensagem) {
	        Postagem novaPostagem = new Postagem(this, mensagem);
	        postagens.add(novaPostagem);
	        System.out.println(nome + " publicou: " + mensagem);
	    }

	    public void exibirPostagens() {
	        System.out.println("Postagens de " + nome + ":");
	        for (Postagem postagem : postagens) {
	            System.out.println("- " + postagem.getMensagem() + " (de " + postagem.getAutor().getNome() + ")");
	        }
	    }

	    public void comentarPostagem(Postagem postagem, String comentario) {
	        postagem.adicionarComentario(this, comentario);
	        System.out.println(nome + " comentou: " + comentario);
	    }
	}

