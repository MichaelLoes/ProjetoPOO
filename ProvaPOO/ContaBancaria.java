public class ContaBancaria {
    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;
    private boolean contaFechada;

    public ContaBancaria(int numeroDaConta, String nomeDoTitular, double saldoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldoInicial;
        this.contaFechada = false;
    }

    // Getter methods
    public int getNumeroDaConta() { return numeroDaConta; }
    public String getNomeDoTitular() { return nomeDoTitular; }
    public double getSaldo() { return saldo; }

    // Depositar método
    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.println("Depósito realizado com sucesso! Novo Saldo: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Sacar método
    public void sacar(double valorSaque) {
        if (valorSaque > 0 && valorSaque <= saldo && !contaFechada) {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso! Novo Saldo: " + saldo);
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
    }

    // Fechar Conta método
    public void fecharConta() {
        if (!contaFechada) {
            System.out.println("Conta fechada com sucesso!");
            contaFechada = true;
        } 
    }
}