/*
Strength: Força
Dexterity: Destreza
Constitution: Constituição
Wisdom: Sabedoria
Intelligence: Inteligência
Charisma: Carisma

modificador : (atributo - 10) / 2
*/

public abstract class Attributes {
    private int strength;
    private int dexterity;
    private int constitution;
    private int wisdom;
    private int intelligence;
    private int charisma;

    public int modAttribute(int att) {
        return ((att - 10) / 2);
    }
}