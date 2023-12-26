import java.util.Scanner;

class Livro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean emprestado;

    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.emprestado = false;
    }

    public void emprestar() {
        if (!this.emprestado) {
            this.emprestado = true;
            System.out.println("O livro '" + this.titulo + "' foi emprestado.");
        } else {
            System.out.println("Desculpe, o livro '" + this.titulo + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (this.emprestado) {
            this.emprestado = false;
            System.out.println("O livro '" + this.titulo + "' foi devolvido.");
        } else {
            System.out.println("O livro '" + this.titulo + "' já está disponível.");
        }
    }

    public boolean estaDisponivel() {
        return !this.emprestado;
    }
}
