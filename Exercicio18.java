import java.util.Scanner;

public class Exercicio18 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double Nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double Nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double Nota3 = scanner.nextDouble();

        double MediaHarmonica = 3 / (1/Nota1 + 1/Nota2 + 1/Nota3);

        System.out.println("Media harmônica: " + MediaHarmonica);

        scanner.close();
    }   
}
