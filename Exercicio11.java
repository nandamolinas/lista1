import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();

        int menor, meio, maior;

        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
            meio = (numero2 <= numero3) ? numero2 : numero3;
            maior = (meio == numero2) ? numero3 : numero2;
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
            meio = (numero1 <= numero3) ? numero1 : numero3;
            maior = (meio == numero1) ? numero3 : numero1;
        } else {
            menor = numero3;
            meio = (numero1 <= numero2) ? numero1 : numero2;
            maior = (meio == numero1) ? numero2 : numero1;
        }

        System.out.println("Numeros em ordem crescente: " + menor + ", " + meio + ", " + maior);

        scanner.close();
    }
}
