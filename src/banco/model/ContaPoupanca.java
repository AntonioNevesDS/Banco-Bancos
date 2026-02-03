package banco.model;

public class ContaPoupanca extends Conta {
       
    public ContaPoupanca(int numero, String titular) {
        super(numero,titular);
    }

    @Override
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
        System.out.println("Saque de R$ " + valor  +  " realizado com sucesso (sem taxas).");
            return true;
        }

    System.out.println("Saldo insuficiente para poupança.");
       return false;
    }

    public void aplicarRendimento(double taxaPercentual) {
        double rendimento = this.getSaldo() * (taxaPercentual / 100);
        this.depositar(rendimento);
        System.out.println("Rendimento de " +  taxaPercentual + " % aplicado. Novo saldo: R$ " +  this.getSaldo());
        
    }

}

