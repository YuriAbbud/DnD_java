public class Personagem {
    private String nome;
    private int vidaTotal;
    private int vidaAtual;
    private int coins;
    private int dano;

    public Personagem(String nome, int vidaTotal, int vidaAtual, int coins, int dano) {
        this.nome = nome;
        this.vidaTotal = vidaTotal;
        this.vidaAtual = vidaAtual;
        this.coins = coins;
        this.dano = dano;
    }

    public void atacar(Personagem alvo, int dano) {
        alvo.vidaAtual -= dano;

        if (alvo.vidaAtual < 0) {
            // Morreu
        }
    }

    // setters - definem como a variavel vai receber o valores, pensar em como fazer o vidaAtual
    public void setNome(String heroiNome) {
        nome = heroiNome;
    }
    public void setVidaTotal(int maxVida) {
        vidaTotal = maxVida;
    }
    public void setVidaAtual(int vida, int dano) {
        vidaAtual -= dano;
    }
    public void setCoins(int coin) {
        coins += coin;
    }
    public void setDano(int danos) {
        dano = danos;
    }

    // getters - retorna os valores da variavel desejada, no caso do inimigo, teriamos uma tabela com o nome deles (algo genérico como Ladrão, Elfo-Negro ou sla), estudar em como pegar o valor da tabela
    public String getNome() {
        return nome;
    }
    public int getVidaTotal() {
        return vidaTotal;
    }
    public int getVidaAtual() {
        return vidaAtual;
    }
    public int getCoins() {
        return coins;
    }
    public int getDano() {
        return dano;
    }

}
