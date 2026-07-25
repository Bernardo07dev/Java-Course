package Vectors;

class Product{
    public String name;
    public double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void getItems(){
        System.out.printf("Nome: %S%nPreço: %.1f", this.name, this.price);
    }

}