import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductsData productsData = new ProductsData();
        productsData.addProduct();
        HashMap<String, Integer> products = productsData.getProducts();
        productsData.printShopAssortment();
        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Basket basket = new FoodBasket(products.size());

        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            basket.addPurchase(product, count);
        }
        long sum = basket.sum(products);
        System.out.println("ИТОГО: " + sum);
    }
}
