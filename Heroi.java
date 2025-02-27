import  java.util.Scanner;

public class Heroi extends Personagem {
    Scanner scanner = new Scanner(System.in);

    public Heroi() {
        setVidaAtual(20);
        setVidaMaxima(20);
        setLevel(1);
        setExp(0);
    }

    public void subirLevel() {
        if (this.getExp() >= (this.getLevel() * 100)) {
            // Administra o XP
            this.setExp(getExp() - (this.getLevel() * 100));
            this.setLevel(this.getLevel() + 1);

            // Aumenta a vida máxima e soma metade da vida por lvl na vida atual
            this.setVidaMaxima(this.getVidaMaxima() + 10);
            this.setVidaAtual(this.getVidaAtual() + (10 / 2));
        }
    }

    public void derrotarInimigo(Personagem Inimigo) {
        this.setExp(this.getExp() + Inimigo.getExp());
        this.subirLevel();
        this.setCoins(this.getCoins() + Inimigo.getCoins());
    }
}