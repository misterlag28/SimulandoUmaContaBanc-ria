package projetinhos.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        //Nome do cliente.

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        //Sobrenome do cliente.


        System.out.println("Digite o nome da sua agência");
        String agência = scanner.next();
        //Agência que o cliente possui a conta.

        System.out.println("Digite o número da sua conta");
        int conta = scanner.nextInt();
        //Número da conta do cliente.

        System.out.println("Digite o saldo da sua conta");      
        double saldo = scanner.nextDouble();
        //Saldo disponível do cliente.

        System.out.println("Olá " + nome + " " + sobrenome + " obrigado por criar uma conta em nosso banco! ");
        System.out.println("Sua agência é, " + agência + " " + "sua conta é, " + conta + " e seu saldo " + saldo + " já está disponível para saque."); 
        //Mensagem automática após a criação da conta.
    

    }
}
