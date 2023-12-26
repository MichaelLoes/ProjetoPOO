import java.util.Scanner;

public class MainConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria(56153-9, "João Silva", 1000);
        
        while (true) {
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Fechar Conta e Sair");
            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 3:
                    minhaConta.fecharConta();
                    System.out.println("Conta fechada");
                    return;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
    }
}