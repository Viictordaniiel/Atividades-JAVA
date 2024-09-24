package Atv;

import java.util.ArrayList;
import java.util.Collections;

public class JogoCarta {
	
	    private ArrayList<Carta> baralho;
	    private ArrayList<Jogador> jogadores;

	    public JogoCarta() {
	        this.baralho = new ArrayList<>();
	        this.jogadores = new ArrayList<>();
	        inicializarBaralho();
	    }

	    private void inicializarBaralho() {
	        String[] cores = {"Vermelho", "Azul", "Verde", "Amarelo"};
	        String[] valores = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Pular", "Inverter", "Mais 2"};

	        for (String cor : cores) {
	            for (String valor : valores) {
	                baralho.add(new Carta(cor, valor));
	                if (!valor.equals("0")) {
	                    baralho.add(new Carta(cor, valor));
	                }
	            }
	        }
	        baralho.add(new Carta("Curinga", "Troca Cor"));
	        baralho.add(new Carta("Curinga", "Mais 4"));
	        baralho.add(new Carta("Curinga", "Troca Cor"));
	        baralho.add(new Carta("Curinga", "Mais 4"));
	    }

	    public void embaralharCartas() {
	        Collections.shuffle(baralho);
	        System.out.println("Cartas embaralhadas.");
	    }

	    public void adicionarJogador(String nome) {
	        jogadores.add(new Jogador(nome));
	        System.out.println("Jogador " + nome + " adicionado ao jogo.");
	    }

	    public void distribuirCartas(int quantidadeCartas) {
	        for (Jogador jogador : jogadores) {
	            for (int i = 0; i < quantidadeCartas; i++) {
	                if (!baralho.isEmpty()) {
	                    jogador.adicionarCarta(baralho.remove(0));
	                }
	            }
	        }
	        System.out.println("Cartas distribuídas.");
	    }

	    public void exibirMaosJogadores() {
	        for (Jogador jogador : jogadores) {
	            jogador.exibirMao();
	        }
	    }

	    public void jogarCarta(Jogador jogador, Carta carta) {
	        if (jogador.getMao().contains(carta)) {
	            jogador.removerCarta(carta);
	            System.out.println(jogador.getNome() + " jogou " + carta);
	        } else {
	            System.out.println("Carta inválida. Jogador não possui essa carta.");
	        }
	        
	    }
}