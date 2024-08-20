import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Usuario {

    public static void main(String[] args) {


        ContaTerminal contaTerminal = new ContaTerminal();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, digite o número de conta: ");
        int numeroDeConta = scanner.nextInt();
        contaTerminal.numero(numeroDeConta);


        System.out.println("Por favor, digite o número da agência: " );
        String numeroAg = scanner.next();
        contaTerminal.informarAgencia(numeroAg);


        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();
        contaTerminal.incluirNome(nome);


        System.out.println("Por favor, digite o valor para despositar: ");
        float saldoConta = scanner.nextFloat();
        contaTerminal.depositar(saldoConta);




        System.out.println("Olá " +contaTerminal.nomeClinete + " , obrigada por criar uma conta em nosso banco, sua agência é " + contaTerminal.agencia + " , conta " + contaTerminal.numero + " e eu saldo " + contaTerminal.saldo + " já está disponivel para saque.");

        scanner.close();
    }
}
