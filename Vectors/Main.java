package Vectors;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Product[] Marketing = new Product[3];

        for (int i=0; i<3; i++){
            String name = s.next();
            Double price = s.nextDouble();
            Marketing[i] = new Product(name, price);
        }

        Marketing[0].getItems();

    }
    
}