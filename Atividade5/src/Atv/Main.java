package Atv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o cargo do funcionário: ");
        scanner.nextLine(); 
        String cargo = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, cargo);

        funcionario.exibirInformacoes();

        System.out.print("Digite o valor dos descontos (impostos): ");
        double descontoImpostos = scanner.nextDouble();

        System.out.print("Digite o valor dos benefícios: ");
        double beneficios = scanner.nextDouble();

        double salarioLiquido = funcionario.calcularSalarioLiquido(descontoImpostos, beneficios);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
