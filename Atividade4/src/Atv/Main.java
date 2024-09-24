package Atv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o número de notas: ");
        int numeroDeNotas = scanner.nextInt();
        double[] notas = new double[numeroDeNotas];

        for (int i = 0; i < numeroDeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        Aluno aluno = new Aluno(nome, matricula, notas);

        aluno.exibirInformacoes();

        scanner.close();
    }
}



