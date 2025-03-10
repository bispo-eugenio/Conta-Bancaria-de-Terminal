//Imports
import java.util.Scanner;
import java.util.Locale;

//Class
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Atributos
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Solicitando o número da agência
        System.out.println("Por favor, digite o número da agência.");
        numero = scanner.nextInt();
        //Quebra de linha
        scanner.nextLine(); 

        //Solicitando a agência
        System.out.println("Digite o número da agência, por favor.");
        agencia = scanner.nextLine();

        //Solicitando o nome do cliente
        System.out.println("Por favor, digite o seu nome completo.");
        nomeCliente = scanner.nextLine();

        //Solicitando o saldo da conta
        System.out.println("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        //Saída do programa
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo " + saldo + " já está disponível para saque.");
    }
}