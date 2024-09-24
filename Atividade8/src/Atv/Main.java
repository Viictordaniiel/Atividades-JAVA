package Atv;

public class Main {
	
	public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");

        carro.exibirVelocidadeAtual();  
        carro.acelerar(40);             
        carro.exibirVelocidadeAtual();  
        carro.frear(15);               
        carro.exibirVelocidadeAtual();  
        carro.frear(30);                
        carro.exibirVelocidadeAtual();  
    }
}



