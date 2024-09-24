package Atv;

import java.util.HashMap;

public class Banco {
	
    private HashMap<String, Cliente> clientes;
    private HashMap<String, ContaBancaria> contas;

    public Banco() {
        this.clientes = new HashMap<>();
        this.contas = new HashMap<>();
    }

    public void cadastrarCliente(String nome, String numeroConta) {
        if (!clientes.containsKey(numeroConta)) {
            Cliente novoCliente = new Cliente(nome, numeroConta);
            ContaBancaria novaConta = new ContaBancaria(numeroConta);
            clientes.put(numeroConta, novoCliente);
            contas.put(numeroConta, novaConta);
            System.out.println("Cliente " + nome + " cadastrado com sucesso.");
        } else {
            System.out.println("Conta com o número " + numeroConta + " já existe.");
        }
    }

    public void depositar(String numeroConta, double valor) {
        ContaBancaria conta = contas.get(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void sacar(String numeroConta, double valor) {
        ContaBancaria conta = contas.get(numeroConta);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void transferir(String numeroContaOrigem, String numeroContaDestino, double valor) {
        ContaBancaria contaOrigem = contas.get(numeroContaOrigem);
        ContaBancaria contaDestino = contas.get(numeroContaDestino);
        
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(contaDestino, valor);
        } else {
            System.out.println("Uma das contas não foi encontrada.");
        }
    }

    public void exibirSaldo(String numeroConta) {
        ContaBancaria conta = contas.get(numeroConta);
        if (conta != null) {
            System.out.println("Saldo da conta " + numeroConta + ": R$ " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.cadastrarCliente("João Silva", "12345");
        banco.cadastrarCliente("Maria Souza", "54321");

        banco.depositar("12345", 1000.0);
        banco.sacar("12345", 200.0);
        banco.exibirSaldo("12345");

        banco.transferir("12345", "54321", 300.0);
        banco.exibirSaldo("12345");
        banco.exibirSaldo("54321");
    }
}
