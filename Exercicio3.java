import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       

       System.out.println("A= Ingrese um primeiro valor inteiro: "); 
       int A = scanner.nextInt();
       System.out.println("B= Ingrese um segundo valor inteiro:");
       int B = scanner.nextInt();

       if (A > B) {
        System.out.println("O valor digitado de A e maior que B");
       }
       if (A < B) {
        System.out.println("O valor digitado de B e maior que A");
       }
       if (A == B) {
        System.out.println("Valor invalido");
       }
        scanner.close();

    }
}
