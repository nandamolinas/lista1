import java.util.Scanner;

public class Exercicio20 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo de viagem em horas: ");
        double Tempo = scanner.nextDouble();

        System.out.print("Digite a velocidade media em km/h: ");
        double Velocidade = scanner.nextDouble();

        double Litros = Tempo * Velocidade / 12;

        System.out.println("Quantidade de litros de combustivel gastados: " + Litros);

        scanner.close();
    }
}
