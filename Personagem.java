public abstract class Personagem {
    private int vidaMaxima, vidaAtual, dano, exp, coins, level;
    private String nome;

    // getters
    public int getVidaMaxima() {
        return this.vidaMaxima;
    }

    public int getVidaAtual() {
        return this.vidaAtual;
    }

    public int getDano() {
        return this.dano;
    }

    public int getExp() {
        return this.exp;
    }

    public int getCoins() {
        return this.coins;
    }

    public int getLevel() {
        return this.level;
    }

    public String getNome() {
        return this.nome;
    }

    // setters
    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // funções
    public void atacar(Personagem alvo) {
        alvo.setVidaAtual(alvo.getVidaAtual() - this.dano);
        if (alvo.getVidaAtual() <= 0) {
            // Morreu
        }
    }
}