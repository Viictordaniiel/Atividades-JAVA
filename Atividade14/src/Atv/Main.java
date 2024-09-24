package Atv;

public class Main {
	
	   public static void main(String[] args) {
	        Agenda agenda = new Agenda();

	      
	        agenda.adicionarContato("João", "1234-5678");
	        agenda.adicionarContato("Maria", "8765-4321");

	        agenda.listarContatos();

	        Contato contatoEncontrado = agenda.buscarPorNome("Maria");
	        if (contatoEncontrado != null) {
	            System.out.println("Contato encontrado: " + contatoEncontrado);
	        } else {
	            System.out.println("Contato não encontrado.");
	        }

	        agenda.editarContato("João", "João Silva", "9999-8888");

	        agenda.removerContato("Maria");

	        agenda.listarContatos();
	    }
	}
	


