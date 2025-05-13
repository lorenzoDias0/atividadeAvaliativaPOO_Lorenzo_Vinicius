import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Personagem {
    public enum TipoPersonagem {
        MAGO("mago"),
        GUERREIRO("guerreiro"),
        ARQUEIRO("arqueiro");
    
        private String descricao;
    
        TipoPersonagem(String descricao) {
            this.descricao = descricao;
        }
    
        public String getDescricao() {
            return descricao;
        }   
    }

    private String nome;
    private TipoPersonagem tipo;
    private Integer vida;    
    private Double forca;
    private LocalDateTime criadoEm;    

    public Personagem(String nome, TipoPersonagem tipo, Integer vida, Double forca) {
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.forca = forca;
        this.criadoEm = LocalDateTime.now();
    }
    
    public Personagem() {
        this.nome = null;
        this.tipo = null;
        this.vida = null;
        this.forca = null;
        this.criadoEm = null;
        //this.criadoEm = LocalDateTime.MIN;
    }

    public void exibirStatus() {
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Personagem criado:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo.getDescricao());
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
        System.out.println("Criado em: " + criadoEm.format(dataFormatada));
    }
    
}
