package Atv;

public class Main {
	
	public static void main(String[] args) {
        JogoCarta jogo = new JogoCarta();

        jogo.adicionarJogador("João");
        jogo.adicionarJogador("Maria");

        jogo.embaralharCartas();

        jogo.distribuirCartas(7);

        jogo.exibirMaosJogadores();

        Jogador joao = jogo.jogadores.get(0);  
        Carta cartaJogada = joao.getMao().get(0);  
        jogo.jogarCarta(joao, cartaJogada);

        jogo.exibirMaosJogadores();
    }
}
	