import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main{
final static Scanner INPUT = new Scanner(System.in);
    public static void main(String[] args) {
        LocalDate data = LocalDate.MAX;
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Ditige uma data seguindo o padrão(dd/MM/yyyy), inclua as barras (/): ");
        String usuarioData = INPUT.nextLine();
        
        try {
            data = LocalDate.parse(usuarioData, formatador);
            String formattedDate = data.format(formatador);
            System.out.println(formattedDate);
        } catch (Exception e) {
            System.out.println("Erro!!!\n--Você digitou a data com o formato errado--");
            main(args);
        }
    }
}