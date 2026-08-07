package Polimorfism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Qual a quantidade de produtos? ");
        int product_n = scanner.nextInt();

        for (int number = 1; number <= product_n; number++) {
            System.out.println("Produto #" + number + ":");
            System.out.print("Common, Used or Imported (c/u/i)? ");
            char type = scanner.next().charAt(0);

            System.out.print("Qual o nome do produto? ");
            scanner.nextLine(); // Limpa o buffer do scanner
            String name = scanner.nextLine();

            System.out.print("Qual o preço do produto? ");
            double price = scanner.nextDouble();

            if (type == 'c') {
                list.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.print("Qual a data de fabricação do produto? ");
                String manufactureData = scanner.next();
                list.add(new UsedProduct(name, price, manufactureData));
            } else if (type == 'i') {
                System.out.print("Qual a taxa do produto? ");
                double tax = scanner.nextDouble();
                list.add(new ImportedProduct(name, price, tax));
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product prod : list) {
            prod.priceTag();
        }

        scanner.close();
    }
}