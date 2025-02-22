public class Heroi extends Personagem {
    // Superclass Personagem: private String nome; private int vidaTotal; private int vidaAtual; private int coins
    private String classe;
    private String race;
    private int level;
    private int exp;
    
    public Heroi(String nome, int vidaTotal, int vidaAtual, int coins, int dano, String classe, String race, int level) {
        super(nome, vidaTotal, vidaAtual, coins, dano);
        this.classe = classe;
        this.race = race;
        this.level = 1;
        this.exp = 0;
    }

    public void ganharExp(int quantidade) {
        this.exp += quantidade;

        while (this.exp >= (this.level*100)) {
            this.exp -= this.level*100;
            this.level++;
            // Subiu de nível!
        }
    }

    // setters
    // Tanto Classe como Raça deveria ter uma tabela, estudar como buscar dessa tabela, .txt daria talvez 
    public void setClasse(String classes) {
        classe = classes; // isso aqui ta uma merda
    }
    public void setRace(String races) {
        race = races; // isso aqui ta uma merda
    }
    public void setLevel(int lvl) {
        level = lvl; // isso aqui ta uma merda
    }
    public void setExp(int xp) {
        exp = xp; // isso aqui ta uma merda
    }
    
    // getters
    public String getClasse() {
        return classe;
    }
    public String getRace() {
        return race;
    }
    public int getLevel() {
        return level;
    }
    public int getExp() {
        return exp;
    }
}
