package Polimorfism;

public class UsedProduct extends Product{
    private String manufactureData;

    public UsedProduct(String name, double price, String manufactureData) {
        super(name, price);
        this.manufactureData = manufactureData;
    }

    @Override
    public void priceTag(){
        System.out.printf("O produto %s preço é %.2f , ele é de %s", getName(), getPrice(), manufactureData);
    }

    
}