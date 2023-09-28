import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da agência!");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta!");
        String conta = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ conta + " e seu saldo [" + saldo + "] já está disponível para saque.");
    }

}
