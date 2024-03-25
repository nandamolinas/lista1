import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Digite um numero:");
        int Numero = scanner.nextInt();

        if (Numero >= 50) {
            System.out.println("Eba, numero maior ou igual que 50!");
        } else {
            System.out.println("Numero menor que 50.");
        }

        scanner.close();
    }
}
