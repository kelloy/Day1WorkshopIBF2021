package ibf2021d1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {

public static void main(String[] args) {
    System.out.println("Welcome to your shopping cart");
    Scanner scan = new Scanner(System.in);
    String com = scan.next();
    List<String> cart = new ArrayList<>();
   
   while (!com.startsWith("list") && 
          !com.startsWith("add") && 
          !com.startsWith("delete")){
       System.out.println("Please use only list, add or delete.");
       com=scan.next();
       System.out.println(com);
    }

    if(com.equals("list"))
    System.out.println("List is "+ cart);

    if(com.startsWith("add"))

    System.out.println(com);
}
}


    