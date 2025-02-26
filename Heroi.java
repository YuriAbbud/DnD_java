import  java.util.Scanner;

public class Heroi extends Personagem {
    Scanner scanner = new Scanner(System.in);
    private Raca raca;

    public Heroi() {
        System.out.println("Digite o nome do Heroi: ");
        setNome(scanner.nextLine());

        System.out.println("Escolha uma raça: ");
        System.out.println("1 - Humano | 2 - Elfo | 3 - Orc");
        int choice = scanner.nextInt();

        this.raca = Raca.escolherRaca(choice);

        setLevel(1);
        setExp(0);
    }

    public void subirLevel() {
        if (this.getExp() >= (this.getLevel() * 100)) {
            // Administra o XP
            this.setExp(getExp() - (this.getLevel() * 100));
            this.setLevel(this.getLevel() + 1);

            // Aumenta a vida máxima e soma metade da vida por lvl na vida atual
            // this.setVidaMaxima(this.getVidaMaxima() + this.raca.getVidaPorLvl());
            // this.setVidaAtual(this.getVidaAtual() + (this.raca.getVidaPorLvl() / 2));
        }
    }

    public void derrotarInimigo(Personagem Inimigo) {
        this.setExp(this.getExp() + Inimigo.getExp());
        this.subirLevel();
        this.setCoins(this.getCoins() + Inimigo.getCoins());
    }
}