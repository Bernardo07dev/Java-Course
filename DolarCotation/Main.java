package DolarCotation;
import java.util.Scanner;

public class Main {
      public static void main(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual o preço do dolar: ");
            double price = scanner.nextDouble();
            System.out.println("Quantos dolares você tem: ");
            double dolar = scanner.nextDouble();

            System.out.println(CurrencyConverter.convertion(dolar, price));
      }
}
