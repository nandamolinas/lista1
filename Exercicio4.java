import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double Numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double Numero2 = scanner.nextDouble();

        double soma = Numero1 + Numero2;
        double subtracao = Numero1 - Numero2;
        double multiplicacao = Numero1 * Numero2;
        double divisao = Numero1 / Numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);

        scanner.close();
    }
}
