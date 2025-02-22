// O inimigo não vai ter tanta complexidade por enquanto, ele tem q sofrer e dar dano.
// Quando morrer, tem q dar coins e exp

public class Inimigo extends Personagem {
    // Superclass Personagem: private String nome; private int vidaTotal; private int vidaAtual; private int coins
    private int exp;

    public Inimigo(String nome, int vidaTotal, int vidaAtual, int coins, int dano) {
        super(nome, vidaTotal, vidaAtual, coins, dano); // Se o inimigo não for se curar, vidaTotal e vidaAtual é sem sentido 
        this.exp = 0; // Teria q criar com o xp, estudar sobre como buscar dados de uma tabela o .txt
    }
    
    // setters
    public void setExp(int xp) {
        exp = xp;
    }

    // getters
    public int getExp() {
        return exp;
    }
}