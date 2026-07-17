package IfElse;
import java.util.Scanner;

public class IsEven {
      public static void main(){
            Scanner scanner = new Scanner(System.in);

            int num = scanner.nextInt();

            if(num % 2 == 0){
                  System.out.println("É Par");
            }else {
                  System.out.println("É Impar");
            }
      }
}
