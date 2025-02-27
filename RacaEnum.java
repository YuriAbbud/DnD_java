public enum RacaEnum {
    HUMANO("Humano"), ELFO("Elfo"), ORC("Orc"), ANAO("Anão");

    private String choice;

    RacaEnum(String choice) {
        this.choice = choice;
    }

    public String getEscolhaRaca() {
        return this.choice;
    }
}