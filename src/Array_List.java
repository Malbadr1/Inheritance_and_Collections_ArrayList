import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

    public static void main(String[] args) {


        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Grapes");
        fruitBasket.add("Orange");
        fruitBasket.add("apricot");
        fruitBasket.add("watermelon");
        System.out.println(fruitBasket);


        ArrayList<String> vegetablesBasket = new ArrayList<>();
        vegetablesBasket.add("Tomato");
        vegetablesBasket.add("cucumber");
        vegetablesBasket.add("onion");
        vegetablesBasket.add("lettuce");
        vegetablesBasket.add("potato");
        vegetablesBasket.add("pepper");
        System.out.println(vegetablesBasket);

        System.out.println("the ArrayList  after the modification");
        fruitBasket.addAll(vegetablesBasket);
        for (String i : fruitBasket) {
            System.out.print(i + "\t");

        }


    }
}







