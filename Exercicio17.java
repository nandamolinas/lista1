import java.util.Scanner;

public class Exercicio17 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double Nota1 = scanner.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double Nota2 = scanner.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double Nota3 = scanner.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();

        double mediaPonderada = (Nota1 * peso1 + Nota2 * peso2 + Nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("Media ponderada: " + mediaPonderada);

        scanner.close();
    }
}
