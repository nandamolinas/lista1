import java.util.Scanner;

public class Exercicio9 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        int A = scanner.nextInt();

        System.out.print("Digite um valor para B: ");
        int B = scanner.nextInt();

        if (A == B) {
            System.out.println("Os numeros sao iguais");
        } else {
            System.out.println("Os numeros sao diferentes");
            int maior = (A > B) ? A : B;
            System.out.println("O maior numero e: " + maior);
        }

        scanner.close();
    }
}
