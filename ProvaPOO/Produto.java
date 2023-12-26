public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            this.quantidadeEstoque = 0;
        }
    }

   
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    
    public double calcularValorTotalEstoque() {
        return quantidadeEstoque * preco;
    }

    public boolean isDisponivel() {
        return quantidadeEstoque > 0;
    }
}