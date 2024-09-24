package Atv;

public class Main {
	
	  public static void main(String[] args) {
	        Calendario calendario = new Calendario();

	        calendario.exibirCalendarioDoMes(9, 2023);

	        calendario.verificarFeriado(7, 9, 2023);  

	        calendario.calcularDiferencaDias(7, 9, 2023, 25, 12, 2023);  
	    }
	}


