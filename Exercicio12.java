import java.util.Scanner;

public class Exercicio12 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero do mes (1 a 12): ");
        int numeroM = scanner.nextInt();

        String nomeM;

        switch (numeroM) {
            case 1:
                nomeM = "Janeiro";
                break;
            case 2:
                nomeM = "Fevereiro";
                break;
            case 3:
                nomeM = "Marco";
                break;
            case 4:
                nomeM = "Abril";
                break;
            case 5:
                nomeM = "Maio";
                break;
            case 6:
                nomeM = "Junho";
                break;
            case 7:
                nomeM = "Julho";
                break;
            case 8:
                nomeM = "Agosto";
                break;
            case 9:
                nomeM = "Setembro";
                break;
            case 10:
                nomeM = "Outubro";
                break;
            case 11:
                nomeM = "Novembro";
                break;
            case 12:
                nomeM = "Dezembro";
                break;
            default:
                nomeM = null;
                break;
        }

        if (nomeM != null) {
            System.out.println("O mes correspondente ao numero " + numeroM + " é " + nomeM + ".");
        } else {
            System.out.println("Mes invalido.");
        }

        scanner.close();
    }   
}
