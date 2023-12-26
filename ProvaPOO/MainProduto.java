public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Produto X", 10.5, 0); // Use the optional constructor here

        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());

        System.out.println("Valor total em estoque: R$" + produto.calcularValorTotalEstoque());
        System.out.println("Disponível em estoque? " + produto.isDisponivel());
    }
}
