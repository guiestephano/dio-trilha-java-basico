import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Por favor insira os dados do cliente -----");
        System.out.print("Nome do cliente: ");
        nomeCliente = sc.nextLine();
        System.out.print("Número da agência: ");
        agencia = sc.next();
        System.out.print("Número da conta: ");
        numero = sc.nextInt();
        System.out.print("Valor do saldo: ");
        saldo = sc.nextDouble();
        System.out.println("--------------------------------------------------");
        System.out.printf("%nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n",nomeCliente,agencia,numero,saldo);

        sc.close();
    }
}
