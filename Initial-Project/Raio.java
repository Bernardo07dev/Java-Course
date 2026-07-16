import java.util.Scanner;

public class Raio{
      public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Que numero você quer a raiz");
            double num1 = scanner.nextDouble();

            double result = Math.sqrt(num1);

            System.out.printf("Seu Raio é: %f", result);
      }
}