public class Principal {
    public static void main(String[] args) {

        // Cliente fernando = new Cliente();
        // fernando.nome = "Fernando Xavier";
        // fernando.cpf = "222.222.222-22";
        // fernando.profissão = "analista";


        Conta contaDoFernando = new Conta(); 
        contaDoFernando.titular = new Cliente();
        contaDoFernando.saldo = 1000;
        
        
        System.out.println("Saldo da conta do " + contaDoFernando.titular.nome  + " é: " + contaDoFernando.saldo);


        contaDoFernando.depositar(1000);
        contaDoFernando.sacar(500);
        contaDoFernando.sacar(2500);

        contaDoFernando.saldo -= 11000;
        System.out.println(contaDoFernando.saldo);
    }
}
