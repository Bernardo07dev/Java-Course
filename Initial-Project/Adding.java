import java.util.Scanner;

public class Adding{
        int num = 14;

        public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);

                System.out.println("De um num: ");
                int num1 = scanner.nextInt();
                System.out.println("De outro num: ");
                int num2 = scanner.nextInt();
                
                System.out.println(num1 + num2);
        }
} 