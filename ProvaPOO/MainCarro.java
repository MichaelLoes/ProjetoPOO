import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.print("Insira o modelo do carro: ");
        String modelo = scanner.nextLine();

        Carro meuCarro = new Carro(marca, modelo);

        System.out.println("\nDetalhes do Carro:");
        meuCarro.exibirDetalhes();

        int opcao;

        do {
            System.out.println("\nEscolha a ação:");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Parar");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira o valor para acelerar: ");
                    int valorAcelerar = scanner.nextInt();
                    meuCarro.acelerar(valorAcelerar);
                    System.out.println("Velocidade atual do carro: " + meuCarro.getVelocidadeAtual());
                    break;
                case 2:
                    System.out.print("Insira o valor para frear: ");
                    int valorFrear = scanner.nextInt();
                    meuCarro.frear(valorFrear);
                    System.out.println("Velocidade atual do carro após frear: " + meuCarro.getVelocidadeAtual());
                    break;
                case 3:
                    System.out.println("Parando o carro...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 3);

        System.out.println("Carro parado.");

        scanner.close();
    }
}