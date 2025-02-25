public class Raca {
    private final int vidaPorLvl;
    private final int vidaInicial;
    private final String nome;

    public Raca(String nome, int vidaPorLvl, int vidaInicial) {
        this.nome = nome;
        this.vidaPorLvl = vidaPorLvl;
        this.vidaInicial  = vidaInicial;
    }

    public int getVidaPorLvl() {
        return this.vidaPorLvl;
    }

    public int getVidaInicial() {
        return this.vidaInicial;
    }

    public String getRacaNome() {
        return this.nome;
    }

    public static Raca[] getRacaTipo() {
        return new Raca[] {
            new Raca("Humano", 10, 100),
            new Raca("Elfo", 8, 80),
            new Raca("Anão", 12, 120)
        };
    }
}