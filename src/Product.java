import java.util.ArrayList;
import java.util.Collections;

public class Product {
   private String name;

   private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product" +
                "name='" + name + '\'' +
                ", price=" + price ;
    }

    public static void main(String[] args) {
        ArrayList<Product> arraylist = new ArrayList<>();
        arraylist.add(new Product("Tv", 2000));
        arraylist.add(new Product("Soap", 1));
        arraylist.add(new Product("laptop", 20000));


        for (Product str : arraylist) {
            System.out.println(str);
        }
        System.out.println(arraylist);


        double totalPrices = 0.0;
        for (int i = 0; i < arraylist.size(); i++) {

            totalPrices = totalPrices + arraylist.get(i).getPrice();
        }
        System.out.println("All Totals are: " + totalPrices);

        arraylist.add(0, new Product("glass", 150));
        for (Product str : arraylist) {
            System.out.println(str);
        }
        System.out.println(arraylist);


        arraylist.set(2, new Product("pen", 2));
        for (Product str : arraylist) {
            System.out.println(str);
        }
        System.out.println(arraylist);


        arraylist.remove(3);
        for (Product str : arraylist) {
            System.out.println(str);
        }
        System.out.println(arraylist);


        Collections.reverse(arraylist);

        System.out.println("The sorted ArrayList in reverse order is: " + arraylist);


    }


}

