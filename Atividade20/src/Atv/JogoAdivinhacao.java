package Atv;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
	
    private int numeroSecreto; 
    private int tentativas;    

    public JogoAdivinhacao(int limite) {
        Random random = new Random();
        numeroSecreto = random.nextInt(limite) + 1; 
        tentativas = 0;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        int palpite;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Adivinhe o número entre 1 e 100:");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSecreto) {
                System.out.println("Seu palpite é maior que o número secreto. Tente novamente.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Seu palpite é menor que o número secreto. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSecreto);
    }

}
