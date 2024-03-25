import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.println("Valores originais: A = " + A + ", B = " + B);

        int valor1 = A;
        A = B;
        B = valor1;

        System.out.println("Valores trocados: A = " + A + ", B = " + B);



        scanner.close();
    }
}
