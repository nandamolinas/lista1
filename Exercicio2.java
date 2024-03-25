import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int Soma = 0;

       System.out.println("Ingrese un número(Ou 0 para sair): ");
       int Numero = scanner.nextInt();
       

        while (Numero != 0) {
         Soma += Numero;
         System.out.println("Ingrese um segundo numero(Ou 0 para sair): ");
         Numero = scanner.nextInt();
      }
        
      
         System.out.println("A soma dos numeros digitados e: " + Soma);
         scanner.close();

       
    }
}
