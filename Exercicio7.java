import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int Numero = scanner.nextInt();

        if (Numero >= 100 && Numero <= 200) {
            System.out.println("O numero esta dentro do intervalo entre 100 e 200.");
        } else {
            System.out.println("O numero esta fora do intervalo entre 100 e 200.");
        }

        scanner.close();
    }
}
