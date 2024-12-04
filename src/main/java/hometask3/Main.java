package hometask3;

public class Main {
    public static void main (String[] args) {

        Product product1 = new Product("Apple", 2.99);
        Product product2 = new Product ("Orange", 4.58);
        Product product3 = new Product ("Milk", 1.29);
        Product product4 = new Product ("Juice", 3.77);


        PriceList priceList = new PriceList();
        priceList.addProduct(product1);
        priceList.addProduct(product2);
        priceList.addProduct(product3);
        priceList.addProduct(product4);

        System.out.println("Список продуктов:");
        System.out.println(priceList.getProducts());

        priceList.updatePrice("Milk", 5.36);
        System.out.println("Список продуктов с обновленными ценами:");
        System.out.println(priceList.getProducts());

        priceList.getPriceByName("Apple");
        priceList.getPriceByName("Banana");

    }
}
