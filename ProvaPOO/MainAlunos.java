import java.util.Scanner;

public class MainAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a matrícula do aluno: ");
        int matricula = scanner.nextInt();
        System.out.println("Digite a nota 1 do aluno: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2 do aluno: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota 3 do aluno: ");
        double nota3 = scanner.nextDouble();
        scanner.close();

        Aluno aluno1 = new Aluno(nome, matricula, nota1, nota2, nota3);
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Situação: " + aluno1.verificarSituacao());
    }
}