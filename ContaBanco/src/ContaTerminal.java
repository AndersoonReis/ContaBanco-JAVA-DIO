import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta:");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente:");
        String nome = scanner.next();

        System.out.println("Por favor, digite saldo da conta: ");
        String saldo = scanner.next();

        scanner.close();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque!",nome,agencia,numeroAgencia,saldo));
    } 
}
