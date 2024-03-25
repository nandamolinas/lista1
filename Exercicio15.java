import java.util.Scanner;

public class Exercicio15 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as coordenadas x e y do ponto P1 (formato: x y): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Digite as coordenadas x e y do ponto P2 (formato: x y): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("A distancia entre os pontos P1 e P2 a: " + distancia);

        scanner.close();
    }    
}
