package Atv;

public class Triangulo {
	

	    private double lado1;
	    private double lado2;
	    private double lado3;

	    public Triangulo(double lado1, double lado2, double lado3) {
	        this.lado1 = lado1;
	        this.lado2 = lado2;
	        this.lado3 = lado3;
	    }

	    public boolean ehValido() {
	        return (lado1 + lado2 > lado3) && 
	               (lado1 + lado3 > lado2) && 
	               (lado2 + lado3 > lado1);
	    }

	    public double calcularArea() {
	        if (!ehValido()) {
	            System.out.println("Os lados não formam um triângulo válido.");
	            return 0;
	        }

	        double s = (lado1 + lado2 + lado3) / 2;

	        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	    }

	    public void exibirInformacoes() {
	        if (ehValido()) {
	            System.out.println("O triângulo é válido.");
	            System.out.println("Área do Triângulo: " + calcularArea());
	        } else {
	            System.out.println("O triângulo não é válido.");
	        }
	    }

	  
	}



