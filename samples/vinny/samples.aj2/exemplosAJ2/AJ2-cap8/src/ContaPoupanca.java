public class ContaPoupanca {
    protected double saldo;

    public ContaPoupanca(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public final void saque(double valor) {
        if (saldo > valor)
            saldo -= valor;
        else
            System.out.println("Saldo insuficiente");
    }
}
