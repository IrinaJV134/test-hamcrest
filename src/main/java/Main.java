import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {


        List<String> fruits = asList("Apple", "Orange", "Banana", "Grapefruit", "Grapes", "Lemon");


        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println("fruit: " + fruit);
        }
    }
}