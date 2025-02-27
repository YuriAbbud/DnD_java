public enum Raca {
    HUMANO("Humano", 10, 100),
    ELFO("Elfo", 8, 80),
    ORC("Orc", 12, 120);

    private final String nome;
    private final int vidaPorLvl;
    private final int vidaInicial;

    Raca(String nome, int vidaPorLvl, int vidaInicial) {
        this.nome = nome;
        this.vidaPorLvl = vidaPorLvl;
        this.vidaInicial = vidaInicial;
    }

    public String getNome() {
        return nome;
    }

    public int getVidaPorLvl() {
        return vidaPorLvl;
    }

    public int getVidaInicial() {
        return vidaInicial;
    }

    public static Raca escolherRaca(int escolha) {
        switch (escolha) {
            case 1: return HUMANO;
            case 2: return ELFO;
            case 3: return ORC;
            default:
            System.out.println("TEM Q TER UM DEFAULT");
            return HUMANO;
        }
    }

    // private final int vidaPorLvl;
    // private final int vidaInicial;
    // private final String nome;

    // public Raca(String nome, int vidaPorLvl, int vidaInicial) {
    //     this.nome = nome;
    //     this.vidaPorLvl = vidaPorLvl;
    //     this.vidaInicial  = vidaInicial;
    // }

    // public int getVidaPorLvl() {
    //     return this.vidaPorLvl;
    // }

    // public int getVidaInicial() {
    //     return this.vidaInicial;
    // }

    // public String getRacaNome() {
    //     return this.nome;
    // }

    // public static Raca[] getRacaTipo() {
    //     return new Raca[] {
    //         new Raca("Humano", 10, 100),
    //         new Raca("Elfo", 8, 80),
    //         new Raca("Anão", 12, 120)
    //     };
    // }
}