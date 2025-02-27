
public class Heroi extends Personagem {
    private int vidaPorLvl;

    public Heroi() {
        setLevel(1);
        setExp(0);
        setCoins(100);
    }

    public int getVidaPorLvl() {
        return vidaPorLvl;
    }

    public void setVidaPorLvl(int vidaPorLvl) {
        this.vidaPorLvl = vidaPorLvl;
    }

    public void subirLevel() {
        if (this.getExp() >= (this.getLevel() * 100)) {
            // Administra o XP
            this.setExp(getExp() - (this.getLevel() * 100));
            this.setLevel(this.getLevel() + 1);

            // Aumenta a vida máxima e soma metade da vida por lvl na vida atual
            this.setVidaMaxima(this.getVidaMaxima() + this.getVidaPorLvl());
            this.setVidaAtual(this.getVidaAtual() + (this.getVidaPorLvl() / 2));
        }
    }

    public void derrotarInimigo(Personagem Inimigo) {
        this.setExp(this.getExp() + Inimigo.getExp());
        this.subirLevel();
        this.setCoins(this.getCoins() + Inimigo.getCoins());
    }
}