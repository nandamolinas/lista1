import java.util.Scanner;

public class Exercicio14 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro termo (a1) da progressao a: ");
        int a1 = scanner.nextInt();

        System.out.print("Digite a razao (r) da progressao a: ");
        int r = scanner.nextInt();

        System.out.print("Digite o valor de n (ordem do termo que deseja encontrar): ");
        int n = scanner.nextInt();

        int an = a1 + (n - 1) * r;

        System.out.println("O " + n + "n-esimo termo da progressao e: " + an);

        scanner.close();
    }  
}
