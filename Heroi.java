import  java.util.Scanner;

public class Heroi extends Personagem {
    Scanner scanner = new Scanner(System.in);
    private Raca raca;

    public Heroi() {
        System.out.println("Digite o nome do Heroi: ");
        setNome(scanner.nextLine());

        System.out.println("Escolha uma raça: ");
        // Precisa ser uma classe? Da pra ser um mapa e boa boa
        // switch case para escolher raça e criar apenas o espaço necessário 

        System.out.println("Escolha uma classe: ");

        setVidaAtual(raca.getVidaInicial());
        setVidaMaxima(raca.getVidaInicial());
        setLevel(1);
        setExp(0);
    }

    public void subirLevel() {
        if (this.getExp() >= (this.getLevel() * 100)) {
            // Administra o XP
            this.setExp(getExp() - (this.getLevel() * 100));
            this.setLevel(this.getLevel() + 1);

            // Aumenta a vida máxima e soma metade da vida por lvl na vida atual
            this.setVidaMaxima(this.getVidaMaxima() + this.raca.getVidaPorLvl());
            this.setVidaAtual(this.getVidaAtual() + (this.raca.getVidaPorLvl() / 2));
        }
    }

    public void derrotarInimigo(Personagem Inimigo) {
        this.setExp(this.getExp() + Inimigo.getExp());
        this.subirLevel();
        this.setCoins(this.getCoins() + Inimigo.getCoins());
    }
}