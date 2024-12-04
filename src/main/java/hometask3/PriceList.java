package hometask3;

import java.util.HashMap;

public class PriceList {

    private HashMap <String, Double> products;

    public PriceList (HashMap <String, Double> products) {
        this.products = products;
    }

    public PriceList () {
        this.products = new HashMap <> ();
    }

    public HashMap <String, Double> getProducts () {
        return this.products;
    }

    public void addProduct (Product newProduct) {
        this.products.put (newProduct.getProduct(), newProduct.getPrice());
    }

    public void updatePrice (String productName, double newPrice) {
        if (this.products.containsKey (productName)) {
            this.products.put (productName, newPrice);
        }
        else {
            System.out.println("Product with name " + productName + " not found");
        }

    }

    public void getPriceByName (String productName) {
        if (this.products.containsKey (productName)) {
            double price = this.products.get (productName);
            System.out.println("Price of " + productName + " is " + this.products.get(productName));
        }
        else {
            System.out.println("Product with name " + productName + " not found");
        }
    }

}
