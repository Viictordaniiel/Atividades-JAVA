package Atv;

public class Funcionario {

    private String nome;
    private double salarioBruto;
    private String cargo;

    public Funcionario(String nome, double salarioBruto, String cargo) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.cargo = cargo;
    }

    public double calcularSalarioLiquido(double descontoImpostos, double beneficios) {
        return salarioBruto - descontoImpostos + beneficios;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public String getCargo() {
        return cargo;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário Bruto: R$ " + salarioBruto);
    }
}

