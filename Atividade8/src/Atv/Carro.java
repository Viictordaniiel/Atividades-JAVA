package Atv;

public class Carro {
	
	    private String marca;
	    private String modelo;
	    private double velocidadeAtual;

	    public Carro(String marca, String modelo) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.velocidadeAtual = 0.0;  
	    }

	    public void acelerar(double incremento) {
	        if (incremento > 0) {
	            velocidadeAtual += incremento;
	            System.out.println("O carro acelerou " + incremento + " km/h.");
	        } else {
	            System.out.println("Valor de aceleração inválido.");
	        }
	    }

	    public void frear(double decremento) {
	        if (decremento > 0) {
	            velocidadeAtual -= decremento;
	            if (velocidadeAtual < 0) {
	                velocidadeAtual = 0;  
	            }
	            System.out.println("O carro desacelerou " + decremento + " km/h.");
	        } else {
	            System.out.println("Valor de frenagem inválido.");
	        }
	    }

	    public void exibirVelocidadeAtual() {
	        System.out.println("A velocidade atual do carro é: " + velocidadeAtual + " km/h.");
	    }
}
