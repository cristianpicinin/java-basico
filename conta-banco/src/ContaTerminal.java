import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (//importando a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            //solicitando as imformacoes para o usuário
            System.out.println("Digite o número da conta: ");
            int conta = scanner.nextInt();
            
            System.out.println("Digite o número da agência: ");
            String agencia = scanner.next();

            System.out.println("Digite o seu nome completo: ");
            String nome = scanner.next();
            
            System.out.println("Digite seu saldo: ");
            double saldo = scanner.nextDouble();

            //imprimindo a mensagem na tela com os dados do usuário
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo "+ saldo +" já está disponível para saque");
        }
    }
}