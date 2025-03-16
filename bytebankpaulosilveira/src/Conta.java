public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;

        System.out.println("o novo saldo depois do deposito é: " + this.saldo);
    }

    public boolean sacar(double valor) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("o novo saldo após o saque: " + this.saldo);
            return true;

        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
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
