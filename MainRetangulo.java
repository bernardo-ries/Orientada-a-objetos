import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base, altura;

        System.out.println("Digite o base do retangulo: ");
        base = scanner.nextDouble();
        System.out.println("Digite o altura do retangulo: ");
        altura = scanner.nextDouble();
        Retangulo r = new Retangulo(base,altura);
        r.setBase(base);
        r.setAltura(altura);
        double area = r.calcularArea();
        System.out.println("Area do retangulo: " + area);

    }
}
