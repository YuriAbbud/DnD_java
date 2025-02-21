public class Heroi extends Personagem {
    // private String nome;
    // private int vidaTotal;
    // private int vidaAtual;
    private String classe;
    private String race;
    private int level;
    
    public Heroi(String nome, int vidaTotal, int vidaAtual, int coins, String classe, String race, int level) {
        super(nome, vidaTotal, vidaAtual, coins);
        this.classe = classe;
        this.race = race;
        this.level = 0; // Aqui você usa o parâmetro level corretamente
    }

}
