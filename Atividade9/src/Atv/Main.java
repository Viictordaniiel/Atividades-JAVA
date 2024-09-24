package Atv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do paciente: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        Paciente paciente = new Paciente(nome, idade);

        String consulta;
        String continuar;
        do {
            System.out.print("Digite uma consulta para o histórico do paciente: ");
            consulta = scanner.nextLine();
            paciente.adicionarConsulta(consulta);

            System.out.print("Deseja adicionar mais uma consulta? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        paciente.exibirConsultas();

        scanner.close();
    }
}
