public abstract class Personagem {
    private int vidaMaxima, vidaAtual, dano, exp, coins, level;
    private int forca, destreza, constituicao, sabedoria, inteligencia, carisma = 0;
    private String nome, raca;

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

    public String getRaca() {
        return raca;
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

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    // funções
    public void atacar(Personagem alvo) {
        alvo.setVidaAtual(alvo.getVidaAtual() - this.dano);
        if (alvo.getVidaAtual() <= 0) {
            // Morreu
            return;
        }
    }
}