class ContaPoupancaEspecial extends ContaPoupanca {

    public double limite = 1000;

    ContaPoupancaEspecial(double saldo) {
        super(saldo);
    }
    public void saque(double valor) {
        if (saldo + limite > valor) saldo -= valor;
    }
}
