package Atv;

import java.util.ArrayList;

public class Agenda {
	

	
	    private ArrayList<Contato> contatos;  

	    public Agenda() {
	        this.contatos = new ArrayList<>();
	    }

	    public void adicionarContato(String nome, String telefone) {
	        Contato contato = new Contato(nome, telefone);
	        contatos.add(contato);
	        System.out.println("Contato adicionado: " + contato);
	    }

	    public void editarContato(String nome, String novoNome, String novoTelefone) {
	        for (Contato contato : contatos) {
	            if (contato.getNome().equalsIgnoreCase(nome)) {
	                contato.setNome(novoNome);
	                contato.setTelefone(novoTelefone);
	                System.out.println("Contato atualizado: " + contato);
	                return;
	            }
	        }
	        System.out.println("Contato não encontrado: " + nome);
	    }

	    public void removerContato(String nome) {
	        for (Contato contato : contatos) {
	            if (contato.getNome().equalsIgnoreCase(nome)) {
	                contatos.remove(contato);
	                System.out.println("Contato removido: " + contato);
	                return;
	            }
	        }
	        System.out.println("Contato não encontrado: " + nome);
	    }

	    public Contato buscarPorNome(String nome) {
	        for (Contato contato : contatos) {
	            if (contato.getNome().equalsIgnoreCase(nome)) {
	                return contato;
	            }
	        }
	        return null;
	    }

	    public Contato buscarPorTelefone(String telefone) {
	        for (Contato contato : contatos) {
	            if (contato.getTelefone().equals(telefone)) {
	                return contato;
	            }
	        }
	        return null;
	    }

	    public void listarContatos() {
	        System.out.println("Lista de contatos:");
	        for (Contato contato : contatos) {
	            System.out.println(contato);
	        }
	    }
}

