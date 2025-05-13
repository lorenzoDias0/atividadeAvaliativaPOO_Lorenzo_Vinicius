import java.time.LocalDate;

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
    private LocalDate criadoEm;    

    public Personagem(String nome, TipoPersonagem tipo, Integer vida, Double forca) {
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.forca = forca;
        this.criadoEm = LocalDate.now();
    }

    public void exibirStatus() {
        System.out.println("Personagem criado:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
        System.out.println("Criado em: " + criadoEm);
    }
    
}
