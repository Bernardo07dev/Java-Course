package Constructors;
import java.util.Scanner;

public class Main{
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga o Nome: ");
        String nome = scanner.next();

        Client clienteItau = new Client(1, nome, false, 0);
        clienteItau.getClient();

        System.out.println("Qual o depósito: ");
        double deposit = scanner.nextDouble();

        clienteItau.makeDeposit(deposit);
    }
}