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
                heroi.setRaca(RacaEnum.HUMANO.getEscolhaRaca());
                break;
            case 2:
                heroi.setRaca(RacaEnum.HUMANO.getEscolhaRaca());
                break;
            case 3:
                heroi.setRaca(RacaEnum.HUMANO.getEscolhaRaca());
                break;
            case 4:
                heroi.setRaca(RacaEnum.HUMANO.getEscolhaRaca());
                break;
            default:
                break;
        }
        
        // Definindo Classe do Heroi
        System.out.println("Escolha uma classe: ");
    }
}
