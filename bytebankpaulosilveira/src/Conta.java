public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;

        System.out.println("o novo saldo depois do deposito é: " + this.saldo);
    }

    public boolean sacar (double valor) { 

        if ( this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("o novo saldo após o saque: " + this.saldo);
            return true; 
            
        } else {
            return false;
        }
    }

    public boolean transfere (double valor, Conta destino) {
        System.out.println("iniciando tranferencia de " + valor);
        if (this.saldo >= valor) {
            this.saldo -= valor; 
            destino.depositar(valor);
            return true;
        }
        System.out.println("saldo da conta de origem: " + this.saldo);
        return false;
    }


}
