import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i < num + 1; i++){
            int quadrado = i * i;
            int cubo = quadrado * i;
            System.out.printf("%d , quadrado: %d, cubo %d %n", i, quadrado, cubo);
        }
    }
}
