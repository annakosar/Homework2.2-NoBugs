package hometask3;

public class Product {
    private String product;
    private double price;

    public Product () {

    }
     Product (String product, double price) {
        this.product = product;
        this.price = price;
     }

    public String getProduct () {
        return this.product;
    }

    public double getPrice () {
        return this.price;
    }

    @Override
    public String toString () {
        return product + ", " + price;
    }

}
