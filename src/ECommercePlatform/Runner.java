package ECommercePlatform;

import java.util.ArrayList;

public class Runner {

   public static void main(String[] args) {

        ArrayList<Product> list  = new ArrayList<>();


        Electronics e1 = new Electronics(100, "LED", 2000);
        e1.calculateTax(0.02);
        e1.calculateDiscount();

        Clothing c1= new Clothing(102, "Patiyala Suit", 2500);
        c1.calculateTax(0.08);
        c1.calculateDiscount();

        Groceries g1 = new Groceries(103, "Advance", 15);
        g1.calculateTax(0.05);
        g1.calculateDiscount();

        list.add(e1);
        list.add(c1);
        list.add(g1);

        for (Product e :list){
            System.out.println(e.toString());
        }
    }
}


