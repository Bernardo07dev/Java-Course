package Polimorfism;

import java.sql.Date;

public class ImportedProduct extends Product{
    private double customFee;

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price + customFee);
        this.customFee = customFee;
    }

    @Override
    public void priceTag(){
        System.out.printf("O produto %S preço é %.2f e a taxa é %.2f", getName(), getPrice(), customFee);
    }

    
}