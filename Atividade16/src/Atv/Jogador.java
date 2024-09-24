package Atv;

import java.util.ArrayList;

public class Jogador {
	
	    private String nome;
	    private ArrayList<Carta> mao;

	    public Jogador(String nome) {
	        this.nome = nome;
	        this.mao = new ArrayList<>();
	    }

	    public String getNome() {
	        return nome;
	    }

	    public ArrayList<Carta> getMao() {
	        return mao;
	    }

	    public void adicionarCarta(Carta carta) {
	        mao.add(carta);
	    }

	    public void removerCarta(Carta carta) {
	        mao.remove(carta);
	    }

	    public void exibirMao() {
	        System.out.println(nome + " tem as seguintes cartas:");
	        for (Carta carta : mao) {
	            System.out.println("- " + carta);
	        }
	    }

	    public boolean temCartas() {
	        return !mao.isEmpty();
	    }
	}

