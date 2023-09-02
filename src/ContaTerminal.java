import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String args[]){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome!");
        String nome = scanner.next();
        System.out.println("Digite sua agência");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();

        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(10000);
        System.out.println("Bem vindo " + nome+
                ", obrigado por criar uma conta em nosso banco, sua agência é: "+ agencia
                    + ", Conta: " + numero + " e seu saldo é de: " + rand_int1);

    }


}
