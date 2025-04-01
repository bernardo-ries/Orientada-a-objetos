import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria c = new ContaBancaria();
        double saldo;
        double limite;
        double valor;

        System.out.println("Digite seu saldo: ");
        saldo = scanner.nextDouble();
        System.out.println("Digite seu limite: ");
        limite = scanner.nextDouble();
        System.out.println("Digite o valor que deseja sacar: ");
        valor = scanner.nextDouble();

        c.setSaldo(saldo);
        c.setLimite(limite);
        c.saque(valor);
    }
}
