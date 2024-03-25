import java.util.Scanner;

public class Exercicio16 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double Nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double Nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double Nota3 = scanner.nextDouble();

        double media = (Nota1 + Nota2 + Nota3) / 3;

        System.out.println("Media: " + media);

        scanner.close();
    }
}
