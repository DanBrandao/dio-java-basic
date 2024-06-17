import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite a número da Conta no Banco: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite no número da Agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenomenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, insira seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + " " + sobrenome + ",obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}