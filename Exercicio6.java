import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite a temperatura em Graus Celsius: ");
        double Celsius = scanner.nextDouble();

        double Fahrenheit = (9 * Celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit e: " + Fahrenheit);

        scanner.close();
    }
}
