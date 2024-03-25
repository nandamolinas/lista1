import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 5: ");
        int numero = scanner.nextInt();

        String NumeroP;

        switch (numero) {
            case 1:
                NumeroP = "Um";
                break;
            case 2:
                NumeroP = "Dois";
                break;
            case 3:
                NumeroP = "Tres";
                break;
            case 4:
                NumeroP = "Quatro";
                break;
            case 5:
                NumeroP = "Cinco";
                break;
            default:
                NumeroP = null;
                break;
        }

        if (NumeroP != null) {
            System.out.println("Numero por extenso: " + NumeroP);
        } else {
            System.out.println("Numero invalido!");
        }

        scanner.close();
    }
}
