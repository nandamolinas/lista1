import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do cilindro: ");
        double Raio = scanner.nextDouble();

        System.out.print("Digite a altura do cilindro: ");
        double Altura = scanner.nextDouble();

        double Volume = 3.14 * Raio * Raio * Altura;

        System.out.println("Volume do cilindro: " + Volume);

        scanner.close();
    } 
}
