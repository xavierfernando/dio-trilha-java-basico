public class Principal {
    public static void main(String[] args) {
        Conta primeiraaConta = new Conta();
        primeiraaConta.saldo = 200;
        System.out.println(primeiraaConta.saldo);

        primeiraaConta.saldo += 1000;
        System.out.println(primeiraaConta.saldo);

        Conta segundaConta = primeiraaConta;
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem: " + primeiraaConta.saldo);
        System.out.println("segunda conta tem: " + segundaConta.saldo);

        System.out.println("referencia de memoria da primeira conta: " + primeiraaConta);
        System.out.println("referencia de memoria da primeira conta: " + segundaConta);

        primeiraaConta.depositar(50);

        boolean resultadoSaque = primeiraaConta.sacar(20);
        System.out.println("Resultado do saque: " + resultadoSaque);

        resultadoSaque = primeiraaConta.sacar(30);
        System.out.println("Resultado do saque: " + resultadoSaque);

        Conta contaFernando = new Conta(); 
        contaFernando.saldo = 1000;


        System.out.println("saldo da conta primeira conta antes da transferencia: " + primeiraaConta.saldo);

        System.out.println("saldo da conta do fernando antes da transferencia: " + contaFernando.saldo);

        boolean resultadoTransferencia = primeiraaConta.transfere(5, contaFernando) ;

        if (resultadoTransferencia) {
            System.out.println("Saque realizado com sucesso");            
        } else {
            System.out.println("Saldo insuficiente");
        }




        System.out.println("saldo após transferencia primeira conta: " + primeiraaConta.saldo);

        System.out.println("saldo após transferencia - conta Fernando: " + contaFernando.saldo);










    }
}
