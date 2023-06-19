package Deving;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ProgramLocalDate01 {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.htm
		
		//Gera a data local
		LocalDate d01 = LocalDate.now();
		//Gera a data local com horario
		LocalDateTime d02 = LocalDateTime.now();
		//Gera a data-hora GMT
		Instant d03 = Instant.now();
		
        //Gera um ISO para datahora
        LocalDate d04 = LocalDate.parse("2023-06-01");
        LocalDateTime d05 = LocalDateTime.parse("2023-06-01T01:30:26");
        Instant d06 = Instant.parse("2023-06-01T01:30:26Z");
        Instant d07 = Instant.parse("2023-06-01T01:30:26-03:00");
        
        //Formatando um texto para DataHora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("01/06/2023", fmt1); // ou .format direto no print
        
        
        //Gera formato de datahora isoladamente
        LocalDate d10 = LocalDate.of(2023, 6, 1);
        LocalDateTime d11 = LocalDateTime.of(2023, 6, 1, 1, 30);
 
        //Formatando uma datahora para texto 
        LocalDate d12 = LocalDate.parse("2023-06-01");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Usado para formatar ZuluTime, e converte para o horario do sistema do usuario
        
        System.out.println("d12 = " + d12.format(fmt3));
        System.out.println("d12 = " + fmt3.format(d12));
        System.out.println("d05= " + d05.format(fmt4));
        System.out.println("d05= " + d05.format(fmt3));
        System.out.println("d06 = " + fmt5.format(d06)); 
        System.out.println("----------Converter datahora local para global---------");
        
        // ------------------------------------------------ //
        // Converter datahora local para global //
        
        
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        
        //Obtendo dados de uma data-hora local
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d05 mês =  " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());
        
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minute = " + d05.getMinute());
        
	}

}
