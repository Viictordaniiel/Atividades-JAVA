package Atv;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

public class Calendario {
	
    private Set<LocalDate> feriados;

    public Calendario() {
        feriados = new HashSet<>();
        inicializarFeriados();
    }

    private void inicializarFeriados() {
        feriados.add(LocalDate.of(LocalDate.now().getYear(), 1, 1));  
        feriados.add(LocalDate.of(LocalDate.now().getYear(), 4, 21));
        feriados.add(LocalDate.of(LocalDate.now().getYear(), 5, 1));  
        feriados.add(LocalDate.of(LocalDate.now().getYear(), 9, 7));  
        feriados.add(LocalDate.of(LocalDate.now().getYear(), 10, 12)); 
        feriados.add(LocalDate.of(LocalDate.now().getYear(), 11, 15)); 
        feriados.add(LocalDate.of(LocalDate.now().getYear(), 12, 25)); 
    }

    public void exibirCalendarioDoMes(int mes, int ano) {
        System.out.println("Calendário de " + Month.of(mes) + " de " + ano + ":");
        for (int dia = 1; dia <= Month.of(mes).length(LocalDate.of(ano, mes, 1).isLeapYear()); dia++) {
            LocalDate data = LocalDate.of(ano, mes, dia);
            System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + (feriados.contains(data) ? " - Feriado" : ""));
        }
    }

    public boolean verificarFeriado(int dia, int mes, int ano) {
        LocalDate data = LocalDate.of(ano, mes, dia);
        if (feriados.contains(data)) {
            System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " é feriado.");
            return true;
        } else {
            System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " não é feriado.");
            return false;
        }
    }

    public long calcularDiferencaDias(int dia1, int mes1, int ano1, int dia2, int mes2, int ano2) {
        LocalDate data1 = LocalDate.of(ano1, mes1, dia1);
        LocalDate data2 = LocalDate.of(ano2, mes2, dia2);
        long diferenca = ChronoUnit.DAYS.between(data1, data2);
        System.out.println("Diferença entre " + data1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                " e " + data2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " é de " + diferenca + " dias.");
        return diferenca;
    }

}
