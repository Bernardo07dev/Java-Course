package IfElse;
import java.util.Scanner;

public class IsNegative {
      public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            int num = scanner.nextInt();

            if (num > 0){
                  System.out.println("É positivo");
            } else{
                  System.out.println("É Negativo");
            }
      }
      
}
