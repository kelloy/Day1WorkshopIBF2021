package shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class shoppingCart {
    static Scanner scan = new Scanner(System.in);
    static cart action = new cart();
    static String items = "";
    static String command = "";
    static String[] arrayOfitem;
    static List<String> shoppinglist = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to your shopping cart");

            while(!"exit".equals(command)){
                command = scan.next();
                items = scan.nextLine();
                items = items.trim();
                
            if("add".equals(command)){
               action.addItem(items);
            }
            else if("delete".equals(command)){
                Integer i = Integer.parseInt(items);
                action.deleteItem(i);
            }
            else if("list".equals(command)){
                action.getList();
            }
            else{
                System.out.println("Invalid Input. Please input \"add\",\"delete\"or \"list\" only or type \"exit\" to escape the program");
            }
        }
        scan.close();
    }
}
    

