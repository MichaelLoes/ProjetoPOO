import java.util.Scanner;

public class MainLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Emprestar livro");
            System.out.println("2. Devolver livro");
            System.out.println("3. Verificar disponibilidade");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    emprestarLivro(scanner);
                    break;
                case 2:
                    devolverLivro(scanner);
                    break;
                case 3:
                    verificarDisponibilidade(scanner);
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        }
        scanner.close();
    }

    public static void emprestarLivro(Scanner scanner) {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o número de páginas do livro: ");
        int numPaginas = scanner.nextInt();
        scanner.nextLine(); 

        Livro livro = new Livro(titulo, autor, numPaginas);
        livro.emprestar();
    }

    public static void devolverLivro(Scanner scanner) {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o número de páginas do livro: ");
        int numPaginas = scanner.nextInt();
        scanner.nextLine(); 

        Livro livro = new Livro(titulo, autor, numPaginas);
        livro.devolver();
    }

    public static void verificarDisponibilidade(Scanner scanner) {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o número de páginas do livro: ");
        int numPaginas = scanner.nextInt();
        scanner.nextLine(); 

        Livro livro = new Livro(titulo, autor, numPaginas);
        boolean disponivel = livro.estaDisponivel();
        System.out.println("O livro está disponível? " + disponivel);
    }
}