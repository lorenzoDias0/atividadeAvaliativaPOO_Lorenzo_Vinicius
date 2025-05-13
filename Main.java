import java.util.Scanner;

public class Main {
    final static Scanner INPUT = new Scanner(System.in);
    public static void main(String[] args) {

        try {
            System.out.print("Digite o nome do personagem: ");
            String nome = INPUT.nextLine();

            System.out.print("Escolha o tipo (GUERREIRO, MAGO, ARQUEIRO): ");
            String tipoInput = INPUT.nextLine().toUpperCase();
            Personagem.TipoPersonagem tipo = Personagem.TipoPersonagem.valueOf(tipoInput);

            System.out.print("Digite a vida (número inteiro): ");
            Integer vida = Integer.parseInt(INPUT.nextLine());

            System.out.print("Digite a força (número decimal): ");
            Double forca = Double.parseDouble(INPUT.nextLine());

            Personagem p = new Personagem(nome, tipo, vida, forca);
            p.exibirStatus();

        }catch (IllegalArgumentException e) {
            System.out.println("Tipo de personagem inválido.\n\nLog do ERRO:");
            //main(args);
            throw e;
        }finally{
            System.out.println("\nFinalizando tentativa de criação do personagem.");
        }
    }
}
