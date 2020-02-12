package module2.mappractice;

import java.util.HashMap;
import java.util.Map;

public class ProductTest {
    public static void main(String[] args) {
        Map<String, Product> productsByName = new HashMap<>();

        Product mountainBike = new Product("Mountain Bike", "A bike which can be used off road", 499.99);
        Product eBike = new Product("E-Bike", "A bike with a battery", 799.99);
        Product cityBike = new Product("City bike", "A lightweight bike for urban travelling", 299.99);

        productsByName.put(mountainBike.getName(), mountainBike);
        productsByName.put(eBike.getName(), eBike);
        productsByName.put(cityBike.getName(), cityBike);


        Product myProduct = productsByName.get("City bike");
        System.out.println(myProduct);

        productsByName.remove("City bike");
        Product myNewPurchase = productsByName.get("City bike");
        System.out.println(myNewPurchase);


        Product milka = new Product("Milka", "Chocolate", 5.400);
        productsByName.put("alabala", milka);

        productsByName.get("alabala");

        System.out.println(productsByName);
    }
}
