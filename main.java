import  java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do Heroi
        Heroi heroi = new Heroi();

        // Nome do Heroi
        System.out.println("Digite o nome do Heroi: ");
        heroi.setNome(scanner.nextLine());

        // Definindo raça do heroi
        System.out.println("Escolha uma raça: "); 
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // Humano
                heroi.setRaca(RacaEnum.HUMANO.getEscolhaRaca());
                heroi.setVidaMaxima(20);
                heroi.setVidaAtual(20);
                heroi.setVidaPorLvl(8);
                break;
            case 2:
                // Elfo
                heroi.setRaca(RacaEnum.ELFO.getEscolhaRaca());
                heroi.setVidaMaxima(20);
                heroi.setVidaAtual(20);
                heroi.setVidaPorLvl(8);
                break;
            case 3:
                // Orc
                heroi.setRaca(RacaEnum.ORC.getEscolhaRaca());
                heroi.setVidaMaxima(20);
                heroi.setVidaAtual(20);
                heroi.setVidaPorLvl(8);
                break;
            case 4:
                // Anão
                heroi.setRaca(RacaEnum.ANAO.getEscolhaRaca());
                heroi.setVidaMaxima(20);
                heroi.setVidaAtual(20);
                heroi.setVidaPorLvl(8);
                break;
            default:
                // Escolha inválida, volta pro Escolha uma raça;
                break;
        }
        
        // Definindo Classe do Heroi
        System.out.println("Escolha uma classe: ");
    }
}
