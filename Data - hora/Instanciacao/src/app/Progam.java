package app;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Progam {

        public static void main(String[] args) {
            
            LocalDate d01 = LocalDate.now(); //mostra apenas a data
            LocalDateTime d02 = LocalDateTime.now(); // mostra data e hora no fuso local do sistema.
            Instant d03 = Instant.now(); // representa o tempo em UTC (Z), pelo mformato ISO 8601

            //parse() converte strings no formato ISO 8601 em objetos de data/hora.parse() converte strings no formato ISO 8601 em objetos de data/hora.
            LocalDate d04 = LocalDate.parse("2024-03-17");
            LocalDateTime d05 = LocalDateTime.parse("2024-03-17T00:05:47");
            Instant d06 = Instant.parse("2024-03-17T00:05:42Z");
            Instant d07 = Instant.parse("2024-03-17T00:05:47-03:00");

            LocalDate d08 = LocalDate.of(2024, 3, 17); //cria uma data especifica
            LocalDateTime d09 = LocalDateTime.of(2024,3,17,1,14);

            //quando você chama toString() em um Instant, ele sempre exibe a data e hora no formato ISO 8601 e em UTC.
            Instant now = Instant.now();
            System.out.println(now.toString()); 

            System.out.println(d01);
            System.out.println(d02);
            System.out.println(d03);
            System.out.println(d04);
            System.out.println(d05);
            System.out.println(d06);
            System.out.println(d07);
            System.out.println(d08);
            System.out.println(d09);
        }
}
