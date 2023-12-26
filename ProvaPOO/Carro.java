class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int incremento) {
        this.velocidadeAtual += incremento;
    }

    public void frear(int reducao) {
        if (this.velocidadeAtual - reducao >= 0) {
            this.velocidadeAtual -= reducao;
        } else {
            this.velocidadeAtual = 0;
        }
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade atual: " + this.velocidadeAtual);
    }
}