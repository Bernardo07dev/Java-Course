import java.util.Scanner;

public class Hours {
      public static void main(String[] args){
            Scanner inputs = new Scanner(System.in);

            System.out.print("Fale sua horas: ");
            int hours = inputs.nextInt();
            System.out.print("Quanto você ganha por hora: ");
            int salary = inputs.nextInt();

            int result = salary * hours;
            
            System.out.printf("Você ganha %d$ por dia e %d$ por mês", result, result * 20);
      }
}
