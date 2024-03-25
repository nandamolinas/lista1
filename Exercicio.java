import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int Numero = scanner.nextInt();

       if (Numero > 10) {
        System.out.println("Numero maior que 10!");
       } else {
        System.out.println("Numero menor ou igual a 10!");
       }
       scanner.close();
    }
}