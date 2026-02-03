package banco.model;

public abstract class Conta {

    private int numero;
    private double saldo;
    private String titular;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // obriga as classes filhas a dizerem se o saque terá ou não taxa
    public abstract boolean sacar(double valor);

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
