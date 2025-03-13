package br.fxm.contabanco.modelos;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        public int numeroConta = 0;
        public String agencia = ""; 
        public String NomeCliente = ""
        public double Saldo = 0;
        
        
        public void obtemDadosConta() {
            
            Scanner teclado = new Scanner(System.in);
            System.out.print("Por favor digite o numero da agencia: ");
            agencia = teclado.nextInt();


        }

        public void exibeInforcacoesConta() {
            System.out.println("A agencia informada foi: " + agencia);
        }
 
    }

}

