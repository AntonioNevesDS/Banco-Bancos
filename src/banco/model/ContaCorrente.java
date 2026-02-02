package banco.model;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, String titular, double limite) {
        // O super chama o construtor da classe pai
        super(numero, titular); 
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = 2.0; 
        double valorTotal = valor + taxa;

        if (this.getSaldo() + limite >= valorTotal) {
            // Atualiza o saldo usando o método da classe mãe
            this.setSaldo(this.getSaldo() - valorTotal);
            System.out.println("Saque realizado com taxa de R$ 2,00");
            return true;
        }
        
        System.out.println("Saldo insuficiente, mesmo com limite.");
        return false;
    }
}