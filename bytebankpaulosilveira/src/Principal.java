public class Principal {
    public static void main(String[] args) {

        // Cliente fernando = new Cliente();
        // fernando.nome = "Fernando Xavier";
        // fernando.cpf = "222.222.222-22";
        // fernando.profissão = "analista";


        

        Conta contaDoFernando = new Conta(); 
        
        contaDoFernando.setSaldo(1000);

        Cliente fernando = new Cliente();
        fernando.setNome("Fernando Xavier");

        contaDoFernando.setTitular(fernando);


        
        
        
        System.out.println("Saldo da conta do " + contaDoFernando.getTitular().getNome() + " é: " + contaDoFernando.getSaldo());

    }
}
